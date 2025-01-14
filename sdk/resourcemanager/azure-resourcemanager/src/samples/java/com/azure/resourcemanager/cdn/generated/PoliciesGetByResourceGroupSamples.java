// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Policies GetByResourceGroup. */
public final class PoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/WafPolicyGet.json
     */
    /**
     * Sample code: Get Policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getPolicies()
            .getByResourceGroupWithResponse("rg1", "MicrosoftCdnWafPolicy", com.azure.core.util.Context.NONE);
    }
}
