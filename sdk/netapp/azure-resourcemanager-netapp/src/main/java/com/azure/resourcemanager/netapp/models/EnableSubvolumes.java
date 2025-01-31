// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Flag indicating whether subvolume operations are enabled on the volume. */
public final class EnableSubvolumes extends ExpandableStringEnum<EnableSubvolumes> {
    /** Static value Enabled for EnableSubvolumes. */
    public static final EnableSubvolumes ENABLED = fromString("Enabled");

    /** Static value Disabled for EnableSubvolumes. */
    public static final EnableSubvolumes DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of EnableSubvolumes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnableSubvolumes() {
    }

    /**
     * Creates or finds a EnableSubvolumes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnableSubvolumes.
     */
    @JsonCreator
    public static EnableSubvolumes fromString(String name) {
        return fromString(name, EnableSubvolumes.class);
    }

    /**
     * Gets known EnableSubvolumes values.
     *
     * @return known EnableSubvolumes values.
     */
    public static Collection<EnableSubvolumes> values() {
        return values(EnableSubvolumes.class);
    }
}
