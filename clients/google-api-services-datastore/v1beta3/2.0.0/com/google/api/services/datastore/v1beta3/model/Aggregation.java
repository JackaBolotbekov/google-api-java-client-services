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

package com.google.api.services.datastore.v1beta3.model;

/**
 * Defines a aggregation that produces a single result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Aggregation extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Optional name of the property to store the result of the aggregation. If not
   * provided, Datastore will pick a default name following the format `property_`. For example: ```
   * AGGREGATE COUNT_UP_TO(1) AS count_up_to_1, COUNT_UP_TO(2), COUNT_UP_TO(3) AS count_up_to_3,
   * COUNT_UP_TO(4) OVER ( ... ); ``` becomes: ``` AGGREGATE COUNT_UP_TO(1) AS count_up_to_1,
   * COUNT_UP_TO(2) AS property_1, COUNT_UP_TO(3) AS count_up_to_3, COUNT_UP_TO(4) AS property_2
   * OVER ( ... ); ``` Requires: * Must be unique across all aggregation aliases. * Conform to
   * entity property name limitations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alias;

  /**
   * Count aggregator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Count count;

  /**
   * Optional. Optional name of the property to store the result of the aggregation. If not
   * provided, Datastore will pick a default name following the format `property_`. For example: ```
   * AGGREGATE COUNT_UP_TO(1) AS count_up_to_1, COUNT_UP_TO(2), COUNT_UP_TO(3) AS count_up_to_3,
   * COUNT_UP_TO(4) OVER ( ... ); ``` becomes: ``` AGGREGATE COUNT_UP_TO(1) AS count_up_to_1,
   * COUNT_UP_TO(2) AS property_1, COUNT_UP_TO(3) AS count_up_to_3, COUNT_UP_TO(4) AS property_2
   * OVER ( ... ); ``` Requires: * Must be unique across all aggregation aliases. * Conform to
   * entity property name limitations.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlias() {
    return alias;
  }

  /**
   * Optional. Optional name of the property to store the result of the aggregation. If not
   * provided, Datastore will pick a default name following the format `property_`. For example: ```
   * AGGREGATE COUNT_UP_TO(1) AS count_up_to_1, COUNT_UP_TO(2), COUNT_UP_TO(3) AS count_up_to_3,
   * COUNT_UP_TO(4) OVER ( ... ); ``` becomes: ``` AGGREGATE COUNT_UP_TO(1) AS count_up_to_1,
   * COUNT_UP_TO(2) AS property_1, COUNT_UP_TO(3) AS count_up_to_3, COUNT_UP_TO(4) AS property_2
   * OVER ( ... ); ``` Requires: * Must be unique across all aggregation aliases. * Conform to
   * entity property name limitations.
   * @param alias alias or {@code null} for none
   */
  public Aggregation setAlias(java.lang.String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Count aggregator.
   * @return value or {@code null} for none
   */
  public Count getCount() {
    return count;
  }

  /**
   * Count aggregator.
   * @param count count or {@code null} for none
   */
  public Aggregation setCount(Count count) {
    this.count = count;
    return this;
  }

  @Override
  public Aggregation set(String fieldName, Object value) {
    return (Aggregation) super.set(fieldName, value);
  }

  @Override
  public Aggregation clone() {
    return (Aggregation) super.clone();
  }

}
