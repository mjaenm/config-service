package nttdatamicroservicioseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



/**
 * Clase principal
 *
 * @author Miriam
 */

@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class NttDataEurekaApplication{
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NttDataEurekaApplication.class, args);
	}
}
