/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for NotificationStatus.
 */
public final class NotificationStatus {
    /** Static value Disabled for NotificationStatus. */
    public static final NotificationStatus DISABLED = new NotificationStatus("Disabled");

    /** Static value Enabled for NotificationStatus. */
    public static final NotificationStatus ENABLED = new NotificationStatus("Enabled");

    private String value;

    /**
     * Creates a custom value for NotificationStatus.
     * @param value the custom value
     */
    public NotificationStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof NotificationStatus)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        NotificationStatus rhs = (NotificationStatus) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}