package com.log.app.demo;

import org.apache.log4j.Logger;

public class Service {

	private static Logger log=Logger.getLogger(Service.class);
	public void helloService() {
		
		
		log.info("Inside the helloService()");

		log.info("Executed successfully the helloService()");
	}
}
