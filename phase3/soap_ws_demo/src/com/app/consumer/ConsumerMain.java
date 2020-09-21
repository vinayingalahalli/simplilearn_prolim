package com.app.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.app.service.CalculatorService;

public class ConsumerMain {

	public static void main(String[] args) {
		String endpoint="http://localhost:8000/calculator?wsdl";
		
		try {
			URL url=new URL(endpoint);
			QName qname=new QName("http://impl.service.app.com/", "CalculatorServiceImplService");
			Service service=Service.create(url,qname);
			CalculatorService calculatorService=service.getPort(CalculatorService.class);
			System.out.println(calculatorService.sayHello());
			
			System.out.println(calculatorService.add(100, 1212));
			System.out.println(calculatorService.multiply(99, 999));
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
	}

}
