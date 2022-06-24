// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.orbital.fluent.models.AvailableGroundStationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for the AvailableGroundStations API service call. */
@Fluent
public final class AvailableGroundStationListResult {
    /*
     * A list of ground station resources.
     */
    @JsonProperty(value = "value")
    private List<AvailableGroundStationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of ground station resources.
     *
     * @return the value value.
     */
    public List<AvailableGroundStationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ground station resources.
     *
     * @param value the value value to set.
     * @return the AvailableGroundStationListResult object itself.
     */
    public AvailableGroundStationListResult withValue(List<AvailableGroundStationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}