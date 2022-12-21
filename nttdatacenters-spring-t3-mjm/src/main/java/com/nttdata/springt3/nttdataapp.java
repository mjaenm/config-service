package com.nttdata.springt3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Customer;
import com.nttdata.spring.services.CustomerManagementServiceI;

/**
 *Clase principal
 * 
 * @author Miriam
 *
 */
@SpringBootApplication
public class nttdataapp implements CommandLineRunner {

	/** Servicio de gestión de clientes */
	@Autowired
	private CustomerManagementServiceI customerService;

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(nttdataapp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("----- NTT DATA SYS - INI -----");

		// Nuevos clientes.
		final Customer newCustomer1 = new Customer();
		newCustomer1.setName("Mirian");
		newCustomer1.setSurName1("Jaén");
		newCustomer1.setSurName2("Valverde");
		newCustomer1.setIdentityDocNumber("83294366A");
		customerService.insertNewCustomer(newCustomer1);

		final Customer newCustomer2 = new Customer();
		newCustomer2.setName("Manuel");
		newCustomer2.setSurName1("Brazo");
		newCustomer2.setSurName2("Puerta");
		newCustomer2.setIdentityDocNumber("30111525B");
		customerService.insertNewCustomer(newCustomer2);

		final Customer newCustomer3 = new Customer();
		newCustomer3.setName("María");
		newCustomer3.setSurName1("Cano");
		newCustomer3.setSurName2("Sánchez");
		newCustomer3.setIdentityDocNumber("27210888C");
		customerService.insertNewCustomer(newCustomer3);

		System.out.println("----- INICIO TODOS LOS CLIENTES -----");

		// Muestra todos los clientes.
		customerService.searchAllCustomers();

		System.out.println("----- FIN TODOS LOS CLIENTES -----");

		System.out.println("----- INICIO TODOS LOS CLIENTES POR NOMBRE -----");

		// Obtiene los clientes por nombre.
		customerService.searchByName("Miriam");

		System.out.println("----- FIN TODOS LOS CLIENTES POR NOMBRE -----");

		System.out.println("----- FIN TODOS LOS CLIENTES POR NOMBRE Y APELLIDOS -----");

		// Obtiene los clientes por nombre y apellidos.
		customerService.searchByFullName("Miriam", "Jaén", "Valverde");

		System.out.println("----- FIN TODOS LOS CLIENTES POR NOMBRE Y APELLIDOS -----");

		System.out.println("----- NTT DATA SYS - FIN -----");
	}

}

