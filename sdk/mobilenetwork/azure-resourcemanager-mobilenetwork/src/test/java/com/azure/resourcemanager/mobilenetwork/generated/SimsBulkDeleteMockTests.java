// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import com.azure.resourcemanager.mobilenetwork.models.SimDeleteList;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SimsBulkDeleteMockTests {
    @Test
    public void testBulkDelete() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"xra\",\"name\":\"uqd\",\"status\":\"rxmrgchbapx\",\"resourceId\":\"y\",\"startTime\":\"2021-02-28T15:19:21Z\",\"endTime\":\"2021-07-26T21:09:16Z\",\"percentComplete\":35.908896510494316,\"properties\":\"datascgdu\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AsyncOperationStatus response =
            manager
                .sims()
                .bulkDelete(
                    "vodrrslblxydkxr",
                    "vvbxiwkgfbqljnq",
                    new SimDeleteList().withSims(Arrays.asList("ychocokulehu", "qlrqffaweyurk", "hy")),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xra", response.id());
        Assertions.assertEquals("uqd", response.name());
        Assertions.assertEquals("rxmrgchbapx", response.status());
        Assertions.assertEquals("y", response.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-28T15:19:21Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-26T21:09:16Z"), response.endTime());
        Assertions.assertEquals(35.908896510494316D, response.percentComplete());
    }
}
