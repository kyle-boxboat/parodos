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
package com.redhat.parodos.workflow.version;

import java.io.IOException;
/**
 * Provides functionality interface to get hash of a workflow related class
 *
 * @author Richard Wang (Github: richardw98)
 * @author Annel Ketcha (Github: anludke)
 */

public interface WorkFlowVersionService {
    String getHash(Object workFlowRef) throws IOException;
}
