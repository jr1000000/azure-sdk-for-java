// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metadata category.
 *
 * <p>Categories are used to group other metadata entities.
 */
@Fluent
public final class MetadataCategory {
    /*
     * The ID of the category
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The display name of the category
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * The description of the category
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The related metadata items for the category
     */
    @JsonProperty(value = "related")
    private MetadataCategoryRelated related;

    /**
     * Creates an instance of MetadataCategory class.
     *
     * @param id the id value to set.
     * @param displayName the displayName value to set.
     */
    @JsonCreator
    public MetadataCategory(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "displayName", required = true) String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    /**
     * Get the id property: The ID of the category.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name of the category.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description of the category.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the category.
     *
     * @param description the description value to set.
     * @return the MetadataCategory object itself.
     */
    public MetadataCategory setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the related property: The related metadata items for the category.
     *
     * @return the related value.
     */
    public MetadataCategoryRelated getRelated() {
        return this.related;
    }

    /**
     * Set the related property: The related metadata items for the category.
     *
     * @param related the related value to set.
     * @return the MetadataCategory object itself.
     */
    public MetadataCategory setRelated(MetadataCategoryRelated related) {
        this.related = related;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getId() == null) {
            throw new IllegalArgumentException("Missing required property id in model MetadataCategory");
        }
        if (getDisplayName() == null) {
            throw new IllegalArgumentException("Missing required property displayName in model MetadataCategory");
        }
        if (getRelated() != null) {
            getRelated().validate();
        }
    }
}
