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
 * This proto is a lightweight version of ShoppingAnnotation in docjoin attachment. We're doing a
 * deep copy of protos defined in ShoppingAnnotation so that we can control individual fields that
 * will sit in Muppet. Data here will be used for scoring organic shopping web results and previews.
 * Many shopping related signals, e.g., product review score, are also served from this attachment.
 * Next ID: 21
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
public final class QualityShoppingShoppingAttachment extends com.google.api.client.json.GenericJson {

  /**
   * Score from the blockbert article classifier model. go/article-understanding-project
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelArticleScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelBuyingGuideScore;

  /**
   * From forum and qna confidence score * 100, http://go/sdu-ugc-page-intro
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelForumListScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelForumSingleScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelInStoreOnlyScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelIndirectAvailabilityScore;

  /**
   * From indexing.ml.PageType.confidence * 100 (DatasetModelAnnotation in cdoc) go/sdu-shopping-
   * page-intro
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelMultiProductScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelProductComparisonScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelProductReviewScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelProductTopnScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelQnaListScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelQnaSingleScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelSingleProductScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer datasetModelSoldOutScore;

  /**
   * From indexing.badpages.CollapserInfo.expired_shopping_page_score * 100
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer expiredShoppingPageScore;

  /**
   * From MagicPageTypeAnnotation.multiplicity.confidence_score * 100 Deprecated as of July 2020
   * when dataset_model_multi_product_score and dataset_model_single_product_score were added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer multiProductScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QualityShoppingShoppingAttachmentProduct> product;

  /**
   * From ShoppingSiteClassifier.score * 100
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer shoppingSiteScore;

  /**
   * From ShoppingSiteClassifierShopfab.score * 100
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer shoppingSiteScoreShopfab;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer singleProductScore;

  /**
   * Score from the blockbert article classifier model. go/article-understanding-project
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelArticleScore() {
    return datasetModelArticleScore;
  }

  /**
   * Score from the blockbert article classifier model. go/article-understanding-project
   * @param datasetModelArticleScore datasetModelArticleScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelArticleScore(java.lang.Integer datasetModelArticleScore) {
    this.datasetModelArticleScore = datasetModelArticleScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelBuyingGuideScore() {
    return datasetModelBuyingGuideScore;
  }

  /**
   * @param datasetModelBuyingGuideScore datasetModelBuyingGuideScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelBuyingGuideScore(java.lang.Integer datasetModelBuyingGuideScore) {
    this.datasetModelBuyingGuideScore = datasetModelBuyingGuideScore;
    return this;
  }

  /**
   * From forum and qna confidence score * 100, http://go/sdu-ugc-page-intro
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelForumListScore() {
    return datasetModelForumListScore;
  }

  /**
   * From forum and qna confidence score * 100, http://go/sdu-ugc-page-intro
   * @param datasetModelForumListScore datasetModelForumListScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelForumListScore(java.lang.Integer datasetModelForumListScore) {
    this.datasetModelForumListScore = datasetModelForumListScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelForumSingleScore() {
    return datasetModelForumSingleScore;
  }

  /**
   * @param datasetModelForumSingleScore datasetModelForumSingleScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelForumSingleScore(java.lang.Integer datasetModelForumSingleScore) {
    this.datasetModelForumSingleScore = datasetModelForumSingleScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelInStoreOnlyScore() {
    return datasetModelInStoreOnlyScore;
  }

  /**
   * @param datasetModelInStoreOnlyScore datasetModelInStoreOnlyScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelInStoreOnlyScore(java.lang.Integer datasetModelInStoreOnlyScore) {
    this.datasetModelInStoreOnlyScore = datasetModelInStoreOnlyScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelIndirectAvailabilityScore() {
    return datasetModelIndirectAvailabilityScore;
  }

  /**
   * @param datasetModelIndirectAvailabilityScore datasetModelIndirectAvailabilityScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelIndirectAvailabilityScore(java.lang.Integer datasetModelIndirectAvailabilityScore) {
    this.datasetModelIndirectAvailabilityScore = datasetModelIndirectAvailabilityScore;
    return this;
  }

  /**
   * From indexing.ml.PageType.confidence * 100 (DatasetModelAnnotation in cdoc) go/sdu-shopping-
   * page-intro
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelMultiProductScore() {
    return datasetModelMultiProductScore;
  }

  /**
   * From indexing.ml.PageType.confidence * 100 (DatasetModelAnnotation in cdoc) go/sdu-shopping-
   * page-intro
   * @param datasetModelMultiProductScore datasetModelMultiProductScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelMultiProductScore(java.lang.Integer datasetModelMultiProductScore) {
    this.datasetModelMultiProductScore = datasetModelMultiProductScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelProductComparisonScore() {
    return datasetModelProductComparisonScore;
  }

  /**
   * @param datasetModelProductComparisonScore datasetModelProductComparisonScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelProductComparisonScore(java.lang.Integer datasetModelProductComparisonScore) {
    this.datasetModelProductComparisonScore = datasetModelProductComparisonScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelProductReviewScore() {
    return datasetModelProductReviewScore;
  }

  /**
   * @param datasetModelProductReviewScore datasetModelProductReviewScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelProductReviewScore(java.lang.Integer datasetModelProductReviewScore) {
    this.datasetModelProductReviewScore = datasetModelProductReviewScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelProductTopnScore() {
    return datasetModelProductTopnScore;
  }

  /**
   * @param datasetModelProductTopnScore datasetModelProductTopnScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelProductTopnScore(java.lang.Integer datasetModelProductTopnScore) {
    this.datasetModelProductTopnScore = datasetModelProductTopnScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelQnaListScore() {
    return datasetModelQnaListScore;
  }

  /**
   * @param datasetModelQnaListScore datasetModelQnaListScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelQnaListScore(java.lang.Integer datasetModelQnaListScore) {
    this.datasetModelQnaListScore = datasetModelQnaListScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelQnaSingleScore() {
    return datasetModelQnaSingleScore;
  }

  /**
   * @param datasetModelQnaSingleScore datasetModelQnaSingleScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelQnaSingleScore(java.lang.Integer datasetModelQnaSingleScore) {
    this.datasetModelQnaSingleScore = datasetModelQnaSingleScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelSingleProductScore() {
    return datasetModelSingleProductScore;
  }

  /**
   * @param datasetModelSingleProductScore datasetModelSingleProductScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelSingleProductScore(java.lang.Integer datasetModelSingleProductScore) {
    this.datasetModelSingleProductScore = datasetModelSingleProductScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDatasetModelSoldOutScore() {
    return datasetModelSoldOutScore;
  }

  /**
   * @param datasetModelSoldOutScore datasetModelSoldOutScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setDatasetModelSoldOutScore(java.lang.Integer datasetModelSoldOutScore) {
    this.datasetModelSoldOutScore = datasetModelSoldOutScore;
    return this;
  }

  /**
   * From indexing.badpages.CollapserInfo.expired_shopping_page_score * 100
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExpiredShoppingPageScore() {
    return expiredShoppingPageScore;
  }

  /**
   * From indexing.badpages.CollapserInfo.expired_shopping_page_score * 100
   * @param expiredShoppingPageScore expiredShoppingPageScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setExpiredShoppingPageScore(java.lang.Integer expiredShoppingPageScore) {
    this.expiredShoppingPageScore = expiredShoppingPageScore;
    return this;
  }

  /**
   * From MagicPageTypeAnnotation.multiplicity.confidence_score * 100 Deprecated as of July 2020
   * when dataset_model_multi_product_score and dataset_model_single_product_score were added.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMultiProductScore() {
    return multiProductScore;
  }

  /**
   * From MagicPageTypeAnnotation.multiplicity.confidence_score * 100 Deprecated as of July 2020
   * when dataset_model_multi_product_score and dataset_model_single_product_score were added.
   * @param multiProductScore multiProductScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setMultiProductScore(java.lang.Integer multiProductScore) {
    this.multiProductScore = multiProductScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<QualityShoppingShoppingAttachmentProduct> getProduct() {
    return product;
  }

  /**
   * @param product product or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setProduct(java.util.List<QualityShoppingShoppingAttachmentProduct> product) {
    this.product = product;
    return this;
  }

  /**
   * From ShoppingSiteClassifier.score * 100
   * @return value or {@code null} for none
   */
  public java.lang.Integer getShoppingSiteScore() {
    return shoppingSiteScore;
  }

  /**
   * From ShoppingSiteClassifier.score * 100
   * @param shoppingSiteScore shoppingSiteScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setShoppingSiteScore(java.lang.Integer shoppingSiteScore) {
    this.shoppingSiteScore = shoppingSiteScore;
    return this;
  }

  /**
   * From ShoppingSiteClassifierShopfab.score * 100
   * @return value or {@code null} for none
   */
  public java.lang.Integer getShoppingSiteScoreShopfab() {
    return shoppingSiteScoreShopfab;
  }

  /**
   * From ShoppingSiteClassifierShopfab.score * 100
   * @param shoppingSiteScoreShopfab shoppingSiteScoreShopfab or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setShoppingSiteScoreShopfab(java.lang.Integer shoppingSiteScoreShopfab) {
    this.shoppingSiteScoreShopfab = shoppingSiteScoreShopfab;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSingleProductScore() {
    return singleProductScore;
  }

  /**
   * @param singleProductScore singleProductScore or {@code null} for none
   */
  public QualityShoppingShoppingAttachment setSingleProductScore(java.lang.Integer singleProductScore) {
    this.singleProductScore = singleProductScore;
    return this;
  }

  @Override
  public QualityShoppingShoppingAttachment set(String fieldName, Object value) {
    return (QualityShoppingShoppingAttachment) super.set(fieldName, value);
  }

  @Override
  public QualityShoppingShoppingAttachment clone() {
    return (QualityShoppingShoppingAttachment) super.clone();
  }

}
