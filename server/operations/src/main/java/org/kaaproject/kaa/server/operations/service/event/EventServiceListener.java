/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.operations.service.event;

import org.kaaproject.kaa.server.operations.service.akka.messages.core.user.UserConfigurationUpdate;

public interface EventServiceListener {

    void onEvent(RemoteEndpointEvent event);
    
    void onConfigurationUpdate(UserConfigurationUpdate update);

    void onRouteInfo(GlobalRouteInfo routeInfo);

    void onRouteInfo(RouteInfo routeInfo);

    void onUserRouteInfo(UserRouteInfo routeInfo);

    void onServerError(String serverId);
}
