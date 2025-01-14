// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.fluent.models.ProjectUpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class ProjectUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectUpdateProperties model =
            BinaryData.fromString("{\"description\":\"sezcxtb\"}").toObject(ProjectUpdateProperties.class);
        Assertions.assertEquals("sezcxtb", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectUpdateProperties model = new ProjectUpdateProperties().withDescription("sezcxtb");
        model = BinaryData.fromObject(model).toObject(ProjectUpdateProperties.class);
        Assertions.assertEquals("sezcxtb", model.description());
    }
}
