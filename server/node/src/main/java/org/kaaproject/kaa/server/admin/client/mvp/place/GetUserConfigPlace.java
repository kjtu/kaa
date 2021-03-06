/*
 * Copyright 2014-2016 CyberVision, Inc.
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
package org.kaaproject.kaa.server.admin.client.mvp.place;

import com.google.gwt.place.shared.Prefix;
import com.google.web.bindery.event.shared.EventBus;
import org.kaaproject.kaa.server.admin.client.util.Utils;


public class GetUserConfigPlace extends EndpointUsersPlace {

    public GetUserConfigPlace(String applicationId) {
        super(applicationId);
    }

    @Prefix(value = "getUserConfig")
    public static class Tokenizer extends EndpointUsersPlace.Tokenizer<GetUserConfigPlace> {

        @Override
        protected GetUserConfigPlace getPlaceImpl(String applicationId) {
            return new GetUserConfigPlace(applicationId);
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GetUserConfigPlace other = (GetUserConfigPlace) obj;
        if (applicationId == null) {
            if (other.applicationId != null) {
                return false;
            }
        } else if (!applicationId.equals(other.applicationId)) {
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return Utils.constants.getConfiguration();
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public TreePlaceDataProvider getDataProvider(EventBus eventBus) {
        return null;
    }

}
