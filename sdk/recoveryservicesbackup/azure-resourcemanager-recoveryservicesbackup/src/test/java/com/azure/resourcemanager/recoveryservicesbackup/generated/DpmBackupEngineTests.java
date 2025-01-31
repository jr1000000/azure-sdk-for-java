// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmBackupEngine;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class DpmBackupEngineTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmBackupEngine model =
            BinaryData
                .fromString(
                    "{\"backupEngineType\":\"DpmBackupEngine\",\"friendlyName\":\"hcmbuocnjrohmbp\",\"backupManagementType\":\"AzureStorage\",\"registrationStatus\":\"ameb\",\"backupEngineState\":\"dyvkfkmr\",\"healthStatus\":\"xne\",\"canReRegister\":false,\"backupEngineId\":\"tod\",\"dpmVersion\":\"pyapucygvoav\",\"azureBackupAgentVersion\":\"nssxlgh\",\"isAzureBackupAgentUpgradeAvailable\":true,\"isDpmUpgradeAvailable\":true,\"extendedInfo\":{\"databaseName\":\"vvpa\",\"protectedItemsCount\":1923565340,\"protectedServersCount\":985288213,\"diskCount\":1996272230,\"usedDiskSpace\":95.06665449392885,\"availableDiskSpace\":80.00245827547123,\"refreshedAt\":\"2021-07-16T01:56:36Z\",\"azureProtectedInstances\":843652539}}")
                .toObject(DpmBackupEngine.class);
        Assertions.assertEquals("hcmbuocnjrohmbp", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("ameb", model.registrationStatus());
        Assertions.assertEquals("dyvkfkmr", model.backupEngineState());
        Assertions.assertEquals("xne", model.healthStatus());
        Assertions.assertEquals(false, model.canReRegister());
        Assertions.assertEquals("tod", model.backupEngineId());
        Assertions.assertEquals("pyapucygvoav", model.dpmVersion());
        Assertions.assertEquals("nssxlgh", model.azureBackupAgentVersion());
        Assertions.assertEquals(true, model.isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(true, model.isDpmUpgradeAvailable());
        Assertions.assertEquals("vvpa", model.extendedInfo().databaseName());
        Assertions.assertEquals(1923565340, model.extendedInfo().protectedItemsCount());
        Assertions.assertEquals(985288213, model.extendedInfo().protectedServersCount());
        Assertions.assertEquals(1996272230, model.extendedInfo().diskCount());
        Assertions.assertEquals(95.06665449392885D, model.extendedInfo().usedDiskSpace());
        Assertions.assertEquals(80.00245827547123D, model.extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-16T01:56:36Z"), model.extendedInfo().refreshedAt());
        Assertions.assertEquals(843652539, model.extendedInfo().azureProtectedInstances());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmBackupEngine model =
            new DpmBackupEngine()
                .withFriendlyName("hcmbuocnjrohmbp")
                .withBackupManagementType(BackupManagementType.AZURE_STORAGE)
                .withRegistrationStatus("ameb")
                .withBackupEngineState("dyvkfkmr")
                .withHealthStatus("xne")
                .withCanReRegister(false)
                .withBackupEngineId("tod")
                .withDpmVersion("pyapucygvoav")
                .withAzureBackupAgentVersion("nssxlgh")
                .withIsAzureBackupAgentUpgradeAvailable(true)
                .withIsDpmUpgradeAvailable(true)
                .withExtendedInfo(
                    new BackupEngineExtendedInfo()
                        .withDatabaseName("vvpa")
                        .withProtectedItemsCount(1923565340)
                        .withProtectedServersCount(985288213)
                        .withDiskCount(1996272230)
                        .withUsedDiskSpace(95.06665449392885D)
                        .withAvailableDiskSpace(80.00245827547123D)
                        .withRefreshedAt(OffsetDateTime.parse("2021-07-16T01:56:36Z"))
                        .withAzureProtectedInstances(843652539));
        model = BinaryData.fromObject(model).toObject(DpmBackupEngine.class);
        Assertions.assertEquals("hcmbuocnjrohmbp", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("ameb", model.registrationStatus());
        Assertions.assertEquals("dyvkfkmr", model.backupEngineState());
        Assertions.assertEquals("xne", model.healthStatus());
        Assertions.assertEquals(false, model.canReRegister());
        Assertions.assertEquals("tod", model.backupEngineId());
        Assertions.assertEquals("pyapucygvoav", model.dpmVersion());
        Assertions.assertEquals("nssxlgh", model.azureBackupAgentVersion());
        Assertions.assertEquals(true, model.isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(true, model.isDpmUpgradeAvailable());
        Assertions.assertEquals("vvpa", model.extendedInfo().databaseName());
        Assertions.assertEquals(1923565340, model.extendedInfo().protectedItemsCount());
        Assertions.assertEquals(985288213, model.extendedInfo().protectedServersCount());
        Assertions.assertEquals(1996272230, model.extendedInfo().diskCount());
        Assertions.assertEquals(95.06665449392885D, model.extendedInfo().usedDiskSpace());
        Assertions.assertEquals(80.00245827547123D, model.extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-16T01:56:36Z"), model.extendedInfo().refreshedAt());
        Assertions.assertEquals(843652539, model.extendedInfo().azureProtectedInstances());
    }
}
