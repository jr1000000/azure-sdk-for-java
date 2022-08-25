// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.fluent.models.HealthCheckStatusDetailsInner;
import com.azure.resourcemanager.devcenter.models.HealthCheck;
import com.azure.resourcemanager.devcenter.models.HealthCheckStatusDetails;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class HealthCheckStatusDetailsImpl implements HealthCheckStatusDetails {
    private HealthCheckStatusDetailsInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    HealthCheckStatusDetailsImpl(
        HealthCheckStatusDetailsInner innerObject,
        com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime startDateTime() {
        return this.innerModel().startDateTime();
    }

    public OffsetDateTime endDateTime() {
        return this.innerModel().endDateTime();
    }

    public List<HealthCheck> healthChecks() {
        List<HealthCheck> inner = this.innerModel().healthChecks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public HealthCheckStatusDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}