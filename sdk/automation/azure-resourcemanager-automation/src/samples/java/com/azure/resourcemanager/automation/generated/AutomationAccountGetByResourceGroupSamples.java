// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for AutomationAccount GetByResourceGroup. */
public final class AutomationAccountGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/stable/2021-06-22/examples/getAutomationAccount.json
     */
    /**
     * Sample code: Get automation account.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void getAutomationAccount(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.automationAccounts().getByResourceGroupWithResponse("rg", "myAutomationAccount9", Context.NONE);
    }
}