// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ConfigurationProperties;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationProperties model =
            BinaryData
                .fromString(
                    "{\"value\":\"dvxzbncblylpst\",\"description\":\"hh\",\"defaultValue\":\"rzdzucerscdnt\",\"dataType\":\"Integer\",\"allowedValues\":\"iwjmygtdssls\",\"source\":\"mweriofzpy\",\"isDynamicConfig\":false,\"isReadOnly\":false,\"isConfigPendingRestart\":false,\"unit\":\"ets\",\"documentationLink\":\"szhedplvw\"}")
                .toObject(ConfigurationProperties.class);
        Assertions.assertEquals("dvxzbncblylpst", model.value());
        Assertions.assertEquals("mweriofzpy", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationProperties model =
            new ConfigurationProperties().withValue("dvxzbncblylpst").withSource("mweriofzpy");
        model = BinaryData.fromObject(model).toObject(ConfigurationProperties.class);
        Assertions.assertEquals("dvxzbncblylpst", model.value());
        Assertions.assertEquals("mweriofzpy", model.source());
    }
}
