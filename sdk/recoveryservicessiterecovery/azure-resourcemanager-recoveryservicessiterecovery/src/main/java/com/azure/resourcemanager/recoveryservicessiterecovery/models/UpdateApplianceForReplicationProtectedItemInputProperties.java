// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update appliance for protected item input properties. */
@Fluent
public final class UpdateApplianceForReplicationProtectedItemInputProperties {
    /*
     * The target appliance Id.
     */
    @JsonProperty(value = "targetApplianceId", required = true)
    private String targetApplianceId;

    /*
     * The provider specific input to update replication protected item.
     */
    @JsonProperty(value = "providerSpecificDetails", required = true)
    private UpdateReplicationProtectedItemProviderSpecificInput providerSpecificDetails;

    /** Creates an instance of UpdateApplianceForReplicationProtectedItemInputProperties class. */
    public UpdateApplianceForReplicationProtectedItemInputProperties() {
    }

    /**
     * Get the targetApplianceId property: The target appliance Id.
     *
     * @return the targetApplianceId value.
     */
    public String targetApplianceId() {
        return this.targetApplianceId;
    }

    /**
     * Set the targetApplianceId property: The target appliance Id.
     *
     * @param targetApplianceId the targetApplianceId value to set.
     * @return the UpdateApplianceForReplicationProtectedItemInputProperties object itself.
     */
    public UpdateApplianceForReplicationProtectedItemInputProperties withTargetApplianceId(String targetApplianceId) {
        this.targetApplianceId = targetApplianceId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider specific input to update replication protected item.
     *
     * @return the providerSpecificDetails value.
     */
    public UpdateReplicationProtectedItemProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific input to update replication protected item.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the UpdateApplianceForReplicationProtectedItemInputProperties object itself.
     */
    public UpdateApplianceForReplicationProtectedItemInputProperties withProviderSpecificDetails(
        UpdateReplicationProtectedItemProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetApplianceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetApplianceId in model"
                            + " UpdateApplianceForReplicationProtectedItemInputProperties"));
        }
        if (providerSpecificDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerSpecificDetails in model"
                            + " UpdateApplianceForReplicationProtectedItemInputProperties"));
        } else {
            providerSpecificDetails().validate();
        }
    }

    private static final ClientLogger LOGGER =
        new ClientLogger(UpdateApplianceForReplicationProtectedItemInputProperties.class);
}
