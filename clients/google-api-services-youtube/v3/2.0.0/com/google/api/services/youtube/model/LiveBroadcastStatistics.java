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

package com.google.api.services.youtube.model;

/**
 * Statistics about the live broadcast. These represent a snapshot of the values at the time of the
 * request. Statistics are only returned for live broadcasts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveBroadcastStatistics extends com.google.api.client.json.GenericJson {

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be
   * present if the broadcast has current viewers and the broadcast owner has not hidden the
   * viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for
   * a broadcast when the broadcast ends. So, this property would not identify the number of viewers
   * watching an archived video of a live broadcast that already ended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger concurrentViewers;

  /**
   * The total number of live chat messages currently on the broadcast. The property and its value
   * will be present if the broadcast is public, has the live chat feature enabled, and has at least
   * one message. Note that this field will not be filled after the broadcast ends. So this property
   * would not identify the number of chat messages for an archived video of a completed live
   * broadcast.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger totalChatCount;

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be
   * present if the broadcast has current viewers and the broadcast owner has not hidden the
   * viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for
   * a broadcast when the broadcast ends. So, this property would not identify the number of viewers
   * watching an archived video of a live broadcast that already ended.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getConcurrentViewers() {
    return concurrentViewers;
  }

  /**
   * The number of viewers currently watching the broadcast. The property and its value will be
   * present if the broadcast has current viewers and the broadcast owner has not hidden the
   * viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for
   * a broadcast when the broadcast ends. So, this property would not identify the number of viewers
   * watching an archived video of a live broadcast that already ended.
   * @param concurrentViewers concurrentViewers or {@code null} for none
   */
  public LiveBroadcastStatistics setConcurrentViewers(java.math.BigInteger concurrentViewers) {
    this.concurrentViewers = concurrentViewers;
    return this;
  }

  /**
   * The total number of live chat messages currently on the broadcast. The property and its value
   * will be present if the broadcast is public, has the live chat feature enabled, and has at least
   * one message. Note that this field will not be filled after the broadcast ends. So this property
   * would not identify the number of chat messages for an archived video of a completed live
   * broadcast.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTotalChatCount() {
    return totalChatCount;
  }

  /**
   * The total number of live chat messages currently on the broadcast. The property and its value
   * will be present if the broadcast is public, has the live chat feature enabled, and has at least
   * one message. Note that this field will not be filled after the broadcast ends. So this property
   * would not identify the number of chat messages for an archived video of a completed live
   * broadcast.
   * @param totalChatCount totalChatCount or {@code null} for none
   */
  public LiveBroadcastStatistics setTotalChatCount(java.math.BigInteger totalChatCount) {
    this.totalChatCount = totalChatCount;
    return this;
  }

  @Override
  public LiveBroadcastStatistics set(String fieldName, Object value) {
    return (LiveBroadcastStatistics) super.set(fieldName, value);
  }

  @Override
  public LiveBroadcastStatistics clone() {
    return (LiveBroadcastStatistics) super.clone();
  }

}
