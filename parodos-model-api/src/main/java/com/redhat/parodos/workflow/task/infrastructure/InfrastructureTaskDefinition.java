/*
 * Copyright (c) 2022 Red Hat Developer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.parodos.workflow.task.infrastructure;

import com.redhat.parodos.workflow.task.WorkFlowTaskType;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 *
 * Base Class for Infrastructure WorkFlowTasks. An implementation of this class would do an Infrastructure and return a
 *
 * @author Luke Shannon (Github: lshannon)
 *
 */
@Getter
@SuperBuilder
public class InfrastructureTaskDefinition {

	public WorkFlowTaskType getWorkFlowType() {
		return WorkFlowTaskType.INFRASTRUCTURE;
	}
}
