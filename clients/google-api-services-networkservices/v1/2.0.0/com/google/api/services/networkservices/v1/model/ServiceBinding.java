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

package com.google.api.services.networkservices.v1.model;

/**
 * ServiceBinding is the resource that defines a Service Directory Service to be used in a
 * BackendService resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceBinding extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Set of label tags associated with the ServiceBinding resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Name of the ServiceBinding resource. It matches pattern
   * `projects/locations/global/serviceBindings/service_binding_name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The full Service Directory Service name of the format
   * projects/locations/namespaces/services
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * Output only. The timestamp when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public ServiceBinding setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @param description description or {@code null} for none
   */
  public ServiceBinding setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Set of label tags associated with the ServiceBinding resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Set of label tags associated with the ServiceBinding resource.
   * @param labels labels or {@code null} for none
   */
  public ServiceBinding setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Name of the ServiceBinding resource. It matches pattern
   * `projects/locations/global/serviceBindings/service_binding_name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the ServiceBinding resource. It matches pattern
   * `projects/locations/global/serviceBindings/service_binding_name`.
   * @param name name or {@code null} for none
   */
  public ServiceBinding setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The full Service Directory Service name of the format
   * projects/locations/namespaces/services
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Required. The full Service Directory Service name of the format
   * projects/locations/namespaces/services
   * @param service service or {@code null} for none
   */
  public ServiceBinding setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public ServiceBinding setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ServiceBinding set(String fieldName, Object value) {
    return (ServiceBinding) super.set(fieldName, value);
  }

  @Override
  public ServiceBinding clone() {
    return (ServiceBinding) super.clone();
  }

}
