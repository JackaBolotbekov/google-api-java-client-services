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

package com.google.api.services.identitytoolkit.v2.model;

/**
 * Options related to MultiFactor Authentication for the project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig extends com.google.api.client.json.GenericJson {

  /**
   * A list of usable second factors for this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enabledProviders;

  /**
   * Whether MultiFactor Authentication has been enabled for this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A list of usable second factors for this project.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnabledProviders() {
    return enabledProviders;
  }

  /**
   * A list of usable second factors for this project.
   * @param enabledProviders enabledProviders or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig setEnabledProviders(java.util.List<java.lang.String> enabledProviders) {
    this.enabledProviders = enabledProviders;
    return this;
  }

  /**
   * Whether MultiFactor Authentication has been enabled for this project.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Whether MultiFactor Authentication has been enabled for this project.
   * @param state state or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig clone() {
    return (GoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig) super.clone();
  }

}
