package com.finwintech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WSConfigClient {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.finwintech.wsdl");
		return marshaller;
	}
	@Bean
	public BinClient articleClient(Jaxb2Marshaller marshaller) {
		BinClient client = new BinClient();
		client.setDefaultUri("http://localhost:8080/soapws/bins.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
