package com.nttdata.spring.services;

import com.nttdata.spring.repository.Customer;

/**
 * Formación - Spring - Taller 3
 * 
 * Servicio
 * 
 * @author NTT Data Sevilla
 *
 */
public interface CustomerManagementServiceI {

	/**
	 * Añade un nuevo cliente.
	 * 
	 * @param newCustomer
	 * @return Customer
	 */
	public Customer insertNewCustomer(final Customer newCustomer);

	/**
	 * Consulta todos los clientes.
	 */
	public void searchAllCustomers();

	/**
	 * Búsqueda por nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 */
	public void searchByFullName(final String name, final String surname1, final String surname2);

	/**
	 * Búsqueda por nombre.
	 * 
	 * @param name
	 */
	public void searchByName(final String name);

}
