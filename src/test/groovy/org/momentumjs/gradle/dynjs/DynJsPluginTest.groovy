/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.momentumjs.gradle.dynjs

import static org.junit.Assert.*

import org.gradle.api.internal.project.DefaultProject
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

import org.momentumjs.gradle.jsengine.JsEngineRegistry


class DynJsPluginTest
{
    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    @Test
    public void embeddedEnginePlugin() {
        DefaultProject project = (DefaultProject) ProjectBuilder.builder()
                .withProjectDir(folder.getRoot())
                .build()
        project.apply plugin: 'dynjs'

        JsEngineRegistry registry = project.modelRegistry.get("jsEngines", JsEngineRegistry)

        assertTrue(registry.size() >= 1);
    }

}
