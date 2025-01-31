// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of PacketCapture. */
public interface PacketCapture {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the provisioningState property: The provisioning state of the packet capture session resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: The status of the packet capture session.
     *
     * @return the status value.
     */
    PacketCaptureStatus status();

    /**
     * Gets the reason property: The reason the current packet capture session state.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the captureStartTime property: The start time of the packet capture session.
     *
     * @return the captureStartTime value.
     */
    OffsetDateTime captureStartTime();

    /**
     * Gets the networkInterfaces property: List of network interfaces to capture on.
     *
     * @return the networkInterfaces value.
     */
    List<String> networkInterfaces();

    /**
     * Gets the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are
     * truncated. The default "0" means the entire packet is captured.
     *
     * @return the bytesToCapturePerPacket value.
     */
    Long bytesToCapturePerPacket();

    /**
     * Gets the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @return the totalBytesPerSession value.
     */
    Long totalBytesPerSession();

    /**
     * Gets the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @return the timeLimitInSeconds value.
     */
    Integer timeLimitInSeconds();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner object.
     *
     * @return the inner object.
     */
    PacketCaptureInner innerModel();

    /** The entirety of the PacketCapture definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The PacketCapture definition stages. */
    interface DefinitionStages {
        /** The first stage of the PacketCapture definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the PacketCapture definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, packetCoreControlPlaneName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param packetCoreControlPlaneName The name of the packet core control plane.
             * @return the next definition stage.
             */
            WithCreate withExistingPacketCoreControlPlane(String resourceGroupName, String packetCoreControlPlaneName);
        }

        /**
         * The stage of the PacketCapture definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithNetworkInterfaces,
                DefinitionStages.WithBytesToCapturePerPacket,
                DefinitionStages.WithTotalBytesPerSession,
                DefinitionStages.WithTimeLimitInSeconds {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PacketCapture create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PacketCapture create(Context context);
        }

        /** The stage of the PacketCapture definition allowing to specify networkInterfaces. */
        interface WithNetworkInterfaces {
            /**
             * Specifies the networkInterfaces property: List of network interfaces to capture on..
             *
             * @param networkInterfaces List of network interfaces to capture on.
             * @return the next definition stage.
             */
            WithCreate withNetworkInterfaces(List<String> networkInterfaces);
        }

        /** The stage of the PacketCapture definition allowing to specify bytesToCapturePerPacket. */
        interface WithBytesToCapturePerPacket {
            /**
             * Specifies the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes
             * are truncated. The default "0" means the entire packet is captured..
             *
             * @param bytesToCapturePerPacket Number of bytes captured per packet, the remaining bytes are truncated.
             *     The default "0" means the entire packet is captured.
             * @return the next definition stage.
             */
            WithCreate withBytesToCapturePerPacket(Long bytesToCapturePerPacket);
        }

        /** The stage of the PacketCapture definition allowing to specify totalBytesPerSession. */
        interface WithTotalBytesPerSession {
            /**
             * Specifies the totalBytesPerSession property: Maximum size of the capture output..
             *
             * @param totalBytesPerSession Maximum size of the capture output.
             * @return the next definition stage.
             */
            WithCreate withTotalBytesPerSession(Long totalBytesPerSession);
        }

        /** The stage of the PacketCapture definition allowing to specify timeLimitInSeconds. */
        interface WithTimeLimitInSeconds {
            /**
             * Specifies the timeLimitInSeconds property: Maximum duration of the capture session in seconds..
             *
             * @param timeLimitInSeconds Maximum duration of the capture session in seconds.
             * @return the next definition stage.
             */
            WithCreate withTimeLimitInSeconds(Integer timeLimitInSeconds);
        }
    }

    /**
     * Begins update for the PacketCapture resource.
     *
     * @return the stage of resource update.
     */
    PacketCapture.Update update();

    /** The template for PacketCapture update. */
    interface Update
        extends UpdateStages.WithNetworkInterfaces,
            UpdateStages.WithBytesToCapturePerPacket,
            UpdateStages.WithTotalBytesPerSession,
            UpdateStages.WithTimeLimitInSeconds {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PacketCapture apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PacketCapture apply(Context context);
    }

    /** The PacketCapture update stages. */
    interface UpdateStages {
        /** The stage of the PacketCapture update allowing to specify networkInterfaces. */
        interface WithNetworkInterfaces {
            /**
             * Specifies the networkInterfaces property: List of network interfaces to capture on..
             *
             * @param networkInterfaces List of network interfaces to capture on.
             * @return the next definition stage.
             */
            Update withNetworkInterfaces(List<String> networkInterfaces);
        }

        /** The stage of the PacketCapture update allowing to specify bytesToCapturePerPacket. */
        interface WithBytesToCapturePerPacket {
            /**
             * Specifies the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes
             * are truncated. The default "0" means the entire packet is captured..
             *
             * @param bytesToCapturePerPacket Number of bytes captured per packet, the remaining bytes are truncated.
             *     The default "0" means the entire packet is captured.
             * @return the next definition stage.
             */
            Update withBytesToCapturePerPacket(Long bytesToCapturePerPacket);
        }

        /** The stage of the PacketCapture update allowing to specify totalBytesPerSession. */
        interface WithTotalBytesPerSession {
            /**
             * Specifies the totalBytesPerSession property: Maximum size of the capture output..
             *
             * @param totalBytesPerSession Maximum size of the capture output.
             * @return the next definition stage.
             */
            Update withTotalBytesPerSession(Long totalBytesPerSession);
        }

        /** The stage of the PacketCapture update allowing to specify timeLimitInSeconds. */
        interface WithTimeLimitInSeconds {
            /**
             * Specifies the timeLimitInSeconds property: Maximum duration of the capture session in seconds..
             *
             * @param timeLimitInSeconds Maximum duration of the capture session in seconds.
             * @return the next definition stage.
             */
            Update withTimeLimitInSeconds(Integer timeLimitInSeconds);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PacketCapture refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PacketCapture refresh(Context context);

    /**
     * Stop a packet capture session.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    AsyncOperationStatus stop();

    /**
     * Stop a packet capture session.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    AsyncOperationStatus stop(Context context);
}
