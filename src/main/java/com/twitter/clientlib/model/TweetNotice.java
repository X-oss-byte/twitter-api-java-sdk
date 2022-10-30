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
import com.twitter.clientlib.model.TweetComplianceSchemaTweet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * TweetNotice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetNotice {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_EVENT_AT = "event_at";
  @SerializedName(SERIALIZED_NAME_EVENT_AT)
  private OffsetDateTime eventAt;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EXTENDED_DETAILS_URL = "extended_details_url";
  @SerializedName(SERIALIZED_NAME_EXTENDED_DETAILS_URL)
  private String extendedDetailsUrl;

  public static final String SERIALIZED_NAME_LABEL_TITLE = "label_title";
  @SerializedName(SERIALIZED_NAME_LABEL_TITLE)
  private String labelTitle;

  public static final String SERIALIZED_NAME_TWEET = "tweet";
  @SerializedName(SERIALIZED_NAME_TWEET)
  private TweetComplianceSchemaTweet tweet;

  public TweetNotice() { 
  }

  public TweetNotice application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * If the label is being applied or removed. Possible values are ‘apply’ or ‘remove’.
   * @return application
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "apply", required = true, value = "If the label is being applied or removed. Possible values are ‘apply’ or ‘remove’.")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public TweetNotice details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Information shown on the Tweet label
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information shown on the Tweet label")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public TweetNotice eventAt(OffsetDateTime eventAt) {
    
    this.eventAt = eventAt;
    return this;
  }

   /**
   * Event time.
   * @return eventAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-07-06T18:40:40Z", required = true, value = "Event time.")

  public OffsetDateTime getEventAt() {
    return eventAt;
  }


  public void setEventAt(OffsetDateTime eventAt) {
    this.eventAt = eventAt;
  }


  public TweetNotice eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of label on the Tweet
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "misleading", required = true, value = "The type of label on the Tweet")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public TweetNotice extendedDetailsUrl(String extendedDetailsUrl) {
    
    this.extendedDetailsUrl = extendedDetailsUrl;
    return this;
  }

   /**
   * Link to more information about this kind of label
   * @return extendedDetailsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to more information about this kind of label")

  public String getExtendedDetailsUrl() {
    return extendedDetailsUrl;
  }


  public void setExtendedDetailsUrl(String extendedDetailsUrl) {
    this.extendedDetailsUrl = extendedDetailsUrl;
  }


  public TweetNotice labelTitle(String labelTitle) {
    
    this.labelTitle = labelTitle;
    return this;
  }

   /**
   * Title/header of the Tweet label
   * @return labelTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title/header of the Tweet label")

  public String getLabelTitle() {
    return labelTitle;
  }


  public void setLabelTitle(String labelTitle) {
    this.labelTitle = labelTitle;
  }


  public TweetNotice tweet(TweetComplianceSchemaTweet tweet) {
    
    this.tweet = tweet;
    return this;
  }

   /**
   * Get tweet
   * @return tweet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TweetComplianceSchemaTweet getTweet() {
    return tweet;
  }


  public void setTweet(TweetComplianceSchemaTweet tweet) {
    this.tweet = tweet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetNotice tweetNotice = (TweetNotice) o;
    return Objects.equals(this.application, tweetNotice.application) &&
        Objects.equals(this.details, tweetNotice.details) &&
        Objects.equals(this.eventAt, tweetNotice.eventAt) &&
        Objects.equals(this.eventType, tweetNotice.eventType) &&
        Objects.equals(this.extendedDetailsUrl, tweetNotice.extendedDetailsUrl) &&
        Objects.equals(this.labelTitle, tweetNotice.labelTitle) &&
        Objects.equals(this.tweet, tweetNotice.tweet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, details, eventAt, eventType, extendedDetailsUrl, labelTitle, tweet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetNotice {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    extendedDetailsUrl: ").append(toIndentedString(extendedDetailsUrl)).append("\n");
    sb.append("    labelTitle: ").append(toIndentedString(labelTitle)).append("\n");
    sb.append("    tweet: ").append(toIndentedString(tweet)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("details");
    openapiFields.add("event_at");
    openapiFields.add("event_type");
    openapiFields.add("extended_details_url");
    openapiFields.add("label_title");
    openapiFields.add("tweet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("application");
    openapiRequiredFields.add("event_at");
    openapiRequiredFields.add("event_type");
    openapiRequiredFields.add("tweet");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetNotice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (TweetNotice.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in TweetNotice is not found in the empty JSON string", TweetNotice.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TweetNotice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if (jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if (jsonObj.get("extended_details_url") != null && !jsonObj.get("extended_details_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extended_details_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extended_details_url").toString()));
      }
      if (jsonObj.get("label_title") != null && !jsonObj.get("label_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_title").toString()));
      }
      // validate the optional field `tweet`
      if (jsonObj.getAsJsonObject("tweet") != null) {
        TweetComplianceSchemaTweet.validateJsonObject(jsonObj.getAsJsonObject("tweet"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetNotice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetNotice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetNotice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetNotice.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetNotice>() {
           @Override
           public void write(JsonWriter out, TweetNotice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetNotice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetNotice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetNotice
  * @throws IOException if the JSON string is invalid with respect to TweetNotice
  */
  public static TweetNotice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetNotice.class);
  }

 /**
  * Convert an instance of TweetNotice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
