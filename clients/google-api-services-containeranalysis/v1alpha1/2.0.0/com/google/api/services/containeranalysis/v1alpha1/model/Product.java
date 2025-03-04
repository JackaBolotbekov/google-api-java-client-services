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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Product contains information about a product and how to uniquely identify it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Product extends com.google.api.client.json.GenericJson {

  /**
   * Contains a URI which is vendor-specific. Example: The artifact repository URL of an image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String genericUri;

  /**
   * Token that identifies a product so that it can be referred to from other parts in the document.
   * There is no predefined format as long as it uniquely identifies a group in the context of the
   * current document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Name of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Contains a URI which is vendor-specific. Example: The artifact repository URL of an image.
   * @return value or {@code null} for none
   */
  public java.lang.String getGenericUri() {
    return genericUri;
  }

  /**
   * Contains a URI which is vendor-specific. Example: The artifact repository URL of an image.
   * @param genericUri genericUri or {@code null} for none
   */
  public Product setGenericUri(java.lang.String genericUri) {
    this.genericUri = genericUri;
    return this;
  }

  /**
   * Token that identifies a product so that it can be referred to from other parts in the document.
   * There is no predefined format as long as it uniquely identifies a group in the context of the
   * current document.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Token that identifies a product so that it can be referred to from other parts in the document.
   * There is no predefined format as long as it uniquely identifies a group in the context of the
   * current document.
   * @param id id or {@code null} for none
   */
  public Product setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Name of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the product.
   * @param name name or {@code null} for none
   */
  public Product setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Product set(String fieldName, Object value) {
    return (Product) super.set(fieldName, value);
  }

  @Override
  public Product clone() {
    return (Product) super.clone();
  }

}
