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
 * A grouping of workstation configurations and the associated workstations in that region.
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
public final class WorkstationCluster extends com.google.api.client.json.GenericJson {

  /**
   * Client-specified annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. Status conditions describing the current resource state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Status> conditions;

  static {
    // hack to force ProGuard to consider Status used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Status.class);
  }

  /**
   * Output only. Time when this resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Whether this resource is in degraded mode, in which case it may require user
   * action to restore full functionality. Details can be found in the `conditions` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean degraded;

  /**
   * Output only. Time when this resource was soft-deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Human-readable name for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Checksum computed by the server. May be sent on update and delete requests to ensure that the
   * client has an up-to-date value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Client-specified labels that are applied to the resource and that are also propagated to the
   * underlying Compute Engine resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Full name of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. Name of the Compute Engine network in which instances associated with this cluster
   * will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Configuration for private cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateClusterConfig privateClusterConfig;

  /**
   * Output only. Indicates whether this resource is currently being updated to match its intended
   * state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * Immutable. Name of the Compute Engine subnetwork in which instances associated with this
   * cluster will be created. Must be part of the subnetwork specified for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * Output only. A system-assigned unique identified for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Time when this resource was most recently updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Client-specified annotations.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Client-specified annotations.
   * @param annotations annotations or {@code null} for none
   */
  public WorkstationCluster setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. Status conditions describing the current resource state.
   * @return value or {@code null} for none
   */
  public java.util.List<Status> getConditions() {
    return conditions;
  }

  /**
   * Output only. Status conditions describing the current resource state.
   * @param conditions conditions or {@code null} for none
   */
  public WorkstationCluster setConditions(java.util.List<Status> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Output only. Time when this resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time when this resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public WorkstationCluster setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Whether this resource is in degraded mode, in which case it may require user
   * action to restore full functionality. Details can be found in the `conditions` field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDegraded() {
    return degraded;
  }

  /**
   * Output only. Whether this resource is in degraded mode, in which case it may require user
   * action to restore full functionality. Details can be found in the `conditions` field.
   * @param degraded degraded or {@code null} for none
   */
  public WorkstationCluster setDegraded(java.lang.Boolean degraded) {
    this.degraded = degraded;
    return this;
  }

  /**
   * Output only. Time when this resource was soft-deleted.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. Time when this resource was soft-deleted.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public WorkstationCluster setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Human-readable name for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Human-readable name for this resource.
   * @param displayName displayName or {@code null} for none
   */
  public WorkstationCluster setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Checksum computed by the server. May be sent on update and delete requests to ensure that the
   * client has an up-to-date value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Checksum computed by the server. May be sent on update and delete requests to ensure that the
   * client has an up-to-date value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public WorkstationCluster setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Client-specified labels that are applied to the resource and that are also propagated to the
   * underlying Compute Engine resources.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Client-specified labels that are applied to the resource and that are also propagated to the
   * underlying Compute Engine resources.
   * @param labels labels or {@code null} for none
   */
  public WorkstationCluster setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Full name of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full name of this resource.
   * @param name name or {@code null} for none
   */
  public WorkstationCluster setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. Name of the Compute Engine network in which instances associated with this cluster
   * will be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Immutable. Name of the Compute Engine network in which instances associated with this cluster
   * will be created.
   * @param network network or {@code null} for none
   */
  public WorkstationCluster setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Configuration for private cluster.
   * @return value or {@code null} for none
   */
  public PrivateClusterConfig getPrivateClusterConfig() {
    return privateClusterConfig;
  }

  /**
   * Configuration for private cluster.
   * @param privateClusterConfig privateClusterConfig or {@code null} for none
   */
  public WorkstationCluster setPrivateClusterConfig(PrivateClusterConfig privateClusterConfig) {
    this.privateClusterConfig = privateClusterConfig;
    return this;
  }

  /**
   * Output only. Indicates whether this resource is currently being updated to match its intended
   * state.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. Indicates whether this resource is currently being updated to match its intended
   * state.
   * @param reconciling reconciling or {@code null} for none
   */
  public WorkstationCluster setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * Immutable. Name of the Compute Engine subnetwork in which instances associated with this
   * cluster will be created. Must be part of the subnetwork specified for this cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Immutable. Name of the Compute Engine subnetwork in which instances associated with this
   * cluster will be created. Must be part of the subnetwork specified for this cluster.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public WorkstationCluster setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * Output only. A system-assigned unique identified for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. A system-assigned unique identified for this resource.
   * @param uid uid or {@code null} for none
   */
  public WorkstationCluster setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. Time when this resource was most recently updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time when this resource was most recently updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public WorkstationCluster setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public WorkstationCluster set(String fieldName, Object value) {
    return (WorkstationCluster) super.set(fieldName, value);
  }

  @Override
  public WorkstationCluster clone() {
    return (WorkstationCluster) super.clone();
  }

}
