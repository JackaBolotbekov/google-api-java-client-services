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

package com.google.api.services.iam.v2.model;

/**
 * Data for an IAM policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIamV2Policy extends com.google.api.client.json.GenericJson {

  /**
   * A key-value map to store arbitrary metadata for the `Policy`. Keys can be up to 63 characters.
   * Values can be up to 255 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The time when the `Policy` was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time when the `Policy` was deleted. Empty if the policy is not deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * A user-specified description of the `Policy`. This value can be up to 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * An opaque tag that identifies the current version of the `Policy`. IAM uses this value to help
   * manage concurrent updates, so they do not cause one update to be overwritten by another. If
   * this field is present in a CreatePolicy request, the value is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The kind of the `Policy`. Always contains the value `DenyPolicy`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Immutable. The resource name of the `Policy`, which must be unique. Format:
   * `policies/{attachment_point}/denypolicies/{policy_id}` The attachment point is identified by
   * its URL-encoded full resource name, which means that the forward-slash character, `/`, must be
   * written as `%2F`. For example, `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-
   * project/denypolicies/my-deny-policy`. For organizations and folders, use the numeric ID in the
   * full resource name. For projects, requests can use the alphanumeric or the numeric ID.
   * Responses always contain the numeric ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of rules that specify the behavior of the `Policy`. All of the rules should be of the
   * `kind` specified in the `Policy`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleIamV2PolicyRule> rules;

  /**
   * Immutable. The globally unique ID of the `Policy`. Assigned automatically when the `Policy` is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The time when the `Policy` was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * A key-value map to store arbitrary metadata for the `Policy`. Keys can be up to 63 characters.
   * Values can be up to 255 characters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * A key-value map to store arbitrary metadata for the `Policy`. Keys can be up to 63 characters.
   * Values can be up to 255 characters.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleIamV2Policy setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The time when the `Policy` was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the `Policy` was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleIamV2Policy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time when the `Policy` was deleted. Empty if the policy is not deleted.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The time when the `Policy` was deleted. Empty if the policy is not deleted.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public GoogleIamV2Policy setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * A user-specified description of the `Policy`. This value can be up to 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A user-specified description of the `Policy`. This value can be up to 63 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleIamV2Policy setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * An opaque tag that identifies the current version of the `Policy`. IAM uses this value to help
   * manage concurrent updates, so they do not cause one update to be overwritten by another. If
   * this field is present in a CreatePolicy request, the value is ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * An opaque tag that identifies the current version of the `Policy`. IAM uses this value to help
   * manage concurrent updates, so they do not cause one update to be overwritten by another. If
   * this field is present in a CreatePolicy request, the value is ignored.
   * @param etag etag or {@code null} for none
   */
  public GoogleIamV2Policy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The kind of the `Policy`. Always contains the value `DenyPolicy`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. The kind of the `Policy`. Always contains the value `DenyPolicy`.
   * @param kind kind or {@code null} for none
   */
  public GoogleIamV2Policy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Immutable. The resource name of the `Policy`, which must be unique. Format:
   * `policies/{attachment_point}/denypolicies/{policy_id}` The attachment point is identified by
   * its URL-encoded full resource name, which means that the forward-slash character, `/`, must be
   * written as `%2F`. For example, `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-
   * project/denypolicies/my-deny-policy`. For organizations and folders, use the numeric ID in the
   * full resource name. For projects, requests can use the alphanumeric or the numeric ID.
   * Responses always contain the numeric ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name of the `Policy`, which must be unique. Format:
   * `policies/{attachment_point}/denypolicies/{policy_id}` The attachment point is identified by
   * its URL-encoded full resource name, which means that the forward-slash character, `/`, must be
   * written as `%2F`. For example, `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-
   * project/denypolicies/my-deny-policy`. For organizations and folders, use the numeric ID in the
   * full resource name. For projects, requests can use the alphanumeric or the numeric ID.
   * Responses always contain the numeric ID.
   * @param name name or {@code null} for none
   */
  public GoogleIamV2Policy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of rules that specify the behavior of the `Policy`. All of the rules should be of the
   * `kind` specified in the `Policy`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleIamV2PolicyRule> getRules() {
    return rules;
  }

  /**
   * A list of rules that specify the behavior of the `Policy`. All of the rules should be of the
   * `kind` specified in the `Policy`.
   * @param rules rules or {@code null} for none
   */
  public GoogleIamV2Policy setRules(java.util.List<GoogleIamV2PolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Immutable. The globally unique ID of the `Policy`. Assigned automatically when the `Policy` is
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Immutable. The globally unique ID of the `Policy`. Assigned automatically when the `Policy` is
   * created.
   * @param uid uid or {@code null} for none
   */
  public GoogleIamV2Policy setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The time when the `Policy` was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the `Policy` was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleIamV2Policy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleIamV2Policy set(String fieldName, Object value) {
    return (GoogleIamV2Policy) super.set(fieldName, value);
  }

  @Override
  public GoogleIamV2Policy clone() {
    return (GoogleIamV2Policy) super.clone();
  }

}
