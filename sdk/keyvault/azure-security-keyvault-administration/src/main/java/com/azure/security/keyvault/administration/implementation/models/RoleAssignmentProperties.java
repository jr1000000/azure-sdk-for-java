// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Role assignment properties. */
@Immutable
public final class RoleAssignmentProperties implements JsonSerializable<RoleAssignmentProperties> {
    /*
     * The role definition ID used in the role assignment.
     */
    private final String roleDefinitionId;

    /*
     * The principal ID assigned to the role. This maps to the ID inside the Active Directory. It can point to a user,
     * service principal, or security group.
     */
    private final String principalId;

    /**
     * Creates an instance of RoleAssignmentProperties class.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @param principalId the principalId value to set.
     */
    public RoleAssignmentProperties(String roleDefinitionId, String principalId) {
        this.roleDefinitionId = roleDefinitionId;
        this.principalId = principalId;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID used in the role assignment.
     *
     * @return the roleDefinitionId value.
     */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Get the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active
     * Directory. It can point to a user, service principal, or security group.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("roleDefinitionId", this.roleDefinitionId);
        jsonWriter.writeStringField("principalId", this.principalId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignmentProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignmentProperties if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoleAssignmentProperties.
     */
    public static RoleAssignmentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean roleDefinitionIdFound = false;
                    String roleDefinitionId = null;
                    boolean principalIdFound = false;
                    String principalId = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("roleDefinitionId".equals(fieldName)) {
                            roleDefinitionId = reader.getString();
                            roleDefinitionIdFound = true;
                        } else if ("principalId".equals(fieldName)) {
                            principalId = reader.getString();
                            principalIdFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (roleDefinitionIdFound && principalIdFound) {
                        RoleAssignmentProperties deserializedRoleAssignmentProperties =
                                new RoleAssignmentProperties(roleDefinitionId, principalId);

                        return deserializedRoleAssignmentProperties;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!roleDefinitionIdFound) {
                        missingProperties.add("roleDefinitionId");
                    }
                    if (!principalIdFound) {
                        missingProperties.add("principalId");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
