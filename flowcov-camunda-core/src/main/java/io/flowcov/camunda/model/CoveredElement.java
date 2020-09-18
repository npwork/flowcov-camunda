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

package io.flowcov.camunda.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An element covered by a test.
 */
@Getter
@Setter
@EqualsAndHashCode
public abstract class CoveredElement {

    /**
     * The key of the elements process definition.
     */
    protected String processDefinitionKey;

    /**
     * The start time of the element
     */
    protected Integer executionStartCounter;

    /**
     * Retrieves the element's ID.
     *
     * @return
     */
    public abstract String getElementId();

}
