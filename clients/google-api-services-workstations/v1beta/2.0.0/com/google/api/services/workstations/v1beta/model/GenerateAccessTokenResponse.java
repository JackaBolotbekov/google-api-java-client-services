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

package com.google.api.services.workstations.v1beta.model;

/**
 * Response message for GenerateAccessToken.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Workstations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenerateAccessTokenResponse extends com.google.api.client.json.GenericJson {

  /**
   * The generated bearer access token. To use this token, include it in an Authorization header of
   * an HTTP request sent to the associated workstation's hostname, for example, `Authorization:
   * Bearer `.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessToken;

  /**
   * Time at which the generated token will expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The generated bearer access token. To use this token, include it in an Authorization header of
   * an HTTP request sent to the associated workstation's hostname, for example, `Authorization:
   * Bearer `.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessToken() {
    return accessToken;
  }

  /**
   * The generated bearer access token. To use this token, include it in an Authorization header of
   * an HTTP request sent to the associated workstation's hostname, for example, `Authorization:
   * Bearer `.
   * @param accessToken accessToken or {@code null} for none
   */
  public GenerateAccessTokenResponse setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Time at which the generated token will expire.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Time at which the generated token will expire.
   * @param expireTime expireTime or {@code null} for none
   */
  public GenerateAccessTokenResponse setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  @Override
  public GenerateAccessTokenResponse set(String fieldName, Object value) {
    return (GenerateAccessTokenResponse) super.set(fieldName, value);
  }

  @Override
  public GenerateAccessTokenResponse clone() {
    return (GenerateAccessTokenResponse) super.clone();
  }

}
