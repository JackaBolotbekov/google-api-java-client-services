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

package com.google.api.services.transcoder.v1.model;

/**
 * H265 codec settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class H265CodecSettings extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The
   * default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowOpenGop;

  /**
   * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables
   * the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother
   * image. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double aqStrength;

  /**
   * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than
   * `VideoStream.gop_frame_count` if set. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bFrameCount;

  /**
   * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The
   * default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bPyramid;

  /**
   * Required. The video bitrate in bits per second. The minimum value is 1,000. The maximum value
   * is 800,000,000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bitrateBps;

  /**
   * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most
   * efficient compression. The default is 21.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer crfLevel;

  /**
   * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode`
   * must be `vbr`. The default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableTwoPass;

  /**
   * Required. The target video frame rate in frames per second (FPS). Must be less than or equal to
   * 120. Will default to the input frame rate if larger than the input frame rate. The API will
   * generate an output FPS that is divisible by the input FPS, and smaller or equal to the target
   * FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate)
   * for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double frameRate;

  /**
   * Select the GOP size based on the specified duration. The default is `3s`. Note that
   * `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and
   * [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String gopDuration;

  /**
   * Select the GOP size based on the specified frame count. Must be greater than zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer gopFrameCount;

  /**
   * The height of the video in pixels. Must be an even integer. When not specified, the height is
   * adjusted to match the specified width and input aspect ratio. If both are omitted, the input
   * height is used. For portrait videos that contain horizontal ASR and rotation metadata, provide
   * the height, in pixels, per the horizontal ASR. The API calculates the width per the horizontal
   * ASR. The API detects any rotation metadata and swaps the requested height and width for the
   * output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer heightPixels;

  /**
   * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel
   * format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format
   * - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12`
   * 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel
   * format
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pixelFormat;

  /**
   * Enforces the specified codec preset. The default is `veryfast`. The available options are
   * [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for
   * this field may cause the transcoder to override other fields you set in the `H265CodecSettings`
   * message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String preset;

  /**
   * Enforces the specified codec profile. The following profiles are supported: * 8-bit profiles *
   * `main` (default) * `main-intra` * `mainstillpicture` * 10-bit profiles * `main10` (default) *
   * `main10-intra` * `main422-10` * `main422-10-intra` * `main444-10` * `main444-10-intra` * 12-bit
   * profiles * `main12` (default) * `main12-intra` * `main422-12` * `main422-12-intra` *
   * `main444-12` * `main444-12-intra` The available options are [FFmpeg-
   * compatible](https://x265.readthedocs.io/). Note that certain values for this field may cause
   * the transcoder to override other fields you set in the `H265CodecSettings` message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profile;

  /**
   * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` -
   * variable bitrate - `crf` - constant rate factor
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rateControlMode;

  /**
   * Enforces the specified codec tune. The available options are [FFmpeg-
   * compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field
   * may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tune;

  /**
   * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than
   * zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vbvFullnessBits;

  /**
   * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The
   * default is equal to `VideoStream.bitrate_bps`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vbvSizeBits;

  /**
   * The width of the video in pixels. Must be an even integer. When not specified, the width is
   * adjusted to match the specified height and input aspect ratio. If both are omitted, the input
   * width is used. For portrait videos that contain horizontal ASR and rotation metadata, provide
   * the width, in pixels, per the horizontal ASR. The API calculates the height per the horizontal
   * ASR. The API detects any rotation metadata and swaps the requested height and width for the
   * output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer widthPixels;

  /**
   * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The
   * default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowOpenGop() {
    return allowOpenGop;
  }

  /**
   * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The
   * default is `false`.
   * @param allowOpenGop allowOpenGop or {@code null} for none
   */
  public H265CodecSettings setAllowOpenGop(java.lang.Boolean allowOpenGop) {
    this.allowOpenGop = allowOpenGop;
    return this;
  }

  /**
   * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables
   * the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother
   * image. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAqStrength() {
    return aqStrength;
  }

  /**
   * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables
   * the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother
   * image. The default is 0.
   * @param aqStrength aqStrength or {@code null} for none
   */
  public H265CodecSettings setAqStrength(java.lang.Double aqStrength) {
    this.aqStrength = aqStrength;
    return this;
  }

  /**
   * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than
   * `VideoStream.gop_frame_count` if set. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBFrameCount() {
    return bFrameCount;
  }

  /**
   * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than
   * `VideoStream.gop_frame_count` if set. The default is 0.
   * @param bFrameCount bFrameCount or {@code null} for none
   */
  public H265CodecSettings setBFrameCount(java.lang.Integer bFrameCount) {
    this.bFrameCount = bFrameCount;
    return this;
  }

  /**
   * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The
   * default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBPyramid() {
    return bPyramid;
  }

  /**
   * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The
   * default is `false`.
   * @param bPyramid bPyramid or {@code null} for none
   */
  public H265CodecSettings setBPyramid(java.lang.Boolean bPyramid) {
    this.bPyramid = bPyramid;
    return this;
  }

  /**
   * Required. The video bitrate in bits per second. The minimum value is 1,000. The maximum value
   * is 800,000,000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBitrateBps() {
    return bitrateBps;
  }

  /**
   * Required. The video bitrate in bits per second. The minimum value is 1,000. The maximum value
   * is 800,000,000.
   * @param bitrateBps bitrateBps or {@code null} for none
   */
  public H265CodecSettings setBitrateBps(java.lang.Integer bitrateBps) {
    this.bitrateBps = bitrateBps;
    return this;
  }

  /**
   * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most
   * efficient compression. The default is 21.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCrfLevel() {
    return crfLevel;
  }

  /**
   * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most
   * efficient compression. The default is 21.
   * @param crfLevel crfLevel or {@code null} for none
   */
  public H265CodecSettings setCrfLevel(java.lang.Integer crfLevel) {
    this.crfLevel = crfLevel;
    return this;
  }

  /**
   * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode`
   * must be `vbr`. The default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableTwoPass() {
    return enableTwoPass;
  }

  /**
   * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode`
   * must be `vbr`. The default is `false`.
   * @param enableTwoPass enableTwoPass or {@code null} for none
   */
  public H265CodecSettings setEnableTwoPass(java.lang.Boolean enableTwoPass) {
    this.enableTwoPass = enableTwoPass;
    return this;
  }

  /**
   * Required. The target video frame rate in frames per second (FPS). Must be less than or equal to
   * 120. Will default to the input frame rate if larger than the input frame rate. The API will
   * generate an output FPS that is divisible by the input FPS, and smaller or equal to the target
   * FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate)
   * for more information.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFrameRate() {
    return frameRate;
  }

  /**
   * Required. The target video frame rate in frames per second (FPS). Must be less than or equal to
   * 120. Will default to the input frame rate if larger than the input frame rate. The API will
   * generate an output FPS that is divisible by the input FPS, and smaller or equal to the target
   * FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate)
   * for more information.
   * @param frameRate frameRate or {@code null} for none
   */
  public H265CodecSettings setFrameRate(java.lang.Double frameRate) {
    this.frameRate = frameRate;
    return this;
  }

  /**
   * Select the GOP size based on the specified duration. The default is `3s`. Note that
   * `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and
   * [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
   * @return value or {@code null} for none
   */
  public String getGopDuration() {
    return gopDuration;
  }

  /**
   * Select the GOP size based on the specified duration. The default is `3s`. Note that
   * `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and
   * [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
   * @param gopDuration gopDuration or {@code null} for none
   */
  public H265CodecSettings setGopDuration(String gopDuration) {
    this.gopDuration = gopDuration;
    return this;
  }

  /**
   * Select the GOP size based on the specified frame count. Must be greater than zero.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGopFrameCount() {
    return gopFrameCount;
  }

  /**
   * Select the GOP size based on the specified frame count. Must be greater than zero.
   * @param gopFrameCount gopFrameCount or {@code null} for none
   */
  public H265CodecSettings setGopFrameCount(java.lang.Integer gopFrameCount) {
    this.gopFrameCount = gopFrameCount;
    return this;
  }

  /**
   * The height of the video in pixels. Must be an even integer. When not specified, the height is
   * adjusted to match the specified width and input aspect ratio. If both are omitted, the input
   * height is used. For portrait videos that contain horizontal ASR and rotation metadata, provide
   * the height, in pixels, per the horizontal ASR. The API calculates the width per the horizontal
   * ASR. The API detects any rotation metadata and swaps the requested height and width for the
   * output.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeightPixels() {
    return heightPixels;
  }

  /**
   * The height of the video in pixels. Must be an even integer. When not specified, the height is
   * adjusted to match the specified width and input aspect ratio. If both are omitted, the input
   * height is used. For portrait videos that contain horizontal ASR and rotation metadata, provide
   * the height, in pixels, per the horizontal ASR. The API calculates the width per the horizontal
   * ASR. The API detects any rotation metadata and swaps the requested height and width for the
   * output.
   * @param heightPixels heightPixels or {@code null} for none
   */
  public H265CodecSettings setHeightPixels(java.lang.Integer heightPixels) {
    this.heightPixels = heightPixels;
    return this;
  }

  /**
   * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel
   * format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format
   * - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12`
   * 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel
   * format
   * @return value or {@code null} for none
   */
  public java.lang.String getPixelFormat() {
    return pixelFormat;
  }

  /**
   * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel
   * format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format
   * - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12`
   * 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel
   * format
   * @param pixelFormat pixelFormat or {@code null} for none
   */
  public H265CodecSettings setPixelFormat(java.lang.String pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

  /**
   * Enforces the specified codec preset. The default is `veryfast`. The available options are
   * [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for
   * this field may cause the transcoder to override other fields you set in the `H265CodecSettings`
   * message.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreset() {
    return preset;
  }

  /**
   * Enforces the specified codec preset. The default is `veryfast`. The available options are
   * [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for
   * this field may cause the transcoder to override other fields you set in the `H265CodecSettings`
   * message.
   * @param preset preset or {@code null} for none
   */
  public H265CodecSettings setPreset(java.lang.String preset) {
    this.preset = preset;
    return this;
  }

  /**
   * Enforces the specified codec profile. The following profiles are supported: * 8-bit profiles *
   * `main` (default) * `main-intra` * `mainstillpicture` * 10-bit profiles * `main10` (default) *
   * `main10-intra` * `main422-10` * `main422-10-intra` * `main444-10` * `main444-10-intra` * 12-bit
   * profiles * `main12` (default) * `main12-intra` * `main422-12` * `main422-12-intra` *
   * `main444-12` * `main444-12-intra` The available options are [FFmpeg-
   * compatible](https://x265.readthedocs.io/). Note that certain values for this field may cause
   * the transcoder to override other fields you set in the `H265CodecSettings` message.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfile() {
    return profile;
  }

  /**
   * Enforces the specified codec profile. The following profiles are supported: * 8-bit profiles *
   * `main` (default) * `main-intra` * `mainstillpicture` * 10-bit profiles * `main10` (default) *
   * `main10-intra` * `main422-10` * `main422-10-intra` * `main444-10` * `main444-10-intra` * 12-bit
   * profiles * `main12` (default) * `main12-intra` * `main422-12` * `main422-12-intra` *
   * `main444-12` * `main444-12-intra` The available options are [FFmpeg-
   * compatible](https://x265.readthedocs.io/). Note that certain values for this field may cause
   * the transcoder to override other fields you set in the `H265CodecSettings` message.
   * @param profile profile or {@code null} for none
   */
  public H265CodecSettings setProfile(java.lang.String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` -
   * variable bitrate - `crf` - constant rate factor
   * @return value or {@code null} for none
   */
  public java.lang.String getRateControlMode() {
    return rateControlMode;
  }

  /**
   * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` -
   * variable bitrate - `crf` - constant rate factor
   * @param rateControlMode rateControlMode or {@code null} for none
   */
  public H265CodecSettings setRateControlMode(java.lang.String rateControlMode) {
    this.rateControlMode = rateControlMode;
    return this;
  }

  /**
   * Enforces the specified codec tune. The available options are [FFmpeg-
   * compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field
   * may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
   * @return value or {@code null} for none
   */
  public java.lang.String getTune() {
    return tune;
  }

  /**
   * Enforces the specified codec tune. The available options are [FFmpeg-
   * compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field
   * may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
   * @param tune tune or {@code null} for none
   */
  public H265CodecSettings setTune(java.lang.String tune) {
    this.tune = tune;
    return this;
  }

  /**
   * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than
   * zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVbvFullnessBits() {
    return vbvFullnessBits;
  }

  /**
   * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than
   * zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
   * @param vbvFullnessBits vbvFullnessBits or {@code null} for none
   */
  public H265CodecSettings setVbvFullnessBits(java.lang.Integer vbvFullnessBits) {
    this.vbvFullnessBits = vbvFullnessBits;
    return this;
  }

  /**
   * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The
   * default is equal to `VideoStream.bitrate_bps`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVbvSizeBits() {
    return vbvSizeBits;
  }

  /**
   * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The
   * default is equal to `VideoStream.bitrate_bps`.
   * @param vbvSizeBits vbvSizeBits or {@code null} for none
   */
  public H265CodecSettings setVbvSizeBits(java.lang.Integer vbvSizeBits) {
    this.vbvSizeBits = vbvSizeBits;
    return this;
  }

  /**
   * The width of the video in pixels. Must be an even integer. When not specified, the width is
   * adjusted to match the specified height and input aspect ratio. If both are omitted, the input
   * width is used. For portrait videos that contain horizontal ASR and rotation metadata, provide
   * the width, in pixels, per the horizontal ASR. The API calculates the height per the horizontal
   * ASR. The API detects any rotation metadata and swaps the requested height and width for the
   * output.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidthPixels() {
    return widthPixels;
  }

  /**
   * The width of the video in pixels. Must be an even integer. When not specified, the width is
   * adjusted to match the specified height and input aspect ratio. If both are omitted, the input
   * width is used. For portrait videos that contain horizontal ASR and rotation metadata, provide
   * the width, in pixels, per the horizontal ASR. The API calculates the height per the horizontal
   * ASR. The API detects any rotation metadata and swaps the requested height and width for the
   * output.
   * @param widthPixels widthPixels or {@code null} for none
   */
  public H265CodecSettings setWidthPixels(java.lang.Integer widthPixels) {
    this.widthPixels = widthPixels;
    return this;
  }

  @Override
  public H265CodecSettings set(String fieldName, Object value) {
    return (H265CodecSettings) super.set(fieldName, value);
  }

  @Override
  public H265CodecSettings clone() {
    return (H265CodecSettings) super.clone();
  }

}
