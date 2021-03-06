/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.event;

import java.util.EventObject;

import org.switchyard.ServiceDomain;

/**
 * Fired when domain is going to be shut down.
 */
public class DomainShutdownEvent extends EventObject {

    private static final long serialVersionUID = 8880993695548773898L;

    /**
     * Creates new event object.
     * 
     * @param source Service domain which will be stopped.
     */
    public DomainShutdownEvent(ServiceDomain source) {
        super(source);
    }

    /**
     * Gets domain associated with this event.
     * 
     * @return Domain.
     */
    public ServiceDomain getDomain() {
        return (ServiceDomain) super.getSource();
    }
}
