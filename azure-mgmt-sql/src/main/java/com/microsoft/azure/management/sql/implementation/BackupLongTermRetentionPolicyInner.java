/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.BackupLongTermRetentionPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A backup long term retention policy.
 */
@JsonFlatten
public class BackupLongTermRetentionPolicyInner extends ProxyResourceInner {
    /**
     * The geo-location where the resource lives.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The status of the backup long term retention policy. Possible values
     * include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "properties.state", required = true)
    private BackupLongTermRetentionPolicyState state;

    /**
     * The azure recovery services backup protection policy resource id.
     */
    @JsonProperty(value = "properties.recoveryServicesBackupPolicyResourceId", required = true)
    private String recoveryServicesBackupPolicyResourceId;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public BackupLongTermRetentionPolicyState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the BackupLongTermRetentionPolicyInner object itself.
     */
    public BackupLongTermRetentionPolicyInner withState(BackupLongTermRetentionPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the recoveryServicesBackupPolicyResourceId value.
     *
     * @return the recoveryServicesBackupPolicyResourceId value
     */
    public String recoveryServicesBackupPolicyResourceId() {
        return this.recoveryServicesBackupPolicyResourceId;
    }

    /**
     * Set the recoveryServicesBackupPolicyResourceId value.
     *
     * @param recoveryServicesBackupPolicyResourceId the recoveryServicesBackupPolicyResourceId value to set
     * @return the BackupLongTermRetentionPolicyInner object itself.
     */
    public BackupLongTermRetentionPolicyInner withRecoveryServicesBackupPolicyResourceId(String recoveryServicesBackupPolicyResourceId) {
        this.recoveryServicesBackupPolicyResourceId = recoveryServicesBackupPolicyResourceId;
        return this;
    }

}