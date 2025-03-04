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

package com.google.api.services.compute.model;

/**
 * An access configuration attached to an instance's network interface. Only one access config per
 * instance is supported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessConfig extends com.google.api.client.json.GenericJson {

  /**
   * The first IPv6 address of the external IPv6 range associated with this instance, prefix length
   * is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address,
   * it must be unused and in the same region as the instance's zone. If not specified, GCP will
   * automatically assign an external IPv6 address from the instance's subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalIpv6;

  /**
   * The prefix length of the external IPv6 range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer externalIpv6PrefixLength;

  /**
   * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of this access configuration. The default and recommended name is External NAT, but
   * you can use any arbitrary string, such as My external IP or Network Access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An external IP address associated with this instance. Specify an unused static external IP
   * address available to the project or leave this field undefined to use an IP from a shared
   * ephemeral IP address pool. If you specify a static external IP address, it must live in the
   * same region as the zone of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String natIP;

  /**
   * This signifies the networking tier used for configuring this access configuration and can only
   * take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid
   * external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig
   * with a valid external IP address is specified, it must match that of the networkTier associated
   * with the Address resource owning that IP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkTier;

  /**
   * [Output Only] The public DNS domain name for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicDnsName;

  /**
   * The DNS domain name for the public PTR record. You can set this field only if the
   * `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in
   * ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6
   * range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicPtrDomainName;

  /**
   * [Output Only] The resource URL for the security policy associated with this access config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityPolicy;

  /**
   * Specifies whether a public DNS 'A' record should be created for the external IP address of this
   * access configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean setPublicDns;

  /**
   * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of
   * the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR
   * record will be created if the VM has external IPv6 range associated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean setPublicPtr;

  /**
   * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The first IPv6 address of the external IPv6 range associated with this instance, prefix length
   * is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address,
   * it must be unused and in the same region as the instance's zone. If not specified, GCP will
   * automatically assign an external IPv6 address from the instance's subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalIpv6() {
    return externalIpv6;
  }

  /**
   * The first IPv6 address of the external IPv6 range associated with this instance, prefix length
   * is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address,
   * it must be unused and in the same region as the instance's zone. If not specified, GCP will
   * automatically assign an external IPv6 address from the instance's subnetwork.
   * @param externalIpv6 externalIpv6 or {@code null} for none
   */
  public AccessConfig setExternalIpv6(java.lang.String externalIpv6) {
    this.externalIpv6 = externalIpv6;
    return this;
  }

  /**
   * The prefix length of the external IPv6 range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExternalIpv6PrefixLength() {
    return externalIpv6PrefixLength;
  }

  /**
   * The prefix length of the external IPv6 range.
   * @param externalIpv6PrefixLength externalIpv6PrefixLength or {@code null} for none
   */
  public AccessConfig setExternalIpv6PrefixLength(java.lang.Integer externalIpv6PrefixLength) {
    this.externalIpv6PrefixLength = externalIpv6PrefixLength;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
   * @param kind kind or {@code null} for none
   */
  public AccessConfig setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of this access configuration. The default and recommended name is External NAT, but
   * you can use any arbitrary string, such as My external IP or Network Access.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this access configuration. The default and recommended name is External NAT, but
   * you can use any arbitrary string, such as My external IP or Network Access.
   * @param name name or {@code null} for none
   */
  public AccessConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An external IP address associated with this instance. Specify an unused static external IP
   * address available to the project or leave this field undefined to use an IP from a shared
   * ephemeral IP address pool. If you specify a static external IP address, it must live in the
   * same region as the zone of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getNatIP() {
    return natIP;
  }

  /**
   * An external IP address associated with this instance. Specify an unused static external IP
   * address available to the project or leave this field undefined to use an IP from a shared
   * ephemeral IP address pool. If you specify a static external IP address, it must live in the
   * same region as the zone of the instance.
   * @param natIP natIP or {@code null} for none
   */
  public AccessConfig setNatIP(java.lang.String natIP) {
    this.natIP = natIP;
    return this;
  }

  /**
   * This signifies the networking tier used for configuring this access configuration and can only
   * take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid
   * external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig
   * with a valid external IP address is specified, it must match that of the networkTier associated
   * with the Address resource owning that IP.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkTier() {
    return networkTier;
  }

  /**
   * This signifies the networking tier used for configuring this access configuration and can only
   * take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid
   * external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig
   * with a valid external IP address is specified, it must match that of the networkTier associated
   * with the Address resource owning that IP.
   * @param networkTier networkTier or {@code null} for none
   */
  public AccessConfig setNetworkTier(java.lang.String networkTier) {
    this.networkTier = networkTier;
    return this;
  }

  /**
   * [Output Only] The public DNS domain name for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicDnsName() {
    return publicDnsName;
  }

  /**
   * [Output Only] The public DNS domain name for the instance.
   * @param publicDnsName publicDnsName or {@code null} for none
   */
  public AccessConfig setPublicDnsName(java.lang.String publicDnsName) {
    this.publicDnsName = publicDnsName;
    return this;
  }

  /**
   * The DNS domain name for the public PTR record. You can set this field only if the
   * `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in
   * ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6
   * range.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicPtrDomainName() {
    return publicPtrDomainName;
  }

  /**
   * The DNS domain name for the public PTR record. You can set this field only if the
   * `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in
   * ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6
   * range.
   * @param publicPtrDomainName publicPtrDomainName or {@code null} for none
   */
  public AccessConfig setPublicPtrDomainName(java.lang.String publicPtrDomainName) {
    this.publicPtrDomainName = publicPtrDomainName;
    return this;
  }

  /**
   * [Output Only] The resource URL for the security policy associated with this access config.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityPolicy() {
    return securityPolicy;
  }

  /**
   * [Output Only] The resource URL for the security policy associated with this access config.
   * @param securityPolicy securityPolicy or {@code null} for none
   */
  public AccessConfig setSecurityPolicy(java.lang.String securityPolicy) {
    this.securityPolicy = securityPolicy;
    return this;
  }

  /**
   * Specifies whether a public DNS 'A' record should be created for the external IP address of this
   * access configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSetPublicDns() {
    return setPublicDns;
  }

  /**
   * Specifies whether a public DNS 'A' record should be created for the external IP address of this
   * access configuration.
   * @param setPublicDns setPublicDns or {@code null} for none
   */
  public AccessConfig setSetPublicDns(java.lang.Boolean setPublicDns) {
    this.setPublicDns = setPublicDns;
    return this;
  }

  /**
   * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of
   * the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR
   * record will be created if the VM has external IPv6 range associated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSetPublicPtr() {
    return setPublicPtr;
  }

  /**
   * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of
   * the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR
   * record will be created if the VM has external IPv6 range associated.
   * @param setPublicPtr setPublicPtr or {@code null} for none
   */
  public AccessConfig setSetPublicPtr(java.lang.Boolean setPublicPtr) {
    this.setPublicPtr = setPublicPtr;
    return this;
  }

  /**
   * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
   * @param type type or {@code null} for none
   */
  public AccessConfig setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AccessConfig set(String fieldName, Object value) {
    return (AccessConfig) super.set(fieldName, value);
  }

  @Override
  public AccessConfig clone() {
    return (AccessConfig) super.clone();
  }

}
