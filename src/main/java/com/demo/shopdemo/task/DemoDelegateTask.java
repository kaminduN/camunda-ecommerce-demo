package com.demo.shopdemo.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoDelegateTask implements JavaDelegate {

	private static final Logger log = LoggerFactory.getLogger(DemoDelegateTask.class);
	
	public void execute(DelegateExecution execution) throws Exception {
	    
		
	    log.info("inside DemoTask");
	}

}
