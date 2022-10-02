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


package com.twitter.clientlib.api;

import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.SDKConfig;

public class ApiCommon {
  protected ApiClient localVarApiClient;

  public void setClient(ApiClient apiClient) {
    localVarApiClient = apiClient;
  }

  protected String[] reduceAuthNames(String[] localVarAuthNames) {
    return localVarApiClient.reduceAuthNames(localVarAuthNames);
  }

  public boolean handleRateLimit(ApiException e, Integer retries) throws ApiException {
    boolean retryCall = false;
    if (e.getCode() == 429 && retries > 0) {
      long timeToWait = getTimeToWait(e);
      try {
        Thread.sleep(timeToWait);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
      retryCall = true;
    }
    return retryCall;
  }

  long getTimeToWait(ApiException e) {
    long timeToWait = 1000;

    if (isRateLimitRemaining(e)) {
      List<String> xRateLimitReset = e.getResponseHeaders().get("x-rate-limit-reset");
      if (xRateLimitReset != null && xRateLimitReset.get(0) != null) {
        timeToWait = Long.parseLong(
            xRateLimitReset.get(0)) * 1000 - Calendar.getInstance().getTimeInMillis();
      }
    }
    return timeToWait;
  }

  boolean isRateLimitRemaining(ApiException e) {
    List<String> xRateLimitRemaining = e.getResponseHeaders().get("x-rate-limit-remaining");
    return xRateLimitRemaining != null && xRateLimitRemaining.get(0) != null
        && Long.parseLong(xRateLimitRemaining.get(0)) == 0;
  }

  Set<String> getFields(String fieldName, boolean isExclude, Set<String> fieldValues, Set<String> allFieldsValues) {
    Set<String> result = fieldValues;
    if(isExclude && SDKConfig.isFieldAllowlisted(fieldName) && allFieldsValues != null) {
      result = allFieldsValues.stream().filter(e -> !(fieldValues != null && fieldValues.contains(e))).collect(Collectors.toSet());
    }
    return result;
  }
}

