// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.playwrighttesting.fluent.models.QuotaInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of a Quota list operation. */
@Fluent
public final class QuotaListResult {
    /*
     * The Quota items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<QuotaInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of QuotaListResult class. */
    public QuotaListResult() {
    }

    /**
     * Get the value property: The Quota items on this page.
     *
     * @return the value value.
     */
    public List<QuotaInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The Quota items on this page.
     *
     * @param value the value value to set.
     * @return the QuotaListResult object itself.
     */
    public QuotaListResult withValue(List<QuotaInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the QuotaListResult object itself.
     */
    public QuotaListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model QuotaListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuotaListResult.class);
}
