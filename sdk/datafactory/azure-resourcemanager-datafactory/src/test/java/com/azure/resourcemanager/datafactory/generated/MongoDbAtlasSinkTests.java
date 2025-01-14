// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbAtlasSink;

public final class MongoDbAtlasSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbAtlasSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"MongoDbAtlasSink\",\"writeBehavior\":\"datarvtaul\",\"writeBatchSize\":\"dataqvtpkodijcn\",\"writeBatchTimeout\":\"datao\",\"sinkRetryCount\":\"datavcyqjjxhijbfi\",\"sinkRetryWait\":\"datahoxule\",\"maxConcurrentConnections\":\"datadbirhgjmph\",\"disableMetricsCollection\":\"datacdhjmpnvgkx\",\"\":{\"b\":\"dataljtkuyvytfuqzst\",\"i\":\"datapyfawkj\",\"zvsc\":\"datakf\",\"cokafaqqipvnvdz\":\"datadbkl\"}}")
                .toObject(MongoDbAtlasSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbAtlasSink model =
            new MongoDbAtlasSink()
                .withWriteBatchSize("dataqvtpkodijcn")
                .withWriteBatchTimeout("datao")
                .withSinkRetryCount("datavcyqjjxhijbfi")
                .withSinkRetryWait("datahoxule")
                .withMaxConcurrentConnections("datadbirhgjmph")
                .withDisableMetricsCollection("datacdhjmpnvgkx")
                .withWriteBehavior("datarvtaul");
        model = BinaryData.fromObject(model).toObject(MongoDbAtlasSink.class);
    }
}
