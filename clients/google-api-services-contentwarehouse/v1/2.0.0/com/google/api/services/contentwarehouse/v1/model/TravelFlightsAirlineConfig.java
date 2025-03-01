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
 * Next ID: 27
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
public final class TravelFlightsAirlineConfig extends com.google.api.client.json.GenericJson {

  /**
   * Populated using airlines_company_ids.csv for AdWords company map
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer adwordsCid;

  /**
   * STAR_ALLIANCE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alliance;

  /**
   * Default url for baggage fee information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto baggageCarryonLimitationsUrls;

  /**
   * Default url for baggage fee information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto baggageFeeUrls;

  /**
   * ISO 3166-1 alpha-2 country code in which this airline is domestic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * LocalizedContactInfo allows localization by country and language. Once the data is ready, we
   * will start filling both fields. After that the old field will be deprecated and deleted at some
   * point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TravelFlightsAirlineConfigCountryContactInfo> countryContactInfo;

  /**
   * true, if this carrier's IATA code is a "controlled duplicate" (goto/controlled-duplicate).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dupFlag;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto fareFamilyUrls;

  /**
   * IATA codes of airlines who this airline's travel can be credited to for mileage accrual.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fqtvPartnerCode;

  /**
   * Note that some iata_codes are reused (`dup_flag` field). For details, including how to resolve
   * collisions for airlines shown in Google Flights, see: go/controlled-duplicate go/flights-
   * data/airlines#resolving-iata-code-collisions cs/go/controlled-duplicate U2 - some have no IATA
   * code
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iataCode;

  /**
   * EZY - some have no ICAO code
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icaoCode;

  /**
   * U2! - with optional dedup sign ('!')
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String innovataCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TravelFlightsAirlineConfigLocalizedContactInfo> localizedContactInfo;

  /**
   * Note: fields #16 and #17 are ununused. The identifier of the airline, e.g. /m/07y2s for United
   * Populated using airlines_mids.csv.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * EasyJet/イージージェット
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto names;

  /**
   * Default url for passenger assistance information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto passengerAssistanceUrls;

  /**
   * Number of flights with this airline over the next 180 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer popularity;

  /**
   * KLM - instead of 'KLM Royal Dutch Airlines'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto shortNames;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * http://www.airfrance.us/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto urls;

  /**
   * Default url for waiver information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TravelFlightsNameCatalogProto waiverSummaryUrls;

  /**
   * Populated using airlines_company_ids.csv for AdWords company map
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAdwordsCid() {
    return adwordsCid;
  }

  /**
   * Populated using airlines_company_ids.csv for AdWords company map
   * @param adwordsCid adwordsCid or {@code null} for none
   */
  public TravelFlightsAirlineConfig setAdwordsCid(java.lang.Integer adwordsCid) {
    this.adwordsCid = adwordsCid;
    return this;
  }

  /**
   * STAR_ALLIANCE
   * @return value or {@code null} for none
   */
  public java.lang.String getAlliance() {
    return alliance;
  }

  /**
   * STAR_ALLIANCE
   * @param alliance alliance or {@code null} for none
   */
  public TravelFlightsAirlineConfig setAlliance(java.lang.String alliance) {
    this.alliance = alliance;
    return this;
  }

  /**
   * Default url for baggage fee information.
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getBaggageCarryonLimitationsUrls() {
    return baggageCarryonLimitationsUrls;
  }

  /**
   * Default url for baggage fee information.
   * @param baggageCarryonLimitationsUrls baggageCarryonLimitationsUrls or {@code null} for none
   */
  public TravelFlightsAirlineConfig setBaggageCarryonLimitationsUrls(TravelFlightsNameCatalogProto baggageCarryonLimitationsUrls) {
    this.baggageCarryonLimitationsUrls = baggageCarryonLimitationsUrls;
    return this;
  }

  /**
   * Default url for baggage fee information.
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getBaggageFeeUrls() {
    return baggageFeeUrls;
  }

  /**
   * Default url for baggage fee information.
   * @param baggageFeeUrls baggageFeeUrls or {@code null} for none
   */
  public TravelFlightsAirlineConfig setBaggageFeeUrls(TravelFlightsNameCatalogProto baggageFeeUrls) {
    this.baggageFeeUrls = baggageFeeUrls;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 country code in which this airline is domestic.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * ISO 3166-1 alpha-2 country code in which this airline is domestic.
   * @param countryCode countryCode or {@code null} for none
   */
  public TravelFlightsAirlineConfig setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * LocalizedContactInfo allows localization by country and language. Once the data is ready, we
   * will start filling both fields. After that the old field will be deprecated and deleted at some
   * point.
   * @return value or {@code null} for none
   */
  public java.util.List<TravelFlightsAirlineConfigCountryContactInfo> getCountryContactInfo() {
    return countryContactInfo;
  }

  /**
   * LocalizedContactInfo allows localization by country and language. Once the data is ready, we
   * will start filling both fields. After that the old field will be deprecated and deleted at some
   * point.
   * @param countryContactInfo countryContactInfo or {@code null} for none
   */
  public TravelFlightsAirlineConfig setCountryContactInfo(java.util.List<TravelFlightsAirlineConfigCountryContactInfo> countryContactInfo) {
    this.countryContactInfo = countryContactInfo;
    return this;
  }

  /**
   * true, if this carrier's IATA code is a "controlled duplicate" (goto/controlled-duplicate).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDupFlag() {
    return dupFlag;
  }

  /**
   * true, if this carrier's IATA code is a "controlled duplicate" (goto/controlled-duplicate).
   * @param dupFlag dupFlag or {@code null} for none
   */
  public TravelFlightsAirlineConfig setDupFlag(java.lang.Boolean dupFlag) {
    this.dupFlag = dupFlag;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getFareFamilyUrls() {
    return fareFamilyUrls;
  }

  /**
   * @param fareFamilyUrls fareFamilyUrls or {@code null} for none
   */
  public TravelFlightsAirlineConfig setFareFamilyUrls(TravelFlightsNameCatalogProto fareFamilyUrls) {
    this.fareFamilyUrls = fareFamilyUrls;
    return this;
  }

  /**
   * IATA codes of airlines who this airline's travel can be credited to for mileage accrual.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFqtvPartnerCode() {
    return fqtvPartnerCode;
  }

  /**
   * IATA codes of airlines who this airline's travel can be credited to for mileage accrual.
   * @param fqtvPartnerCode fqtvPartnerCode or {@code null} for none
   */
  public TravelFlightsAirlineConfig setFqtvPartnerCode(java.util.List<java.lang.String> fqtvPartnerCode) {
    this.fqtvPartnerCode = fqtvPartnerCode;
    return this;
  }

  /**
   * Note that some iata_codes are reused (`dup_flag` field). For details, including how to resolve
   * collisions for airlines shown in Google Flights, see: go/controlled-duplicate go/flights-
   * data/airlines#resolving-iata-code-collisions cs/go/controlled-duplicate U2 - some have no IATA
   * code
   * @return value or {@code null} for none
   */
  public java.lang.String getIataCode() {
    return iataCode;
  }

  /**
   * Note that some iata_codes are reused (`dup_flag` field). For details, including how to resolve
   * collisions for airlines shown in Google Flights, see: go/controlled-duplicate go/flights-
   * data/airlines#resolving-iata-code-collisions cs/go/controlled-duplicate U2 - some have no IATA
   * code
   * @param iataCode iataCode or {@code null} for none
   */
  public TravelFlightsAirlineConfig setIataCode(java.lang.String iataCode) {
    this.iataCode = iataCode;
    return this;
  }

  /**
   * EZY - some have no ICAO code
   * @return value or {@code null} for none
   */
  public java.lang.String getIcaoCode() {
    return icaoCode;
  }

  /**
   * EZY - some have no ICAO code
   * @param icaoCode icaoCode or {@code null} for none
   */
  public TravelFlightsAirlineConfig setIcaoCode(java.lang.String icaoCode) {
    this.icaoCode = icaoCode;
    return this;
  }

  /**
   * U2! - with optional dedup sign ('!')
   * @return value or {@code null} for none
   */
  public java.lang.String getInnovataCode() {
    return innovataCode;
  }

  /**
   * U2! - with optional dedup sign ('!')
   * @param innovataCode innovataCode or {@code null} for none
   */
  public TravelFlightsAirlineConfig setInnovataCode(java.lang.String innovataCode) {
    this.innovataCode = innovataCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<TravelFlightsAirlineConfigLocalizedContactInfo> getLocalizedContactInfo() {
    return localizedContactInfo;
  }

  /**
   * @param localizedContactInfo localizedContactInfo or {@code null} for none
   */
  public TravelFlightsAirlineConfig setLocalizedContactInfo(java.util.List<TravelFlightsAirlineConfigLocalizedContactInfo> localizedContactInfo) {
    this.localizedContactInfo = localizedContactInfo;
    return this;
  }

  /**
   * Note: fields #16 and #17 are ununused. The identifier of the airline, e.g. /m/07y2s for United
   * Populated using airlines_mids.csv.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * Note: fields #16 and #17 are ununused. The identifier of the airline, e.g. /m/07y2s for United
   * Populated using airlines_mids.csv.
   * @param mid mid or {@code null} for none
   */
  public TravelFlightsAirlineConfig setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * EasyJet/イージージェット
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getNames() {
    return names;
  }

  /**
   * EasyJet/イージージェット
   * @param names names or {@code null} for none
   */
  public TravelFlightsAirlineConfig setNames(TravelFlightsNameCatalogProto names) {
    this.names = names;
    return this;
  }

  /**
   * Default url for passenger assistance information.
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getPassengerAssistanceUrls() {
    return passengerAssistanceUrls;
  }

  /**
   * Default url for passenger assistance information.
   * @param passengerAssistanceUrls passengerAssistanceUrls or {@code null} for none
   */
  public TravelFlightsAirlineConfig setPassengerAssistanceUrls(TravelFlightsNameCatalogProto passengerAssistanceUrls) {
    this.passengerAssistanceUrls = passengerAssistanceUrls;
    return this;
  }

  /**
   * Number of flights with this airline over the next 180 days.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPopularity() {
    return popularity;
  }

  /**
   * Number of flights with this airline over the next 180 days.
   * @param popularity popularity or {@code null} for none
   */
  public TravelFlightsAirlineConfig setPopularity(java.lang.Integer popularity) {
    this.popularity = popularity;
    return this;
  }

  /**
   * KLM - instead of 'KLM Royal Dutch Airlines'
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getShortNames() {
    return shortNames;
  }

  /**
   * KLM - instead of 'KLM Royal Dutch Airlines'
   * @param shortNames shortNames or {@code null} for none
   */
  public TravelFlightsAirlineConfig setShortNames(TravelFlightsNameCatalogProto shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public TravelFlightsAirlineConfig setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * http://www.airfrance.us/
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getUrls() {
    return urls;
  }

  /**
   * http://www.airfrance.us/
   * @param urls urls or {@code null} for none
   */
  public TravelFlightsAirlineConfig setUrls(TravelFlightsNameCatalogProto urls) {
    this.urls = urls;
    return this;
  }

  /**
   * Default url for waiver information.
   * @return value or {@code null} for none
   */
  public TravelFlightsNameCatalogProto getWaiverSummaryUrls() {
    return waiverSummaryUrls;
  }

  /**
   * Default url for waiver information.
   * @param waiverSummaryUrls waiverSummaryUrls or {@code null} for none
   */
  public TravelFlightsAirlineConfig setWaiverSummaryUrls(TravelFlightsNameCatalogProto waiverSummaryUrls) {
    this.waiverSummaryUrls = waiverSummaryUrls;
    return this;
  }

  @Override
  public TravelFlightsAirlineConfig set(String fieldName, Object value) {
    return (TravelFlightsAirlineConfig) super.set(fieldName, value);
  }

  @Override
  public TravelFlightsAirlineConfig clone() {
    return (TravelFlightsAirlineConfig) super.clone();
  }

}
