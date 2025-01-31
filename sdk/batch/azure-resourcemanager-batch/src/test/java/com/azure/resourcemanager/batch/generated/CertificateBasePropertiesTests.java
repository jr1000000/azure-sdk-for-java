// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.CertificateBaseProperties;
import com.azure.resourcemanager.batch.models.CertificateFormat;
import org.junit.jupiter.api.Assertions;

public final class CertificateBasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateBaseProperties model =
            BinaryData
                .fromString("{\"thumbprintAlgorithm\":\"tki\",\"thumbprint\":\"xhqyudxorrqnb\",\"format\":\"Pfx\"}")
                .toObject(CertificateBaseProperties.class);
        Assertions.assertEquals("tki", model.thumbprintAlgorithm());
        Assertions.assertEquals("xhqyudxorrqnb", model.thumbprint());
        Assertions.assertEquals(CertificateFormat.PFX, model.format());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateBaseProperties model =
            new CertificateBaseProperties()
                .withThumbprintAlgorithm("tki")
                .withThumbprint("xhqyudxorrqnb")
                .withFormat(CertificateFormat.PFX);
        model = BinaryData.fromObject(model).toObject(CertificateBaseProperties.class);
        Assertions.assertEquals("tki", model.thumbprintAlgorithm());
        Assertions.assertEquals("xhqyudxorrqnb", model.thumbprint());
        Assertions.assertEquals(CertificateFormat.PFX, model.format());
    }
}
