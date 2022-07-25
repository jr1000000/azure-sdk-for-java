// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.FailoverGroupReadOnlyEndpoint;
import com.azure.resourcemanager.sql.models.FailoverGroupReadWriteEndpoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a failover group update. */
@Fluent
public final class FailoverGroupUpdateProperties {
    /*
     * Read-write endpoint of the failover group instance.
     */
    @JsonProperty(value = "readWriteEndpoint")
    private FailoverGroupReadWriteEndpoint readWriteEndpoint;

    /*
     * Read-only endpoint of the failover group instance.
     */
    @JsonProperty(value = "readOnlyEndpoint")
    private FailoverGroupReadOnlyEndpoint readOnlyEndpoint;

    /*
     * List of databases in the failover group.
     */
    @JsonProperty(value = "databases")
    private List<String> databases;

    /**
     * Get the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @return the readWriteEndpoint value.
     */
    public FailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * Set the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @param readWriteEndpoint the readWriteEndpoint value to set.
     * @return the FailoverGroupUpdateProperties object itself.
     */
    public FailoverGroupUpdateProperties withReadWriteEndpoint(FailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.readWriteEndpoint = readWriteEndpoint;
        return this;
    }

    /**
     * Get the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @return the readOnlyEndpoint value.
     */
    public FailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }

    /**
     * Set the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @param readOnlyEndpoint the readOnlyEndpoint value to set.
     * @return the FailoverGroupUpdateProperties object itself.
     */
    public FailoverGroupUpdateProperties withReadOnlyEndpoint(FailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.readOnlyEndpoint = readOnlyEndpoint;
        return this;
    }

    /**
     * Get the databases property: List of databases in the failover group.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: List of databases in the failover group.
     *
     * @param databases the databases value to set.
     * @return the FailoverGroupUpdateProperties object itself.
     */
    public FailoverGroupUpdateProperties withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (readWriteEndpoint() != null) {
            readWriteEndpoint().validate();
        }
        if (readOnlyEndpoint() != null) {
            readOnlyEndpoint().validate();
        }
    }
}