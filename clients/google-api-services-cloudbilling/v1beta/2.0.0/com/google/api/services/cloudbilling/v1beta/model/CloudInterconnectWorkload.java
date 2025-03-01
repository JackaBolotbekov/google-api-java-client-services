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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * Specifies usage for Cloud Interconnect resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudInterconnectWorkload extends com.google.api.client.json.GenericJson {

  /**
   * VLAN attachment used for interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VlanAttachment> interconnectAttachments;

  /**
   * Vlan attachment type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interconnectType;

  /**
   * Interconnect circuit link type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkType;

  /**
   * Interconnect usage. This is specified as a unitless quantity which indicates the number of
   * circuit provisioned in interconnect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usage provisionedLinkCount;

  /**
   * VLAN attachment used for interconnect.
   * @return value or {@code null} for none
   */
  public java.util.List<VlanAttachment> getInterconnectAttachments() {
    return interconnectAttachments;
  }

  /**
   * VLAN attachment used for interconnect.
   * @param interconnectAttachments interconnectAttachments or {@code null} for none
   */
  public CloudInterconnectWorkload setInterconnectAttachments(java.util.List<VlanAttachment> interconnectAttachments) {
    this.interconnectAttachments = interconnectAttachments;
    return this;
  }

  /**
   * Vlan attachment type.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterconnectType() {
    return interconnectType;
  }

  /**
   * Vlan attachment type.
   * @param interconnectType interconnectType or {@code null} for none
   */
  public CloudInterconnectWorkload setInterconnectType(java.lang.String interconnectType) {
    this.interconnectType = interconnectType;
    return this;
  }

  /**
   * Interconnect circuit link type.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkType() {
    return linkType;
  }

  /**
   * Interconnect circuit link type.
   * @param linkType linkType or {@code null} for none
   */
  public CloudInterconnectWorkload setLinkType(java.lang.String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Interconnect usage. This is specified as a unitless quantity which indicates the number of
   * circuit provisioned in interconnect.
   * @return value or {@code null} for none
   */
  public Usage getProvisionedLinkCount() {
    return provisionedLinkCount;
  }

  /**
   * Interconnect usage. This is specified as a unitless quantity which indicates the number of
   * circuit provisioned in interconnect.
   * @param provisionedLinkCount provisionedLinkCount or {@code null} for none
   */
  public CloudInterconnectWorkload setProvisionedLinkCount(Usage provisionedLinkCount) {
    this.provisionedLinkCount = provisionedLinkCount;
    return this;
  }

  @Override
  public CloudInterconnectWorkload set(String fieldName, Object value) {
    return (CloudInterconnectWorkload) super.set(fieldName, value);
  }

  @Override
  public CloudInterconnectWorkload clone() {
    return (CloudInterconnectWorkload) super.clone();
  }

}
