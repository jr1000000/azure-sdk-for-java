// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.EntityReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeEntityReferenceType;
import com.azure.resourcemanager.datafactory.models.PackageStore;
import org.junit.jupiter.api.Assertions;

public final class PackageStoreTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PackageStore model =
            BinaryData
                .fromString(
                    "{\"name\":\"ubru\",\"packageStoreLinkedService\":{\"type\":\"IntegrationRuntimeReference\",\"referenceName\":\"uoyrbdkgqdm\"}}")
                .toObject(PackageStore.class);
        Assertions.assertEquals("ubru", model.name());
        Assertions
            .assertEquals(
                IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
                model.packageStoreLinkedService().type());
        Assertions.assertEquals("uoyrbdkgqdm", model.packageStoreLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PackageStore model =
            new PackageStore()
                .withName("ubru")
                .withPackageStoreLinkedService(
                    new EntityReference()
                        .withType(IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE)
                        .withReferenceName("uoyrbdkgqdm"));
        model = BinaryData.fromObject(model).toObject(PackageStore.class);
        Assertions.assertEquals("ubru", model.name());
        Assertions
            .assertEquals(
                IntegrationRuntimeEntityReferenceType.INTEGRATION_RUNTIME_REFERENCE,
                model.packageStoreLinkedService().type());
        Assertions.assertEquals("uoyrbdkgqdm", model.packageStoreLinkedService().referenceName());
    }
}
