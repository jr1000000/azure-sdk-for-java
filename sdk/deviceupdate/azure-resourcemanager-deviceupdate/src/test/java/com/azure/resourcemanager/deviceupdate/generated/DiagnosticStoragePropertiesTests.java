// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.AuthenticationType;
import com.azure.resourcemanager.deviceupdate.models.DiagnosticStorageProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DiagnosticStoragePropertiesTests {
    @Test
    public void testDeserialize() {
        DiagnosticStorageProperties model =
            BinaryData
                .fromString(
                    "{\"authenticationType\":\"KeyBased\",\"connectionString\":\"sfqpteehz\",\"resourceId\":\"vypyqrimzinpv\"}")
                .toObject(DiagnosticStorageProperties.class);
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.authenticationType());
        Assertions.assertEquals("sfqpteehz", model.connectionString());
        Assertions.assertEquals("vypyqrimzinpv", model.resourceId());
    }

    @Test
    public void testSerialize() {
        DiagnosticStorageProperties model =
            new DiagnosticStorageProperties()
                .withAuthenticationType(AuthenticationType.KEY_BASED)
                .withConnectionString("sfqpteehz")
                .withResourceId("vypyqrimzinpv");
        model = BinaryData.fromObject(model).toObject(DiagnosticStorageProperties.class);
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.authenticationType());
        Assertions.assertEquals("sfqpteehz", model.connectionString());
        Assertions.assertEquals("vypyqrimzinpv", model.resourceId());
    }
}
