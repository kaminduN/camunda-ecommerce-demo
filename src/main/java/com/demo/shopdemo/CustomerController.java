package com.demo.shopdemo;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@GetMapping("/start")
	void startProcess() {
		
		log.info("Lets start the process");
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	    RuntimeService runtimeService=processEngine.getRuntimeService();
//	    ProcessInstance instance = runtimeService.startProcessInstanceByKey(processKey, businessKey, variables);
	}
	
}
