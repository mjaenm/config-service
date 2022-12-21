package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * Clase principal
 * 
 * @author Miriam
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NttdataSpringMicroservicesMicro1Application {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMicroservicesMicro1Application.class, args);
	}

}
