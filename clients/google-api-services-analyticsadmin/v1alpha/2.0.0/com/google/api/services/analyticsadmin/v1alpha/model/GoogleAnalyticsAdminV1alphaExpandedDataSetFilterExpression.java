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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A logical expression of EnhancedDataSet dimension filters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression extends com.google.api.client.json.GenericJson {

  /**
   * A list of expressions to be AND’ed together. It must contain a ExpandedDataSetFilterExpression
   * with either not_expression or dimension_filter. This must be set for the top level
   * ExpandedDataSetFilterExpression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpressionList andGroup;

  /**
   * A filter on a single dimension. This cannot be set on the top level
   * ExpandedDataSetFilterExpression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaExpandedDataSetFilter filter;

  /**
   * A filter expression to be NOT'ed (i.e., inverted, complemented). It must include a
   * dimension_filter. This cannot be set on the top level ExpandedDataSetFilterExpression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression notExpression;

  /**
   * A list of expressions to be AND’ed together. It must contain a ExpandedDataSetFilterExpression
   * with either not_expression or dimension_filter. This must be set for the top level
   * ExpandedDataSetFilterExpression.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpressionList getAndGroup() {
    return andGroup;
  }

  /**
   * A list of expressions to be AND’ed together. It must contain a ExpandedDataSetFilterExpression
   * with either not_expression or dimension_filter. This must be set for the top level
   * ExpandedDataSetFilterExpression.
   * @param andGroup andGroup or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression setAndGroup(GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpressionList andGroup) {
    this.andGroup = andGroup;
    return this;
  }

  /**
   * A filter on a single dimension. This cannot be set on the top level
   * ExpandedDataSetFilterExpression.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilter getFilter() {
    return filter;
  }

  /**
   * A filter on a single dimension. This cannot be set on the top level
   * ExpandedDataSetFilterExpression.
   * @param filter filter or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression setFilter(GoogleAnalyticsAdminV1alphaExpandedDataSetFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * A filter expression to be NOT'ed (i.e., inverted, complemented). It must include a
   * dimension_filter. This cannot be set on the top level ExpandedDataSetFilterExpression.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression getNotExpression() {
    return notExpression;
  }

  /**
   * A filter expression to be NOT'ed (i.e., inverted, complemented). It must include a
   * dimension_filter. This cannot be set on the top level ExpandedDataSetFilterExpression.
   * @param notExpression notExpression or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression setNotExpression(GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression notExpression) {
    this.notExpression = notExpression;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression clone() {
    return (GoogleAnalyticsAdminV1alphaExpandedDataSetFilterExpression) super.clone();
  }

}
