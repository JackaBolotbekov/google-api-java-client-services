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

package com.google.api.services.cloudtasks.v2beta3.model;

/**
 * LINT.IfChange Request message for BufferTask.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BufferTaskRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Body of the HTTP request. The body can take any generic value. The value is written
   * to the HttpRequest of the [Task].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpBody body;

  /**
   * Optional. Body of the HTTP request. The body can take any generic value. The value is written
   * to the HttpRequest of the [Task].
   * @return value or {@code null} for none
   */
  public HttpBody getBody() {
    return body;
  }

  /**
   * Optional. Body of the HTTP request. The body can take any generic value. The value is written
   * to the HttpRequest of the [Task].
   * @param body body or {@code null} for none
   */
  public BufferTaskRequest setBody(HttpBody body) {
    this.body = body;
    return this;
  }

  @Override
  public BufferTaskRequest set(String fieldName, Object value) {
    return (BufferTaskRequest) super.set(fieldName, value);
  }

  @Override
  public BufferTaskRequest clone() {
    return (BufferTaskRequest) super.clone();
  }

}
