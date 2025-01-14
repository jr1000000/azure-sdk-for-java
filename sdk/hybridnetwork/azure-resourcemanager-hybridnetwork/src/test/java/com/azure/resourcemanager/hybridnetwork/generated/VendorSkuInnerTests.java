// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorSkuInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionTemplate;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionType;
import com.azure.resourcemanager.hybridnetwork.models.SkuDeploymentMode;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VendorSkuInnerTests {
    @Test
    public void testDeserialize() {
        VendorSkuInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Accepted\",\"skuType\":\"Firewall\",\"deploymentMode\":\"Unknown\",\"networkFunctionType\":\"VirtualNetworkFunction\",\"preview\":false,\"networkFunctionTemplate\":{\"networkFunctionRoleConfigurations\":[]}},\"id\":\"fufsrpymzi\",\"name\":\"nsez\",\"type\":\"xtbzsgfyccsne\"}")
                .toObject(VendorSkuInner.class);
        Assertions.assertEquals(SkuType.FIREWALL, model.skuType());
        Assertions.assertEquals(SkuDeploymentMode.UNKNOWN, model.deploymentMode());
        Assertions.assertEquals(NetworkFunctionType.VIRTUAL_NETWORK_FUNCTION, model.networkFunctionType());
        Assertions.assertEquals(false, model.preview());
    }

    @Test
    public void testSerialize() {
        VendorSkuInner model =
            new VendorSkuInner()
                .withSkuType(SkuType.FIREWALL)
                .withDeploymentMode(SkuDeploymentMode.UNKNOWN)
                .withNetworkFunctionType(NetworkFunctionType.VIRTUAL_NETWORK_FUNCTION)
                .withPreview(false)
                .withNetworkFunctionTemplate(
                    new NetworkFunctionTemplate().withNetworkFunctionRoleConfigurations(Arrays.asList()));
        model = BinaryData.fromObject(model).toObject(VendorSkuInner.class);
        Assertions.assertEquals(SkuType.FIREWALL, model.skuType());
        Assertions.assertEquals(SkuDeploymentMode.UNKNOWN, model.deploymentMode());
        Assertions.assertEquals(NetworkFunctionType.VIRTUAL_NETWORK_FUNCTION, model.networkFunctionType());
        Assertions.assertEquals(false, model.preview());
    }
}
