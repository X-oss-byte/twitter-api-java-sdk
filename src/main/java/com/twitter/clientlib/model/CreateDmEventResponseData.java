/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * CreateDmEventResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDmEventResponseData {
  public static final String SERIALIZED_NAME_DM_CONVERSATION_ID = "dm_conversation_id";
  @SerializedName(SERIALIZED_NAME_DM_CONVERSATION_ID)
  private String dmConversationId;

  public static final String SERIALIZED_NAME_DM_EVENT_ID = "dm_event_id";
  @SerializedName(SERIALIZED_NAME_DM_EVENT_ID)
  private String dmEventId;

  public CreateDmEventResponseData() { 
  }

  public CreateDmEventResponseData dmConversationId(String dmConversationId) {
    
    this.dmConversationId = dmConversationId;
    return this;
  }

   /**
   * Unique identifier of a DM conversation. This can either be a numeric string, or a pair of numeric strings separated by a &#39;-&#39; character in the case of one-on-one DM Conversations.
   * @return dmConversationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123123123-456456456", required = true, value = "Unique identifier of a DM conversation. This can either be a numeric string, or a pair of numeric strings separated by a '-' character in the case of one-on-one DM Conversations.")

  public String getDmConversationId() {
    return dmConversationId;
  }


  public void setDmConversationId(String dmConversationId) {
    this.dmConversationId = dmConversationId;
  }


  public CreateDmEventResponseData dmEventId(String dmEventId) {
    
    this.dmEventId = dmEventId;
    return this;
  }

   /**
   * Unique identifier of a DM Event.
   * @return dmEventId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1146654567674912769", required = true, value = "Unique identifier of a DM Event.")

  public String getDmEventId() {
    return dmEventId;
  }


  public void setDmEventId(String dmEventId) {
    this.dmEventId = dmEventId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDmEventResponseData createDmEventResponseData = (CreateDmEventResponseData) o;
    return Objects.equals(this.dmConversationId, createDmEventResponseData.dmConversationId) &&
        Objects.equals(this.dmEventId, createDmEventResponseData.dmEventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dmConversationId, dmEventId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDmEventResponseData {\n");
    sb.append("    dmConversationId: ").append(toIndentedString(dmConversationId)).append("\n");
    sb.append("    dmEventId: ").append(toIndentedString(dmEventId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("dm_conversation_id");
    openapiFields.add("dm_event_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dm_conversation_id");
    openapiRequiredFields.add("dm_event_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateDmEventResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (CreateDmEventResponseData.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDmEventResponseData is not found in the empty JSON string", CreateDmEventResponseData.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDmEventResponseData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("dm_conversation_id") != null && !jsonObj.get("dm_conversation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dm_conversation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dm_conversation_id").toString()));
      }
      if (jsonObj.get("dm_event_id") != null && !jsonObj.get("dm_event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dm_event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dm_event_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDmEventResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDmEventResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDmEventResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDmEventResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDmEventResponseData>() {
           @Override
           public void write(JsonWriter out, CreateDmEventResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDmEventResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDmEventResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDmEventResponseData
  * @throws IOException if the JSON string is invalid with respect to CreateDmEventResponseData
  */
  public static CreateDmEventResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDmEventResponseData.class);
  }

 /**
  * Convert an instance of CreateDmEventResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
