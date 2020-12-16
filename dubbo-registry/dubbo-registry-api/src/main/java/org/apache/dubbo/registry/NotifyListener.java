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
import org.apache.dubbo.registry.client.event.listener.ServiceInstancesChangedListener;

import java.util.List;

/**
 * NotifyListener. (API, Prototype, ThreadSafe)
 *
 * @see org.apache.dubbo.registry.RegistryService#subscribe(URL, NotifyListener)
 */
public interface NotifyListener {

    /**
     * Triggered when a service change notification is received.
     * 当一个服务改变的时候触发
     * <p>
     * Notify needs to support the contract: <br>  通知必须支持以下规则。
     * 1. Always notifications on the service interface and the dimension of the data type. that is, won't notify part of the same type data belonging to one service.
     *      Users do not need to compare the results of the previous notification.<br>
     *    总是以服务接口和数据类型维度进行全量通知， 也就是，不会通知一个服务的相同类型的部分数据。用户不需要比较上次通知的结果。
     * 2. The first notification at a subscription must be a full notification of all types of data of a service.<br>
     *    第一次订阅的通知，必须是一个服务的所有类型的全量通知。
     * 3. At the time of change, different types of data are allowed to be notified separately, e.g.: providers, consumers, routers, overrides. It allows only one of these types to be notified, but the data of this type must be full, not incremental.<br>
     *    变更时，不同类型的数据允许分开通知，例如，providers, consumers, routers, overrides. 允许其中一个类型被通知，但是这个类型的数据必须是全量的，而不是增量的。
     * 4. If a data type is empty, need to notify a empty protocol with category parameter identification of url data.<br>
     *    如果一个数据类型是空的， 需要通知一个 有category参数标识和empty协议的URL.
     * 5. The order of notifications to be guaranteed by the notifications(That is, the implementation of the registry). Such as: single thread push, queue serialization, and version comparison.<br>
     *    通知者需要保证通知的顺序性（也就是Registry的实现类） ， 例如： 单线程推送，队列序列化，版本对比。
     * @param urls The list of registered information , is always not empty. The meaning is the same as the return value of {@link org.apache.dubbo.registry.RegistryService#lookup(URL)}.
     *             注册信息列表， 永远都不会为空， 这意味着和lookup()返回的值是相同的。
     */
    void notify(List<URL> urls);

    default void addServiceListener(ServiceInstancesChangedListener instanceListener) {
    }

}