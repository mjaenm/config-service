package com.nttdata.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio
 * 
 * @author Miriam
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	/**
	 * Obtención del cliente mediante el nombre.
	 * 
	 * @param name
	 * @return List<Customer>
	 */
	public List<Customer> findByName(final String name);

	/**
	 * Obtención del cliente mediante el nombre completo con sus apellidos.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 * @return List<Customer>
	 */
	public List<Customer> findByNameAndSurName1AndSurName2(final String name, final String surname1, final String surname2);

}
