// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for CacheRules Delete. */
public final class CacheRulesDeleteSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/CacheRuleDelete.json
     */
    /**
     * Sample code: CacheRuleDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cacheRuleDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getCacheRules()
            .delete("myResourceGroup", "myRegistry", "myCacheRule", com.azure.core.util.Context.NONE);
    }
}
