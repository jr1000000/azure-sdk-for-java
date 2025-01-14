// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TransferToExternalNumber model. */
@Fluent
public final class TransferToExternalNumber {
    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The transferDestination property.
     */
    @JsonProperty(value = "transferDestination")
    private String transferDestination;

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the TransferToExternalNumber object itself.
     */
    public TransferToExternalNumber setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the transferDestination property: The transferDestination property.
     *
     * @return the transferDestination value.
     */
    public String getTransferDestination() {
        return this.transferDestination;
    }

    /**
     * Set the transferDestination property: The transferDestination property.
     *
     * @param transferDestination the transferDestination value to set.
     * @return the TransferToExternalNumber object itself.
     */
    public TransferToExternalNumber setTransferDestination(String transferDestination) {
        this.transferDestination = transferDestination;
        return this;
    }
}
