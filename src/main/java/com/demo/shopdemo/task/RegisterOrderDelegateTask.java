package com.demo.shopdemo.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// com.demo.shopdemo.task.RegisterOrderDelegateTask
public class RegisterOrderDelegateTask implements JavaDelegate {

	private static final Logger log = LoggerFactory.getLogger(RegisterOrderDelegateTask.class);

	public void execute(DelegateExecution execution) throws Exception {
		log.info("New Order request received ");
		log.info("New Order process start ");
		log.info("New Order process complete ");
		
	}
	
	
}
