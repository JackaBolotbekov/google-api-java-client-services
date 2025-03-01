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
 * Represents a rule that describes one or more match conditions along with the action to be taken
 * when traffic matches this condition (allow or deny).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicyRule extends com.google.api.client.json.GenericJson {

  /**
   * The Action to perform when the rule is matched. The following are the valid actions: - allow:
   * allow access to target. - deny(STATUS): deny access to target, returns the HTTP response code
   * specified. Valid values for `STATUS` are 403, 404, and 502. - rate_based_ban: limit client
   * traffic to the configured threshold and ban the client if the traffic exceeds the threshold.
   * Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be
   * set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA
   * redirect, or an external URL-based redirect via a 302 response. Parameters for this action can
   * be configured via redirectOptions. - throttle: limit client traffic to the configured
   * threshold. Configure parameters for this action in rateLimitOptions. Requires
   * rate_limit_options to be set for this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The direction in which this rule applies. This field may only be specified when versioned_expr
   * is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be
   * exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery
   * or Pub/Sub. Note: you cannot enable logging on "goto_next" rules. This field may only be
   * specified when the versioned_expr is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableLogging;

  /**
   * Optional, additional actions that are performed on headers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleHttpHeaderAction headerAction;

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding 'action' is enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleMatcher match;

  /**
   * A match condition that incoming packets are evaluated against for CLOUD_ARMOR_NETWORK security
   * policies. If it matches, the corresponding 'action' is enforced. The match criteria for a rule
   * consists of built-in match fields (like 'srcIpRanges') and potentially multiple user-defined
   * match fields ('userDefinedFields'). Field values may be extracted directly from the packet or
   * derived from it (e.g. 'srcRegionCodes'). Some fields may not be present in every packet (e.g.
   * 'srcPorts'). A user-defined field is only present if the base header is found in the packet and
   * the entire field is in bounds. Each match field may specify which values can match it, listing
   * one or more ranges, prefixes, or exact values that are considered a match for the field. A
   * field value must be present in order to match a specified match field. If no match values are
   * specified for a match field, then any field value is considered to match it, and it's not
   * required to be present. For strings specifying '*' is also equivalent to match all. For a
   * packet to match a rule, all specified match fields must match the corresponding field values
   * derived from the packet. Example: networkMatch: srcIpRanges: - "192.0.2.0/24" -
   * "198.51.100.0/24" userDefinedFields: - name: "ipv4_fragment_offset" values: - "1-0x1fff" The
   * above match condition matches packets with a source IP in 192.0.2.0/24 or 198.51.100.0/24 and a
   * user-defined field named "ipv4_fragment_offset" with a value between 1 and 0x1fff inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleNetworkMatcher networkMatch;

  /**
   * Preconfigured WAF configuration to be applied for the rule. If the rule does not evaluate
   * preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have
   * no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRulePreconfiguredWafConfig preconfiguredWafConfig;

  /**
   * If set to true, the specified action is not enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preview;

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   * highest priority and 2147483647 is the lowest priority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any
   * other actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleRateLimitOptions rateLimitOptions;

  /**
   * Parameters defining the redirect action. Cannot be specified for any other actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleRedirectOptions redirectOptions;

  /**
   * This must be specified for redirect actions. Cannot be specified for any other actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectTarget;

  /**
   * [Output Only] The minimum managed protection tier required for this rule. [Deprecated] Use
   * requiredManagedProtectionTiers instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ruleManagedProtectionTier;

  /**
   * Identifier for the rule. This is only unique within the given security policy. This can only be
   * set during rule creation, if rule number is not specified it will be generated by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ruleNumber;

  /**
   * [Output Only] Calculation of the complexity of a single firewall security policy rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ruleTupleCount;

  /**
   * A list of network resource URLs to which this rule applies. This field allows you to control
   * which network's VMs get this rule. If this field is left blank, all VMs within the organization
   * will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetResources;

  /**
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetServiceAccounts;

  /**
   * The Action to perform when the rule is matched. The following are the valid actions: - allow:
   * allow access to target. - deny(STATUS): deny access to target, returns the HTTP response code
   * specified. Valid values for `STATUS` are 403, 404, and 502. - rate_based_ban: limit client
   * traffic to the configured threshold and ban the client if the traffic exceeds the threshold.
   * Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be
   * set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA
   * redirect, or an external URL-based redirect via a 302 response. Parameters for this action can
   * be configured via redirectOptions. - throttle: limit client traffic to the configured
   * threshold. Configure parameters for this action in rateLimitOptions. Requires
   * rate_limit_options to be set for this.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The Action to perform when the rule is matched. The following are the valid actions: - allow:
   * allow access to target. - deny(STATUS): deny access to target, returns the HTTP response code
   * specified. Valid values for `STATUS` are 403, 404, and 502. - rate_based_ban: limit client
   * traffic to the configured threshold and ban the client if the traffic exceeds the threshold.
   * Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be
   * set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA
   * redirect, or an external URL-based redirect via a 302 response. Parameters for this action can
   * be configured via redirectOptions. - throttle: limit client traffic to the configured
   * threshold. Configure parameters for this action in rateLimitOptions. Requires
   * rate_limit_options to be set for this.
   * @param action action or {@code null} for none
   */
  public SecurityPolicyRule setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public SecurityPolicyRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The direction in which this rule applies. This field may only be specified when versioned_expr
   * is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * The direction in which this rule applies. This field may only be specified when versioned_expr
   * is set to FIREWALL.
   * @param direction direction or {@code null} for none
   */
  public SecurityPolicyRule setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be
   * exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery
   * or Pub/Sub. Note: you cannot enable logging on "goto_next" rules. This field may only be
   * specified when the versioned_expr is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableLogging() {
    return enableLogging;
  }

  /**
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be
   * exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery
   * or Pub/Sub. Note: you cannot enable logging on "goto_next" rules. This field may only be
   * specified when the versioned_expr is set to FIREWALL.
   * @param enableLogging enableLogging or {@code null} for none
   */
  public SecurityPolicyRule setEnableLogging(java.lang.Boolean enableLogging) {
    this.enableLogging = enableLogging;
    return this;
  }

  /**
   * Optional, additional actions that are performed on headers.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleHttpHeaderAction getHeaderAction() {
    return headerAction;
  }

  /**
   * Optional, additional actions that are performed on headers.
   * @param headerAction headerAction or {@code null} for none
   */
  public SecurityPolicyRule setHeaderAction(SecurityPolicyRuleHttpHeaderAction headerAction) {
    this.headerAction = headerAction;
    return this;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * @param kind kind or {@code null} for none
   */
  public SecurityPolicyRule setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding 'action' is enforced.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleMatcher getMatch() {
    return match;
  }

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding 'action' is enforced.
   * @param match match or {@code null} for none
   */
  public SecurityPolicyRule setMatch(SecurityPolicyRuleMatcher match) {
    this.match = match;
    return this;
  }

  /**
   * A match condition that incoming packets are evaluated against for CLOUD_ARMOR_NETWORK security
   * policies. If it matches, the corresponding 'action' is enforced. The match criteria for a rule
   * consists of built-in match fields (like 'srcIpRanges') and potentially multiple user-defined
   * match fields ('userDefinedFields'). Field values may be extracted directly from the packet or
   * derived from it (e.g. 'srcRegionCodes'). Some fields may not be present in every packet (e.g.
   * 'srcPorts'). A user-defined field is only present if the base header is found in the packet and
   * the entire field is in bounds. Each match field may specify which values can match it, listing
   * one or more ranges, prefixes, or exact values that are considered a match for the field. A
   * field value must be present in order to match a specified match field. If no match values are
   * specified for a match field, then any field value is considered to match it, and it's not
   * required to be present. For strings specifying '*' is also equivalent to match all. For a
   * packet to match a rule, all specified match fields must match the corresponding field values
   * derived from the packet. Example: networkMatch: srcIpRanges: - "192.0.2.0/24" -
   * "198.51.100.0/24" userDefinedFields: - name: "ipv4_fragment_offset" values: - "1-0x1fff" The
   * above match condition matches packets with a source IP in 192.0.2.0/24 or 198.51.100.0/24 and a
   * user-defined field named "ipv4_fragment_offset" with a value between 1 and 0x1fff inclusive.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleNetworkMatcher getNetworkMatch() {
    return networkMatch;
  }

  /**
   * A match condition that incoming packets are evaluated against for CLOUD_ARMOR_NETWORK security
   * policies. If it matches, the corresponding 'action' is enforced. The match criteria for a rule
   * consists of built-in match fields (like 'srcIpRanges') and potentially multiple user-defined
   * match fields ('userDefinedFields'). Field values may be extracted directly from the packet or
   * derived from it (e.g. 'srcRegionCodes'). Some fields may not be present in every packet (e.g.
   * 'srcPorts'). A user-defined field is only present if the base header is found in the packet and
   * the entire field is in bounds. Each match field may specify which values can match it, listing
   * one or more ranges, prefixes, or exact values that are considered a match for the field. A
   * field value must be present in order to match a specified match field. If no match values are
   * specified for a match field, then any field value is considered to match it, and it's not
   * required to be present. For strings specifying '*' is also equivalent to match all. For a
   * packet to match a rule, all specified match fields must match the corresponding field values
   * derived from the packet. Example: networkMatch: srcIpRanges: - "192.0.2.0/24" -
   * "198.51.100.0/24" userDefinedFields: - name: "ipv4_fragment_offset" values: - "1-0x1fff" The
   * above match condition matches packets with a source IP in 192.0.2.0/24 or 198.51.100.0/24 and a
   * user-defined field named "ipv4_fragment_offset" with a value between 1 and 0x1fff inclusive.
   * @param networkMatch networkMatch or {@code null} for none
   */
  public SecurityPolicyRule setNetworkMatch(SecurityPolicyRuleNetworkMatcher networkMatch) {
    this.networkMatch = networkMatch;
    return this;
  }

  /**
   * Preconfigured WAF configuration to be applied for the rule. If the rule does not evaluate
   * preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have
   * no effect.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRulePreconfiguredWafConfig getPreconfiguredWafConfig() {
    return preconfiguredWafConfig;
  }

  /**
   * Preconfigured WAF configuration to be applied for the rule. If the rule does not evaluate
   * preconfigured WAF rules, i.e., if evaluatePreconfiguredWaf() is not used, this field will have
   * no effect.
   * @param preconfiguredWafConfig preconfiguredWafConfig or {@code null} for none
   */
  public SecurityPolicyRule setPreconfiguredWafConfig(SecurityPolicyRulePreconfiguredWafConfig preconfiguredWafConfig) {
    this.preconfiguredWafConfig = preconfiguredWafConfig;
    return this;
  }

  /**
   * If set to true, the specified action is not enforced.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreview() {
    return preview;
  }

  /**
   * If set to true, the specified action is not enforced.
   * @param preview preview or {@code null} for none
   */
  public SecurityPolicyRule setPreview(java.lang.Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   * highest priority and 2147483647 is the lowest priority.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   * highest priority and 2147483647 is the lowest priority.
   * @param priority priority or {@code null} for none
   */
  public SecurityPolicyRule setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any
   * other actions.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions getRateLimitOptions() {
    return rateLimitOptions;
  }

  /**
   * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any
   * other actions.
   * @param rateLimitOptions rateLimitOptions or {@code null} for none
   */
  public SecurityPolicyRule setRateLimitOptions(SecurityPolicyRuleRateLimitOptions rateLimitOptions) {
    this.rateLimitOptions = rateLimitOptions;
    return this;
  }

  /**
   * Parameters defining the redirect action. Cannot be specified for any other actions.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleRedirectOptions getRedirectOptions() {
    return redirectOptions;
  }

  /**
   * Parameters defining the redirect action. Cannot be specified for any other actions.
   * @param redirectOptions redirectOptions or {@code null} for none
   */
  public SecurityPolicyRule setRedirectOptions(SecurityPolicyRuleRedirectOptions redirectOptions) {
    this.redirectOptions = redirectOptions;
    return this;
  }

  /**
   * This must be specified for redirect actions. Cannot be specified for any other actions.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectTarget() {
    return redirectTarget;
  }

  /**
   * This must be specified for redirect actions. Cannot be specified for any other actions.
   * @param redirectTarget redirectTarget or {@code null} for none
   */
  public SecurityPolicyRule setRedirectTarget(java.lang.String redirectTarget) {
    this.redirectTarget = redirectTarget;
    return this;
  }

  /**
   * [Output Only] The minimum managed protection tier required for this rule. [Deprecated] Use
   * requiredManagedProtectionTiers instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuleManagedProtectionTier() {
    return ruleManagedProtectionTier;
  }

  /**
   * [Output Only] The minimum managed protection tier required for this rule. [Deprecated] Use
   * requiredManagedProtectionTiers instead.
   * @param ruleManagedProtectionTier ruleManagedProtectionTier or {@code null} for none
   */
  public SecurityPolicyRule setRuleManagedProtectionTier(java.lang.String ruleManagedProtectionTier) {
    this.ruleManagedProtectionTier = ruleManagedProtectionTier;
    return this;
  }

  /**
   * Identifier for the rule. This is only unique within the given security policy. This can only be
   * set during rule creation, if rule number is not specified it will be generated by the server.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRuleNumber() {
    return ruleNumber;
  }

  /**
   * Identifier for the rule. This is only unique within the given security policy. This can only be
   * set during rule creation, if rule number is not specified it will be generated by the server.
   * @param ruleNumber ruleNumber or {@code null} for none
   */
  public SecurityPolicyRule setRuleNumber(java.lang.Long ruleNumber) {
    this.ruleNumber = ruleNumber;
    return this;
  }

  /**
   * [Output Only] Calculation of the complexity of a single firewall security policy rule.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRuleTupleCount() {
    return ruleTupleCount;
  }

  /**
   * [Output Only] Calculation of the complexity of a single firewall security policy rule.
   * @param ruleTupleCount ruleTupleCount or {@code null} for none
   */
  public SecurityPolicyRule setRuleTupleCount(java.lang.Integer ruleTupleCount) {
    this.ruleTupleCount = ruleTupleCount;
    return this;
  }

  /**
   * A list of network resource URLs to which this rule applies. This field allows you to control
   * which network's VMs get this rule. If this field is left blank, all VMs within the organization
   * will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetResources() {
    return targetResources;
  }

  /**
   * A list of network resource URLs to which this rule applies. This field allows you to control
   * which network's VMs get this rule. If this field is left blank, all VMs within the organization
   * will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
   * @param targetResources targetResources or {@code null} for none
   */
  public SecurityPolicyRule setTargetResources(java.util.List<java.lang.String> targetResources) {
    this.targetResources = targetResources;
    return this;
  }

  /**
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetServiceAccounts() {
    return targetServiceAccounts;
  }

  /**
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * @param targetServiceAccounts targetServiceAccounts or {@code null} for none
   */
  public SecurityPolicyRule setTargetServiceAccounts(java.util.List<java.lang.String> targetServiceAccounts) {
    this.targetServiceAccounts = targetServiceAccounts;
    return this;
  }

  @Override
  public SecurityPolicyRule set(String fieldName, Object value) {
    return (SecurityPolicyRule) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicyRule clone() {
    return (SecurityPolicyRule) super.clone();
  }

}
