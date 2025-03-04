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

package com.google.api.services.datamigration.v1.model;

/**
 * Request message for 'ImportMappingRules' request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportMappingRulesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Should the conversion workspace be committed automatically after the import operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCommit;

  /**
   * One or more rules files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RulesFile> rulesFiles;

  /**
   * The format of the rules content file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rulesFormat;

  /**
   * Should the conversion workspace be committed automatically after the import operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCommit() {
    return autoCommit;
  }

  /**
   * Should the conversion workspace be committed automatically after the import operation.
   * @param autoCommit autoCommit or {@code null} for none
   */
  public ImportMappingRulesRequest setAutoCommit(java.lang.Boolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

  /**
   * One or more rules files.
   * @return value or {@code null} for none
   */
  public java.util.List<RulesFile> getRulesFiles() {
    return rulesFiles;
  }

  /**
   * One or more rules files.
   * @param rulesFiles rulesFiles or {@code null} for none
   */
  public ImportMappingRulesRequest setRulesFiles(java.util.List<RulesFile> rulesFiles) {
    this.rulesFiles = rulesFiles;
    return this;
  }

  /**
   * The format of the rules content file.
   * @return value or {@code null} for none
   */
  public java.lang.String getRulesFormat() {
    return rulesFormat;
  }

  /**
   * The format of the rules content file.
   * @param rulesFormat rulesFormat or {@code null} for none
   */
  public ImportMappingRulesRequest setRulesFormat(java.lang.String rulesFormat) {
    this.rulesFormat = rulesFormat;
    return this;
  }

  @Override
  public ImportMappingRulesRequest set(String fieldName, Object value) {
    return (ImportMappingRulesRequest) super.set(fieldName, value);
  }

  @Override
  public ImportMappingRulesRequest clone() {
    return (ImportMappingRulesRequest) super.clone();
  }

}
