package com.demo.shopdemo.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//com.demo.shopdemo.task.OrderStatusDelegate
@Component()
public class OrderStatusDelegate implements JavaDelegate {

	private static final Logger log = LoggerFactory.getLogger(OrderStatusDelegate.class);

	public void execute(DelegateExecution execution) throws Exception {
		String messageName = (String) execution.getVariable("messageName");
		String businessKey = execution.getProcessBusinessKey();
		
		log.info("Shop: Order dispatch request received ");
		log.info("Shop: Order dispatch process start ");
		
		
		
		
		log.info("Sending message {} with business key constraint {}", messageName, businessKey);
		
		execution.getProcessEngineServices()
	      .getRuntimeService()
	      .createMessageCorrelation(messageName)
	      .processInstanceBusinessKey(businessKey)
	      .correlate();
		
		
		
		log.info("Shop: Order dispatch process complete ");
			}
	
	
}
