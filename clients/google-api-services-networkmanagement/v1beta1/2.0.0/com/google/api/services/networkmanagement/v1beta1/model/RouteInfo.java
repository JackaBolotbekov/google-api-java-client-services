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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * For display only. Metadata associated with a Compute Engine route.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouteInfo extends com.google.api.client.json.GenericJson {

  /**
   * Destination IP range of the route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destIpRange;

  /**
   * Destination port ranges of the route. Policy based routes only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destPortRanges;

  /**
   * Name of a Compute Engine route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Instance tags of the route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instanceTags;

  /**
   * URI of a Compute Engine network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkUri;

  /**
   * Next hop of the route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHop;

  /**
   * Type of next hop.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopType;

  /**
   * Priority of the route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Protocols of the route. Policy based routes only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> protocols;

  /**
   * Type of route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String routeType;

  /**
   * Source IP address range of the route. Policy based routes only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String srcIpRange;

  /**
   * Source port ranges of the route. Policy based routes only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> srcPortRanges;

  /**
   * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised
   * route from Google Cloud VPC to on-premises network also does not have a URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Destination IP range of the route.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestIpRange() {
    return destIpRange;
  }

  /**
   * Destination IP range of the route.
   * @param destIpRange destIpRange or {@code null} for none
   */
  public RouteInfo setDestIpRange(java.lang.String destIpRange) {
    this.destIpRange = destIpRange;
    return this;
  }

  /**
   * Destination port ranges of the route. Policy based routes only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestPortRanges() {
    return destPortRanges;
  }

  /**
   * Destination port ranges of the route. Policy based routes only.
   * @param destPortRanges destPortRanges or {@code null} for none
   */
  public RouteInfo setDestPortRanges(java.util.List<java.lang.String> destPortRanges) {
    this.destPortRanges = destPortRanges;
    return this;
  }

  /**
   * Name of a Compute Engine route.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of a Compute Engine route.
   * @param displayName displayName or {@code null} for none
   */
  public RouteInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Instance tags of the route.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstanceTags() {
    return instanceTags;
  }

  /**
   * Instance tags of the route.
   * @param instanceTags instanceTags or {@code null} for none
   */
  public RouteInfo setInstanceTags(java.util.List<java.lang.String> instanceTags) {
    this.instanceTags = instanceTags;
    return this;
  }

  /**
   * URI of a Compute Engine network.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkUri() {
    return networkUri;
  }

  /**
   * URI of a Compute Engine network.
   * @param networkUri networkUri or {@code null} for none
   */
  public RouteInfo setNetworkUri(java.lang.String networkUri) {
    this.networkUri = networkUri;
    return this;
  }

  /**
   * Next hop of the route.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHop() {
    return nextHop;
  }

  /**
   * Next hop of the route.
   * @param nextHop nextHop or {@code null} for none
   */
  public RouteInfo setNextHop(java.lang.String nextHop) {
    this.nextHop = nextHop;
    return this;
  }

  /**
   * Type of next hop.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopType() {
    return nextHopType;
  }

  /**
   * Type of next hop.
   * @param nextHopType nextHopType or {@code null} for none
   */
  public RouteInfo setNextHopType(java.lang.String nextHopType) {
    this.nextHopType = nextHopType;
    return this;
  }

  /**
   * Priority of the route.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Priority of the route.
   * @param priority priority or {@code null} for none
   */
  public RouteInfo setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Protocols of the route. Policy based routes only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProtocols() {
    return protocols;
  }

  /**
   * Protocols of the route. Policy based routes only.
   * @param protocols protocols or {@code null} for none
   */
  public RouteInfo setProtocols(java.util.List<java.lang.String> protocols) {
    this.protocols = protocols;
    return this;
  }

  /**
   * Type of route.
   * @return value or {@code null} for none
   */
  public java.lang.String getRouteType() {
    return routeType;
  }

  /**
   * Type of route.
   * @param routeType routeType or {@code null} for none
   */
  public RouteInfo setRouteType(java.lang.String routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Source IP address range of the route. Policy based routes only.
   * @return value or {@code null} for none
   */
  public java.lang.String getSrcIpRange() {
    return srcIpRange;
  }

  /**
   * Source IP address range of the route. Policy based routes only.
   * @param srcIpRange srcIpRange or {@code null} for none
   */
  public RouteInfo setSrcIpRange(java.lang.String srcIpRange) {
    this.srcIpRange = srcIpRange;
    return this;
  }

  /**
   * Source port ranges of the route. Policy based routes only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSrcPortRanges() {
    return srcPortRanges;
  }

  /**
   * Source port ranges of the route. Policy based routes only.
   * @param srcPortRanges srcPortRanges or {@code null} for none
   */
  public RouteInfo setSrcPortRanges(java.util.List<java.lang.String> srcPortRanges) {
    this.srcPortRanges = srcPortRanges;
    return this;
  }

  /**
   * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised
   * route from Google Cloud VPC to on-premises network also does not have a URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised
   * route from Google Cloud VPC to on-premises network also does not have a URI.
   * @param uri uri or {@code null} for none
   */
  public RouteInfo setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public RouteInfo set(String fieldName, Object value) {
    return (RouteInfo) super.set(fieldName, value);
  }

  @Override
  public RouteInfo clone() {
    return (RouteInfo) super.clone();
  }

}
