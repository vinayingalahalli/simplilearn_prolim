package com.app.producer;

import javax.xml.ws.Endpoint;

import com.app.service.impl.CalculatorServiceImpl;

public class ProducerMain {

	public static void main(String[] args) {
		
		String url="http://localhost:8000/calculator";
		Endpoint.publish(url, new CalculatorServiceImpl());
		
		System.out.println("Heyy your service is published successfully");
		System.out.println("Url of your service endpoint is "+url+"?wsdl");
		System.out.println("Open the above url in any of your browser to check the wsdl");
		System.out.println("Also do give the same url to your clients to consume the services....");

	}

}
