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

package com.google.api.services.compute.model;

/**
 * InstanceGroupManagerResizeRequest represents a request to create a number of VMs: either
 * immediately or by queuing the request for the specified time. This resize request is nested under
 * InstanceGroupManager and the VMs created by this request are added to the owning
 * InstanceGroupManager.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupManagerResizeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The count of instances to create as part of this resize request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer count;

  /**
   * [Output Only] The creation timestamp for this resize request in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The resource type, which is always compute#instanceGroupManagerResizeRequest for
   * resize requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of this resize request. The name must be 1-63 characters long, and comply with
   * RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * When set, defines queing parameters for the requested deferred capacity. When unset, the
   * request starts provisioning immediately, or fails if immediate provisioning is not possible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueuingPolicy queuingPolicy;

  /**
   * [Output Only] The URL for this resize request. The server defines this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output only] Current state of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * [Output only] Status of the request. The Status message is aligned with QueuedResource.status.
   * ResizeRequest.queuing_policy contains the queuing policy as provided by the user; it could have
   * either valid_until_time or valid_until_duration. ResizeRequest.status.queuing_policy always
   * contains absolute time as calculated by the server when the request is queued.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupManagerResizeRequestStatus status;

  /**
   * [Output Only] The URL of a zone where the resize request is located. Populated only for zonal
   * resize requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The count of instances to create as part of this resize request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * The count of instances to create as part of this resize request.
   * @param count count or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setCount(java.lang.Integer count) {
    this.count = count;
    return this;
  }

  /**
   * [Output Only] The creation timestamp for this resize request in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] The creation timestamp for this resize request in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource.
   * @param description description or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
   * @param id id or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The resource type, which is always compute#instanceGroupManagerResizeRequest for
   * resize requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The resource type, which is always compute#instanceGroupManagerResizeRequest for
   * resize requests.
   * @param kind kind or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of this resize request. The name must be 1-63 characters long, and comply with
   * RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this resize request. The name must be 1-63 characters long, and comply with
   * RFC1035.
   * @param name name or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * When set, defines queing parameters for the requested deferred capacity. When unset, the
   * request starts provisioning immediately, or fails if immediate provisioning is not possible.
   * @return value or {@code null} for none
   */
  public QueuingPolicy getQueuingPolicy() {
    return queuingPolicy;
  }

  /**
   * When set, defines queing parameters for the requested deferred capacity. When unset, the
   * request starts provisioning immediately, or fails if immediate provisioning is not possible.
   * @param queuingPolicy queuingPolicy or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setQueuingPolicy(QueuingPolicy queuingPolicy) {
    this.queuingPolicy = queuingPolicy;
    return this;
  }

  /**
   * [Output Only] The URL for this resize request. The server defines this URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The URL for this resize request. The server defines this URL.
   * @param selfLink selfLink or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output only] Current state of the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output only] Current state of the request.
   * @param state state or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output only] Status of the request. The Status message is aligned with QueuedResource.status.
   * ResizeRequest.queuing_policy contains the queuing policy as provided by the user; it could have
   * either valid_until_time or valid_until_duration. ResizeRequest.status.queuing_policy always
   * contains absolute time as calculated by the server when the request is queued.
   * @return value or {@code null} for none
   */
  public InstanceGroupManagerResizeRequestStatus getStatus() {
    return status;
  }

  /**
   * [Output only] Status of the request. The Status message is aligned with QueuedResource.status.
   * ResizeRequest.queuing_policy contains the queuing policy as provided by the user; it could have
   * either valid_until_time or valid_until_duration. ResizeRequest.status.queuing_policy always
   * contains absolute time as calculated by the server when the request is queued.
   * @param status status or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setStatus(InstanceGroupManagerResizeRequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] The URL of a zone where the resize request is located. Populated only for zonal
   * resize requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The URL of a zone where the resize request is located. Populated only for zonal
   * resize requests.
   * @param zone zone or {@code null} for none
   */
  public InstanceGroupManagerResizeRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public InstanceGroupManagerResizeRequest set(String fieldName, Object value) {
    return (InstanceGroupManagerResizeRequest) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupManagerResizeRequest clone() {
    return (InstanceGroupManagerResizeRequest) super.clone();
  }

}
