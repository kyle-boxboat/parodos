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
package com.redhat.parodos.workflow.definition.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.parodos.workflow.WorkFlowDelegate;
import com.redhat.parodos.workflow.definition.dto.WorkFlowDefinitionResponseDTO;
import com.redhat.parodos.workflow.definition.dto.WorkFlowTaskDefinitionResponseDTO;
import com.redhat.parodos.workflow.definition.service.WorkFlowDefinitionServiceImpl;
import com.redhat.parodos.workflow.definition.service.WorkFlowTaskDefinitionServiceImpl;
import com.redhat.parodos.workflow.execution.dto.WorkFlowExecutionResponseDTO;
import com.redhat.parodos.workflow.execution.dto.WorkFlowTaskExecutionRequestDTO;
import com.redhat.parodos.workflow.execution.service.WorkFlowExecutionServiceImpl;

/**
 * controller
 *
 * @author Luke Shannon (Github: lshannon)
 * @author Richard Wang (Github: richardw98)
 * @author Annel Ketcha (Github: anludke)
 */
@CrossOrigin(origins = "*", maxAge = 1800)
@RestController
@RequestMapping("/api/v1/workflows-definitions")
public class WorkFlowDefinitionController {
    private final WorkFlowDefinitionServiceImpl workFlowDefinitionService;
    private final WorkFlowTaskDefinitionServiceImpl workFlowTaskDefinitionService;

    public WorkFlowDefinitionController(WorkFlowDefinitionServiceImpl workFlowDefinitionService, WorkFlowTaskDefinitionServiceImpl workFlowTaskDefinitionService, WorkFlowExecutionServiceImpl workFlowExecutionService, WorkFlowDelegate workFlowDelegate, ModelMapper modelMapper, ObjectMapper objectMapper) {
        this.workFlowDefinitionService = workFlowDefinitionService;
        this.workFlowTaskDefinitionService = workFlowTaskDefinitionService;

    }

    @GetMapping("/")
    public ResponseEntity<List<WorkFlowDefinitionResponseDTO>> getWorkFlowDefinitions() {
        return ResponseEntity.ok(workFlowDefinitionService.getWorkFlowDefinitions());
    }


//    @GetMapping("/{workFlowDefinitionId}/tasks")
//    public ResponseEntity<Collection<WorkFlowTaskDefinitionResponseDTO>> getWorkFlowTaskDefinitions(@PathVariable String workFlowDefinitionId) {
//        List<WorkFlowTaskDefinitionResponseDTO> workFlowTaskDefinitionResponseDTOs = workFlowDefinitionService.getWorkFlowTaskDefinitionById(UUID.fromString(workFlowDefinitionId));
//        return null;
//    }
}
