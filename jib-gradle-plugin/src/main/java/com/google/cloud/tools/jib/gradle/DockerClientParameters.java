/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.tools.jib.gradle;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import javax.annotation.Nullable;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Optional;

/**
 * Object in {@link BuildDockerTask} that configures the Docker executable and the additional
 * environment variables to use when executing the executable.
 */
class DockerClientParameters {

  @Nullable private Path executable;
  @Nullable private Map<String, String> environment;

  @Input
  @Nullable
  @Optional
  public Path getExecutable() {
    return executable;
  }

  public void setExecutable(String executable) {
    this.executable = Paths.get(executable);
  }

  @Input
  @Nullable
  @Optional
  public Map<String, String> getEnvironment() {
    return environment;
  }
}