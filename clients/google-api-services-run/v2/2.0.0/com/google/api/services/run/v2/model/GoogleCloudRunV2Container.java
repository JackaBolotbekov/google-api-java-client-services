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

package com.google.api.services.run.v2.model;

/**
 * A single application container. This specifies both the container to run, the command to run in
 * the container and the arguments to supply to it. Note that additional arguments may be supplied
 * by the system to the container at runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2Container extends com.google.api.client.json.GenericJson {

  /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable
   * references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be
   * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be
   * escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
   * regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks
   * /inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> args;

  /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is
   * not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
   * If a variable cannot be resolved, the reference in the input string will be unchanged. The
   * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will
   * never be expanded, regardless of whether the variable exists or not. More info:
   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-
   * container/#running-a-command-in-a-shell
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> command;

  /**
   * List of environment variables to set in the container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2EnvVar> env;

  /**
   * Required. Name of the container image in Dockerhub, Google Artifact Registry, or Google
   * Container Registry. If the host is not provided, Dockerhub is assumed. More info:
   * https://kubernetes.io/docs/concepts/containers/images
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String image;

  /**
   * Periodic probe of container liveness. Container will be restarted if the probe fails. More
   * info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2Probe livenessProbe;

  /**
   * Name of the container specified as a DNS_LABEL (RFC 1123).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of ports to expose from the container. Only a single port can be specified. The specified
   * ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If
   * omitted, a port number will be chosen and passed to the container through the PORT environment
   * variable for the container to listen on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2ContainerPort> ports;

  /**
   * Compute Resource requirements by this container. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2ResourceRequirements resources;

  /**
   * Startup probe of application within the container. All other probes are disabled if a startup
   * probe is provided, until it succeeds. Container will not be added to service endpoints if the
   * probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle
   * #container-probes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRunV2Probe startupProbe;

  /**
   * Volume to mount into the container's filesystem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2VolumeMount> volumeMounts;

  /**
   * Container's working directory. If not specified, the container runtime's default will be used,
   * which might be configured in the container image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workingDir;

  /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable
   * references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be
   * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be
   * escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
   * regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks
   * /inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgs() {
    return args;
  }

  /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable
   * references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be
   * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be
   * escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
   * regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks
   * /inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @param args args or {@code null} for none
   */
  public GoogleCloudRunV2Container setArgs(java.util.List<java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is
   * not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
   * If a variable cannot be resolved, the reference in the input string will be unchanged. The
   * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will
   * never be expanded, regardless of whether the variable exists or not. More info:
   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-
   * container/#running-a-command-in-a-shell
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCommand() {
    return command;
  }

  /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is
   * not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
   * If a variable cannot be resolved, the reference in the input string will be unchanged. The
   * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will
   * never be expanded, regardless of whether the variable exists or not. More info:
   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-
   * container/#running-a-command-in-a-shell
   * @param command command or {@code null} for none
   */
  public GoogleCloudRunV2Container setCommand(java.util.List<java.lang.String> command) {
    this.command = command;
    return this;
  }

  /**
   * List of environment variables to set in the container.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2EnvVar> getEnv() {
    return env;
  }

  /**
   * List of environment variables to set in the container.
   * @param env env or {@code null} for none
   */
  public GoogleCloudRunV2Container setEnv(java.util.List<GoogleCloudRunV2EnvVar> env) {
    this.env = env;
    return this;
  }

  /**
   * Required. Name of the container image in Dockerhub, Google Artifact Registry, or Google
   * Container Registry. If the host is not provided, Dockerhub is assumed. More info:
   * https://kubernetes.io/docs/concepts/containers/images
   * @return value or {@code null} for none
   */
  public java.lang.String getImage() {
    return image;
  }

  /**
   * Required. Name of the container image in Dockerhub, Google Artifact Registry, or Google
   * Container Registry. If the host is not provided, Dockerhub is assumed. More info:
   * https://kubernetes.io/docs/concepts/containers/images
   * @param image image or {@code null} for none
   */
  public GoogleCloudRunV2Container setImage(java.lang.String image) {
    this.image = image;
    return this;
  }

  /**
   * Periodic probe of container liveness. Container will be restarted if the probe fails. More
   * info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2Probe getLivenessProbe() {
    return livenessProbe;
  }

  /**
   * Periodic probe of container liveness. Container will be restarted if the probe fails. More
   * info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @param livenessProbe livenessProbe or {@code null} for none
   */
  public GoogleCloudRunV2Container setLivenessProbe(GoogleCloudRunV2Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  /**
   * Name of the container specified as a DNS_LABEL (RFC 1123).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the container specified as a DNS_LABEL (RFC 1123).
   * @param name name or {@code null} for none
   */
  public GoogleCloudRunV2Container setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of ports to expose from the container. Only a single port can be specified. The specified
   * ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If
   * omitted, a port number will be chosen and passed to the container through the PORT environment
   * variable for the container to listen on.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2ContainerPort> getPorts() {
    return ports;
  }

  /**
   * List of ports to expose from the container. Only a single port can be specified. The specified
   * ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If
   * omitted, a port number will be chosen and passed to the container through the PORT environment
   * variable for the container to listen on.
   * @param ports ports or {@code null} for none
   */
  public GoogleCloudRunV2Container setPorts(java.util.List<GoogleCloudRunV2ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  /**
   * Compute Resource requirements by this container. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2ResourceRequirements getResources() {
    return resources;
  }

  /**
   * Compute Resource requirements by this container. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
   * @param resources resources or {@code null} for none
   */
  public GoogleCloudRunV2Container setResources(GoogleCloudRunV2ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Startup probe of application within the container. All other probes are disabled if a startup
   * probe is provided, until it succeeds. Container will not be added to service endpoints if the
   * probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle
   * #container-probes
   * @return value or {@code null} for none
   */
  public GoogleCloudRunV2Probe getStartupProbe() {
    return startupProbe;
  }

  /**
   * Startup probe of application within the container. All other probes are disabled if a startup
   * probe is provided, until it succeeds. Container will not be added to service endpoints if the
   * probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle
   * #container-probes
   * @param startupProbe startupProbe or {@code null} for none
   */
  public GoogleCloudRunV2Container setStartupProbe(GoogleCloudRunV2Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

  /**
   * Volume to mount into the container's filesystem.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  /**
   * Volume to mount into the container's filesystem.
   * @param volumeMounts volumeMounts or {@code null} for none
   */
  public GoogleCloudRunV2Container setVolumeMounts(java.util.List<GoogleCloudRunV2VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  /**
   * Container's working directory. If not specified, the container runtime's default will be used,
   * which might be configured in the container image.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkingDir() {
    return workingDir;
  }

  /**
   * Container's working directory. If not specified, the container runtime's default will be used,
   * which might be configured in the container image.
   * @param workingDir workingDir or {@code null} for none
   */
  public GoogleCloudRunV2Container setWorkingDir(java.lang.String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  @Override
  public GoogleCloudRunV2Container set(String fieldName, Object value) {
    return (GoogleCloudRunV2Container) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2Container clone() {
    return (GoogleCloudRunV2Container) super.clone();
  }

}
