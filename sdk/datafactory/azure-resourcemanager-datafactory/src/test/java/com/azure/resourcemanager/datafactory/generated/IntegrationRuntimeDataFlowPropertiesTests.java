// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowComputeType;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeDataFlowPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeDataFlowProperties model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"MemoryOptimized\",\"coreCount\":1804017472,\"timeToLive\":672092871,\"cleanup\":true,\"customProperties\":[{\"name\":\"scsd\",\"value\":\"ymktcwmiv\"}],\"\":{\"dcozwxux\":\"datazegnglafnfgazagh\",\"utuhvemg\":\"datar\",\"xlx\":\"datalssolqypv\",\"vgdojcvzfcmxmjp\":\"datahvrkqv\"}}")
                .toObject(IntegrationRuntimeDataFlowProperties.class);
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.computeType());
        Assertions.assertEquals(1804017472, model.coreCount());
        Assertions.assertEquals(672092871, model.timeToLive());
        Assertions.assertEquals(true, model.cleanup());
        Assertions.assertEquals("scsd", model.customProperties().get(0).name());
        Assertions.assertEquals("ymktcwmiv", model.customProperties().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeDataFlowProperties model =
            new IntegrationRuntimeDataFlowProperties()
                .withComputeType(DataFlowComputeType.MEMORY_OPTIMIZED)
                .withCoreCount(1804017472)
                .withTimeToLive(672092871)
                .withCleanup(true)
                .withCustomProperties(
                    Arrays
                        .asList(
                            new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem()
                                .withName("scsd")
                                .withValue("ymktcwmiv")))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDataFlowProperties.class);
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.computeType());
        Assertions.assertEquals(1804017472, model.coreCount());
        Assertions.assertEquals(672092871, model.timeToLive());
        Assertions.assertEquals(true, model.cleanup());
        Assertions.assertEquals("scsd", model.customProperties().get(0).name());
        Assertions.assertEquals("ymktcwmiv", model.customProperties().get(0).value());
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
