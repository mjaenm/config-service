package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.nttdata.spring.repository.Customer;
import com.nttdata.spring.repository.CustomerRepository;

/**
 * Formación - Spring - Taller 3
 * 
 * Servicio
 * 
 * @author NTT Data Sevilla
 *
 */
@Service
public class CustomerManagementServiceImpl implements CustomerManagementServiceI {

	/** Repositorio - Tabla: T_CUSTOMER */
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer insertNewCustomer(Customer newCustomer) {

		// Verificación de nulidad.
		if (newCustomer != null && newCustomer.getId() == null) {

			// Insercción de cliente.
			newCustomer = customerRepository.save(newCustomer);
		}

		return newCustomer;
	}

	@Override
	public void searchAllCustomers() {

		// Consulta clientes.
		final Iterable<Customer> customerList = customerRepository.findAll();

		// Itera e imprime los clientes.
		customerList.forEach((final Customer customer) -> System.out.println(customer.toString()));
	}

	@Override
	public void searchByFullName(final String name, final String surname1, final String surname2) {

		// Obtención del listado de clientes por nombre completo.
		final List<Customer> searchClients = customerRepository.findByNameAndSurName1AndSurName2(name, surname1, surname2);

		// Muestra el listado obtenido.
		printCustomers(searchClients);
	}

	@Override
	public void searchByName(final String name) {

		// Obtención del listado de clientes por nombre.
		final List<Customer> searchCustomers = customerRepository.findByName(name);

		// Muestra el listado obtenido.
		printCustomers(searchCustomers);
	}

	/**
	 * Recorre e imprime listado de clientes.
	 * 
	 * @param searchCustomers
	 */
	private void printCustomers(final List<Customer> searchCustomers) {
		if (!CollectionUtils.isEmpty(searchCustomers)) {
			for (Customer customer : searchCustomers) {
				System.out.println(customer.toString());
			}
		}
	}

}
