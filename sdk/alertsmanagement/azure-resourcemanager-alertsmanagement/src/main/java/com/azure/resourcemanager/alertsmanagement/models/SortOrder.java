// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SortOrder. */
public final class SortOrder extends ExpandableStringEnum<SortOrder> {
    /** Static value asc for SortOrder. */
    public static final SortOrder ASC = fromString("asc");

    /** Static value desc for SortOrder. */
    public static final SortOrder DESC = fromString("desc");

    /**
     * Creates or finds a SortOrder from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SortOrder.
     */
    @JsonCreator
    public static SortOrder fromString(String name) {
        return fromString(name, SortOrder.class);
    }

    /**
     * Gets known SortOrder values.
     *
     * @return known SortOrder values.
     */
    public static Collection<SortOrder> values() {
        return values(SortOrder.class);
    }
}