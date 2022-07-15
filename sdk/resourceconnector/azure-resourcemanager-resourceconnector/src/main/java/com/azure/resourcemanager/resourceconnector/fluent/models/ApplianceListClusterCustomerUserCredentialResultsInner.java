// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.resourceconnector.models.ApplianceCredentialKubeconfig;
import com.azure.resourcemanager.resourceconnector.models.SshKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The List Cluster Customer User Credential Results appliance. */
@Immutable
public final class ApplianceListClusterCustomerUserCredentialResultsInner {
    /*
     * The list of appliance kubeconfigs.
     */
    @JsonProperty(value = "kubeconfigs", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplianceCredentialKubeconfig> kubeconfigs;

    /*
     * Map of Customer User Public and Private SSH Keys
     */
    @JsonProperty(value = "sshKeys", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SshKey> sshKeys;

    /**
     * Get the kubeconfigs property: The list of appliance kubeconfigs.
     *
     * @return the kubeconfigs value.
     */
    public List<ApplianceCredentialKubeconfig> kubeconfigs() {
        return this.kubeconfigs;
    }

    /**
     * Get the sshKeys property: Map of Customer User Public and Private SSH Keys.
     *
     * @return the sshKeys value.
     */
    public Map<String, SshKey> sshKeys() {
        return this.sshKeys;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kubeconfigs() != null) {
            kubeconfigs().forEach(e -> e.validate());
        }
        if (sshKeys() != null) {
            sshKeys()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}