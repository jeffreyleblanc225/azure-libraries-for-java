/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v2.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for VirtualNetworkGatewayConnectionStatus.
 */
public final class VirtualNetworkGatewayConnectionStatus extends ExpandableStringEnum<VirtualNetworkGatewayConnectionStatus> {
    /**
     * Static value Unknown for VirtualNetworkGatewayConnectionStatus.
     */
    public static final VirtualNetworkGatewayConnectionStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value Connecting for VirtualNetworkGatewayConnectionStatus.
     */
    public static final VirtualNetworkGatewayConnectionStatus CONNECTING = fromString("Connecting");

    /**
     * Static value Connected for VirtualNetworkGatewayConnectionStatus.
     */
    public static final VirtualNetworkGatewayConnectionStatus CONNECTED = fromString("Connected");

    /**
     * Static value NotConnected for VirtualNetworkGatewayConnectionStatus.
     */
    public static final VirtualNetworkGatewayConnectionStatus NOT_CONNECTED = fromString("NotConnected");

    /**
     * Creates or finds a VirtualNetworkGatewayConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkGatewayConnectionStatus.
     */
    @JsonCreator
    public static VirtualNetworkGatewayConnectionStatus fromString(String name) {
        return fromString(name, VirtualNetworkGatewayConnectionStatus.class);
    }

    /**
     * @return known VirtualNetworkGatewayConnectionStatus values.
     */
    public static Collection<VirtualNetworkGatewayConnectionStatus> values() {
        return values(VirtualNetworkGatewayConnectionStatus.class);
    }
}