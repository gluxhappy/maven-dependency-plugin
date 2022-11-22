/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.plugins.dependency.analyze;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * Analyzes the dependencies of this project and determines which are: used and declared; used and undeclared; unused
 * and declared. This goal is intended to be used in the build lifecycle, thus it assumes that the
 * <code>test-compile</code> phase has been executed - use the <code>dependency:analyze</code> goal instead when running
 * standalone.
 * <p>
 * By default, <a href="http://maven.apache.org/shared/maven-dependency-analyzer/">maven-dependency-analyzer</a> is used
 * to perform the analysis, with limitations due to the fact that it works at bytecode level, but any analyzer can be
 * plugged in through <code>analyzer</code> parameter.
 * </p>
 *
 * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a>
 * @see AnalyzeMojo
 * @since 2.0
 */
// @formatter:off
@Mojo(
        name = "analyze-only",
        requiresDependencyResolution = ResolutionScope.TEST,
        defaultPhase = LifecyclePhase.VERIFY,
        threadSafe = true)
// @formatter:on
public class AnalyzeOnlyMojo extends AbstractAnalyzeMojo {
    // subclassed to provide annotations
}
