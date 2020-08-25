/*
 * Copyright 2020 FlowSquad GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.flowcov.camunda.junit.rules;

import java.util.List;

public class DefaultCoverageTestRunStateFactory implements CoverageTestRunStateFactory {
    @Override
    public CoverageTestRunState create(String className, List<String> excludedProcessDefinitionKeys) {
        CoverageTestRunState coverageTestRunState = new DefaultCoverageTestRunState();
        coverageTestRunState.setTestClassName(className);
        coverageTestRunState.setExcludedProcessDefinitionKeys(excludedProcessDefinitionKeys);
        return coverageTestRunState;
    }
}
