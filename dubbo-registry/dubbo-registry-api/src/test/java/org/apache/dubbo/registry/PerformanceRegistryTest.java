/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.registry;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.common.utils.NetUtils;

import org.junit.jupiter.api.Test;

/**
 * RegistryPerformanceTest
 *
 */
public class PerformanceRegistryTest  {

    private static final Logger logger = LoggerFactory.getLogger(PerformanceRegistryTest.class);

    @Test
    public void testRegistry() {
        // read server info from property
        if (PerformanceUtils.getProperty("server", null) == null) {
            logger.warn("Please set -Dserver=127.0.0.1:9090");
            return;
        }
        final int base = PerformanceUtils.getIntProperty("base", 0);
        final int concurrent = PerformanceUtils.getIntProperty("concurrent", 100);
        int r = PerformanceUtils.getIntProperty("runs", 1000);
        final int runs = r > 0 ? r : Integer.MAX_VALUE;
        ExtensionLoader<RegistryFactory> extensionLoader = ExtensionLoader.getExtensionLoader(RegistryFactory.class);
        RegistryFactory adaptiveExtension = extensionLoader.getAdaptiveExtension();
        final Registry registry = adaptiveExtension.getRegistry(URL.valueOf("simple://admin:hello1234@" + PerformanceUtils.getProperty("server", "10.20.153.28:9090")));

        //        for (int i = 0; i < concurrent; i++) {
//            final int t = i;
//            new Thread(new Runnable() {
//                public void run() {
//                    for (int j = 0; j < runs; j++) {
//                        registry.register(URL.valueOf("remote://" + NetUtils.getLocalHost() + ":8080/demoService" + t + "_" + j + "?version=1.0.0&application=demo&dubbo=2.0&interface=" + "org.apache.dubbo.demo.DemoService" + (base + t) + "_" + (base + j)));
        registry.register(URL.valueOf("remote://" + NetUtils.getLocalHost() + ":8080/demoService" + 0 + "_" + 0 + "?version=1.0.0&application=demo&dubbo=2.0&interface=" + "org.apache.dubbo.demo.DemoService" + (base + 0) + "_" + (base + 0)));
//                    }
//                }
//            }).start();
//        }
        synchronized (PerformanceRegistryTest.class) {
            while (true) {
                try {
                    PerformanceRegistryTest.class.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

}