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
package org.apache.dubbo.remoting;

/**
 * 指出实现类（无论客户端还是服务端）有能力去感知和处理空闲连接。
 * 如果服务端有能力去处理这个空闲连接， 它应该关闭这个连接。
 * 如果客户端有能力去处理这个空闲连接， 它应该发送心跳到服务端。
 * Indicate whether the implementation (for both server and client) has the ability to sense and handle idle connection.
 * If the server has the ability to handle idle connection, it should close the connection when it happens, and if
 * the client has the ability to handle idle connection, it should send the heartbeat to the server.
 */
public interface IdleSensible {
    /**
     * Whether the implementation can sense and handle the idle connection. By default it's false, the implementation
     * relies on dedicated timer to take care of idle connection.
     * 实现类是否可以感知和处理空闲连接， 默认为false, 实现类依赖专门的计时器 关注 空闲连接。
     * @return whether has the ability to handle idle connection  返回是否有能力处理这个空闲连接
     */
    default boolean canHandleIdle() {
        return false;
    }
}
