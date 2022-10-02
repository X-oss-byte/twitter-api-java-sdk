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


import com.github.scribejava.core.model.OAuth2AccessToken;

import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiClientCallback;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.SDKConfig;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.TwitterCredentialsOAuth2;


public class TwitterApi {
  private final BookmarksApi bookmarks = new BookmarksApi();
  private final ComplianceApi compliance = new ComplianceApi();
  private final GeneralApi general = new GeneralApi();
  private final ListsApi lists = new ListsApi();
  private final SpacesApi spaces = new SpacesApi();
  private final TweetsApi tweets = new TweetsApi();
  private final UsersApi users = new UsersApi();
  private ApiClient localVarApiClient = new ApiClient();

  public TwitterApi(TwitterCredentialsBearer credentials) {
    localVarApiClient = new ApiClient();
    localVarApiClient.setTwitterCredentials(credentials);
    init();
  }

  public TwitterApi(TwitterCredentialsOAuth2 credentials) {
    localVarApiClient = new ApiClient();
    localVarApiClient.setTwitterCredentials(credentials);
    init();
  }

  public TwitterApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
    init();
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  private void init() {
    String basePath = System.getenv("TWITTER_API_BASE_PATH");
    localVarApiClient.setBasePath(basePath != null ? basePath : "https://api.twitter.com");
    new SDKConfig();
    initApis();
  }

  private void initApis() {
    bookmarks.setClient(localVarApiClient);
    compliance.setClient(localVarApiClient);
    general.setClient(localVarApiClient);
    lists.setClient(localVarApiClient);
    spaces.setClient(localVarApiClient);
    tweets.setClient(localVarApiClient);
    users.setClient(localVarApiClient);
  }

  public BookmarksApi bookmarks() {
    return bookmarks;
  }
  public ComplianceApi compliance() {
    return compliance;
  }
  public GeneralApi general() {
    return general;
  }
  public ListsApi lists() {
    return lists;
  }
  public SpacesApi spaces() {
    return spaces;
  }
  public TweetsApi tweets() {
    return tweets;
  }
  public UsersApi users() {
    return users;
  }

  public OAuth2AccessToken refreshToken() throws ApiException {
    return localVarApiClient.refreshToken();
  }

  public void addCallback(ApiClientCallback toAdd) {
    localVarApiClient.addCallback(toAdd);
  }
}
