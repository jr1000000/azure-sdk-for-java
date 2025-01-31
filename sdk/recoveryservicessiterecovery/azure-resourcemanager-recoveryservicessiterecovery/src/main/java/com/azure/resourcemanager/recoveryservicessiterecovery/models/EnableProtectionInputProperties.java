// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enable protection input properties. */
@Fluent
public final class EnableProtectionInputProperties {
    /*
     * The Policy Id.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /*
     * The protectable item Id.
     */
    @JsonProperty(value = "protectableItemId")
    private String protectableItemId;

    /*
     * The ReplicationProviderInput. For HyperVReplicaAzure provider, it will be AzureEnableProtectionInput object. For
     * San provider, it will be SanEnableProtectionInput object. For HyperVReplicaAzure provider, it can be null.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private EnableProtectionProviderSpecificInput providerSpecificDetails;

    /** Creates an instance of EnableProtectionInputProperties class. */
    public EnableProtectionInputProperties() {
    }

    /**
     * Get the policyId property: The Policy Id.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The Policy Id.
     *
     * @param policyId the policyId value to set.
     * @return the EnableProtectionInputProperties object itself.
     */
    public EnableProtectionInputProperties withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the protectableItemId property: The protectable item Id.
     *
     * @return the protectableItemId value.
     */
    public String protectableItemId() {
        return this.protectableItemId;
    }

    /**
     * Set the protectableItemId property: The protectable item Id.
     *
     * @param protectableItemId the protectableItemId value to set.
     * @return the EnableProtectionInputProperties object itself.
     */
    public EnableProtectionInputProperties withProtectableItemId(String protectableItemId) {
        this.protectableItemId = protectableItemId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The ReplicationProviderInput. For HyperVReplicaAzure provider, it will
     * be AzureEnableProtectionInput object. For San provider, it will be SanEnableProtectionInput object. For
     * HyperVReplicaAzure provider, it can be null.
     *
     * @return the providerSpecificDetails value.
     */
    public EnableProtectionProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The ReplicationProviderInput. For HyperVReplicaAzure provider, it will
     * be AzureEnableProtectionInput object. For San provider, it will be SanEnableProtectionInput object. For
     * HyperVReplicaAzure provider, it can be null.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the EnableProtectionInputProperties object itself.
     */
    public EnableProtectionInputProperties withProviderSpecificDetails(
        EnableProtectionProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}
