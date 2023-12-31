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


package com.twitter.clientlib.auth;

import java.util.HashSet;
import java.util.Set;
import com.github.scribejava.core.model.OAuth2AccessToken;

import com.twitter.clientlib.ApiClientCallback;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.ResourceUnauthorizedProblem;
import com.twitter.clientlib.model.SingleTweetLookupResponse;

/**
 * An example of how to refresh OAuth2 access token.
 *
 * Example steps:
 * 1. Set `OAuth2` credentials.
 * 2. Add the `ApiClientCallback` callback.
 * 3. Call `refreshToken()` which will:
 *    a. Update the user token details inside `TwitterApi`.
 *    b. Execute the `callback.onAfterRefreshToken()`
 * 4. Call the API.
 */

public class OAuth20RefreshToken {

  public static void main(String[] args) {
    OAuth20RefreshToken example = new OAuth20RefreshToken();
    TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
        System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
        System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
        System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));

    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    apiInstance.addCallback(new MaintainToken());

    try {
      apiInstance.refreshToken();
    } catch (Exception e) {
      System.err.println("Error while trying to refresh existing token : " + e);
      e.printStackTrace();
      return;
    }
    example.callApi(apiInstance);
  }

  public void callApi(TwitterApi apiInstance) {
    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
      // findTweetById
      SingleTweetLookupResponse result = apiInstance.tweets().findTweetById("20", null, tweetFields, null,
          null, null, null);
      if (result.getErrors() != null && result.getErrors().size() > 0) {
        System.out.println("Error:");
        result.getErrors().forEach(e -> {
          System.out.println(e.toString());
          if (e instanceof ResourceUnauthorizedProblem) {
            System.out.println(e.getTitle() + " " + e.getDetail());
          }
        });
      } else {
        System.out.println("findTweetById - Tweet Text: " + result.toString());
      }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class MaintainToken implements ApiClientCallback {
  @Override
  public void onAfterRefreshToken(OAuth2AccessToken accessToken) {
    System.out.println("access: " + accessToken.getAccessToken());
    System.out.println("refresh: " + accessToken.getRefreshToken());
  }
}
