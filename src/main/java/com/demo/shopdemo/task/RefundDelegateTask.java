package com.demo.shopdemo.task;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// com.demo.shopdemo.task.RefundDelegateTask
public class RefundDelegateTask  implements JavaDelegate {

	private static final Logger log = LoggerFactory.getLogger(RefundDelegateTask.class);

	public void execute(DelegateExecution execution) throws Exception {
		log.info("Refund request received ");
		log.info("Refund request process start ");
		log.info("Refund request process complete ");
		
	}
	
	
}
