/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.admob.v1.model;

/**
 * Describes an AdMob app for a specific platform (For example: Android or iOS).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class App extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The approval state for the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appApprovalState;

  /**
   * The externally visible ID of the app which can be used to integrate with the AdMob SDK. This is
   * a read only property. Example: ca-app-pub-9876543210987654~0123456789
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * Immutable. The information for an app that is linked to an app store. This field is present if
   * and only if the app is linked to an app store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppLinkedAppInfo linkedAppInfo;

  /**
   * The information for an app that is not linked to any app store. After an app is linked, this
   * information is still retrivable. If no name is provided for the app upon creation, a
   * placeholder name will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppManualAppInfo manualAppInfo;

  /**
   * Resource name for this app. Format is accounts/{publisher_id}/apps/{app_id_fragment} Example:
   * accounts/pub-9876543210987654/apps/0123456789
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Describes the platform of the app. Limited to "IOS" and "ANDROID".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * Output only. The approval state for the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppApprovalState() {
    return appApprovalState;
  }

  /**
   * Output only. The approval state for the app.
   * @param appApprovalState appApprovalState or {@code null} for none
   */
  public App setAppApprovalState(java.lang.String appApprovalState) {
    this.appApprovalState = appApprovalState;
    return this;
  }

  /**
   * The externally visible ID of the app which can be used to integrate with the AdMob SDK. This is
   * a read only property. Example: ca-app-pub-9876543210987654~0123456789
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * The externally visible ID of the app which can be used to integrate with the AdMob SDK. This is
   * a read only property. Example: ca-app-pub-9876543210987654~0123456789
   * @param appId appId or {@code null} for none
   */
  public App setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Immutable. The information for an app that is linked to an app store. This field is present if
   * and only if the app is linked to an app store.
   * @return value or {@code null} for none
   */
  public AppLinkedAppInfo getLinkedAppInfo() {
    return linkedAppInfo;
  }

  /**
   * Immutable. The information for an app that is linked to an app store. This field is present if
   * and only if the app is linked to an app store.
   * @param linkedAppInfo linkedAppInfo or {@code null} for none
   */
  public App setLinkedAppInfo(AppLinkedAppInfo linkedAppInfo) {
    this.linkedAppInfo = linkedAppInfo;
    return this;
  }

  /**
   * The information for an app that is not linked to any app store. After an app is linked, this
   * information is still retrivable. If no name is provided for the app upon creation, a
   * placeholder name will be used.
   * @return value or {@code null} for none
   */
  public AppManualAppInfo getManualAppInfo() {
    return manualAppInfo;
  }

  /**
   * The information for an app that is not linked to any app store. After an app is linked, this
   * information is still retrivable. If no name is provided for the app upon creation, a
   * placeholder name will be used.
   * @param manualAppInfo manualAppInfo or {@code null} for none
   */
  public App setManualAppInfo(AppManualAppInfo manualAppInfo) {
    this.manualAppInfo = manualAppInfo;
    return this;
  }

  /**
   * Resource name for this app. Format is accounts/{publisher_id}/apps/{app_id_fragment} Example:
   * accounts/pub-9876543210987654/apps/0123456789
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name for this app. Format is accounts/{publisher_id}/apps/{app_id_fragment} Example:
   * accounts/pub-9876543210987654/apps/0123456789
   * @param name name or {@code null} for none
   */
  public App setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Describes the platform of the app. Limited to "IOS" and "ANDROID".
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * Describes the platform of the app. Limited to "IOS" and "ANDROID".
   * @param platform platform or {@code null} for none
   */
  public App setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  @Override
  public App set(String fieldName, Object value) {
    return (App) super.set(fieldName, value);
  }

  @Override
  public App clone() {
    return (App) super.clone();
  }

}
