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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Response message for DocumentService.CreateDocument.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContentwarehouseV1CreateDocumentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Document created after executing create request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1Document document;

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1ResponseMetadata metadata;

  /**
   * Output from Rule Engine recording the rule evaluator and action executor's output. Refer format
   * in: google/cloud/contentwarehouse/v1/rule_engine.proto
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContentwarehouseV1RuleEngineOutput ruleEngineOutput;

  /**
   * Document created after executing create request.
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1Document getDocument() {
    return document;
  }

  /**
   * Document created after executing create request.
   * @param document document or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1CreateDocumentResponse setDocument(GoogleCloudContentwarehouseV1Document document) {
    this.document = document;
    return this;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1CreateDocumentResponse setMetadata(GoogleCloudContentwarehouseV1ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Output from Rule Engine recording the rule evaluator and action executor's output. Refer format
   * in: google/cloud/contentwarehouse/v1/rule_engine.proto
   * @return value or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1RuleEngineOutput getRuleEngineOutput() {
    return ruleEngineOutput;
  }

  /**
   * Output from Rule Engine recording the rule evaluator and action executor's output. Refer format
   * in: google/cloud/contentwarehouse/v1/rule_engine.proto
   * @param ruleEngineOutput ruleEngineOutput or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1CreateDocumentResponse setRuleEngineOutput(GoogleCloudContentwarehouseV1RuleEngineOutput ruleEngineOutput) {
    this.ruleEngineOutput = ruleEngineOutput;
    return this;
  }

  @Override
  public GoogleCloudContentwarehouseV1CreateDocumentResponse set(String fieldName, Object value) {
    return (GoogleCloudContentwarehouseV1CreateDocumentResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContentwarehouseV1CreateDocumentResponse clone() {
    return (GoogleCloudContentwarehouseV1CreateDocumentResponse) super.clone();
  }

}
