// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.ResponsysObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResponsysObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResponsysObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"ResponsysObject\",\"typeProperties\":{\"tableName\":\"dataxcsdqoxhdenmj\"},\"description\":\"xgrggyciw\",\"structure\":\"dataqinr\",\"schema\":\"datavvmrn\",\"linkedServiceName\":{\"referenceName\":\"rdijox\",\"parameters\":{\"b\":\"datasychdcjggcmpncj\",\"owvfxe\":\"databnoq\",\"irvcpol\":\"datatzgwjeky\",\"ilbdvxlfhlzzgap\":\"datavgppp\"}},\"parameters\":{\"xnroyhthesyw\":{\"type\":\"SecureString\",\"defaultValue\":\"datablscrmzquuzywkgo\"}},\"annotations\":[\"datavg\"],\"folder\":{\"name\":\"c\"},\"\":{\"zyrgrlh\":\"datazcwuejmxlfzl\"}}")
                .toObject(ResponsysObjectDataset.class);
        Assertions.assertEquals("xgrggyciw", model.description());
        Assertions.assertEquals("rdijox", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("xnroyhthesyw").type());
        Assertions.assertEquals("c", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResponsysObjectDataset model =
            new ResponsysObjectDataset()
                .withDescription("xgrggyciw")
                .withStructure("dataqinr")
                .withSchema("datavvmrn")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("rdijox")
                        .withParameters(
                            mapOf(
                                "b",
                                "datasychdcjggcmpncj",
                                "owvfxe",
                                "databnoq",
                                "irvcpol",
                                "datatzgwjeky",
                                "ilbdvxlfhlzzgap",
                                "datavgppp")))
                .withParameters(
                    mapOf(
                        "xnroyhthesyw",
                        new ParameterSpecification()
                            .withType(ParameterType.SECURE_STRING)
                            .withDefaultValue("datablscrmzquuzywkgo")))
                .withAnnotations(Arrays.asList("datavg"))
                .withFolder(new DatasetFolder().withName("c"))
                .withTableName("dataxcsdqoxhdenmj");
        model = BinaryData.fromObject(model).toObject(ResponsysObjectDataset.class);
        Assertions.assertEquals("xgrggyciw", model.description());
        Assertions.assertEquals("rdijox", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("xnroyhthesyw").type());
        Assertions.assertEquals("c", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
