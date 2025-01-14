// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.BackupVaultResource;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreState;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupVaultsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Enabled\"}},\"provisioningState\":\"Succeeded\",\"resourceMoveState\":\"MoveSucceeded\",\"resourceMoveDetails\":{\"operationId\":\"wyrpgogtqxepnyl\",\"startTimeUtc\":\"uajlyj\",\"completionTimeUtc\":\"vofqzhvfc\",\"sourceResourcePath\":\"yfm\",\"targetResourcePath\":\"uxrkjp\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"Off\",\"retentionDurationInDays\":77.28442995264712},\"immutabilitySettings\":{\"state\":\"Locked\"}},\"storageSettings\":[{\"datastoreType\":\"ArchiveStore\",\"type\":\"LocallyRedundant\"}],\"isVaultProtectedByResourceGuard\":false,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"Enabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Disabled\"}},\"secureScore\":\"Minimum\"},\"identity\":{\"principalId\":\"gvmnvuqeq\",\"tenantId\":\"dspastjbkkdmfl\",\"type\":\"stmjlxrri\",\"userAssignedIdentities\":{\"eewchpxlktw\":{\"principalId\":\"3e4e6d4b-3b37-47c2-88f7-a9756da0e940\",\"clientId\":\"5f40efbf-ad8a-490c-b4df-e3b41f3f45d2\"},\"iycslevuf\":{\"principalId\":\"874c4d45-f68c-4563-8220-ee31fd84546c\",\"clientId\":\"f4567b4b-bbe8-4f61-a4b3-765ee4c0f8e6\"},\"cktyh\":{\"principalId\":\"fffa31af-ed5c-4139-af6c-997be1fcebe2\",\"clientId\":\"353aea24-6cf1-4c30-9b53-eafc1400508e\"}}},\"eTag\":\"qedcgzulwm\",\"location\":\"qzz\",\"tags\":{\"krvq\":\"vpglydz\",\"oepry\":\"ev\",\"wytpzdmovz\":\"t\"},\"id\":\"fvaawzqa\",\"name\":\"f\",\"type\":\"gzuriglaecxndt\"}]}";

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

        DataProtectionManager manager =
            DataProtectionManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BackupVaultResource> response = manager.backupVaults().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qzz", response.iterator().next().location());
        Assertions.assertEquals("vpglydz", response.iterator().next().tags().get("krvq"));
        Assertions.assertEquals("qedcgzulwm", response.iterator().next().etag());
        Assertions.assertEquals("stmjlxrri", response.iterator().next().identity().type());
        Assertions
            .assertEquals(
                AlertsState.ENABLED,
                response
                    .iterator()
                    .next()
                    .properties()
                    .monitoringSettings()
                    .azureMonitorAlertSettings()
                    .alertsForAllJobFailures());
        Assertions
            .assertEquals(
                SoftDeleteState.OFF,
                response.iterator().next().properties().securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(
                77.28442995264712D,
                response
                    .iterator()
                    .next()
                    .properties()
                    .securitySettings()
                    .softDeleteSettings()
                    .retentionDurationInDays());
        Assertions
            .assertEquals(
                ImmutabilityState.LOCKED,
                response.iterator().next().properties().securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                StorageSettingStoreTypes.ARCHIVE_STORE,
                response.iterator().next().properties().storageSettings().get(0).datastoreType());
        Assertions
            .assertEquals(
                StorageSettingTypes.LOCALLY_REDUNDANT,
                response.iterator().next().properties().storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.ENABLED,
                response.iterator().next().properties().featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.DISABLED,
                response.iterator().next().properties().featureSettings().crossRegionRestoreSettings().state());
    }
}
