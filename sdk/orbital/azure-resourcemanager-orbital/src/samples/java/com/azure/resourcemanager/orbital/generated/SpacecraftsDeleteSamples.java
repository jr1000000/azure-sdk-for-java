// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.Context;

/** Samples for Spacecrafts Delete. */
public final class SpacecraftsDeleteSamples {
    /*
     * x-ms-original-file: specification/orbital/resource-manager/Microsoft.Orbital/stable/2022-03-01/examples/SpacecraftDelete.json
     */
    /**
     * Sample code: Delete Spacecraft.
     *
     * @param manager Entry point to OrbitalManager.
     */
    public static void deleteSpacecraft(com.azure.resourcemanager.orbital.OrbitalManager manager) {
        manager.spacecrafts().delete("contoso-Rgp", "CONTOSO_SAT", Context.NONE);
    }
}