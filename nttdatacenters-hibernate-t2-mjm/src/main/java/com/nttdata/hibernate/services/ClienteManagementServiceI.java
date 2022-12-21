package com.nttdata.hibernate.services;

import java.util.List;
import com.nttdata.hibernate.persistence.Cliente;

/**
 * 
 * Interface del servicio de clientes.
 * 
 * @author Miriam
 *
 */

public interface ClienteManagementServiceI {


	/**
	 * Inserta un nuevo cliente.
	 * 
	 * @param newCliente
	 */
	public void insertNewCliente(final Cliente newCliente);

	/**
	 * Actualiza un cliente existente.
	 * 
	 * @param updatedCliente
	 * 
	 */
	public void updateCliente(final Cliente updatedCliente);

	/**
	 * Elimina un cliente existente.
	 * 
	 * @param deletedCliente
	 */
	public void deleteCliente(final Cliente deletedCliente);

	/**
	 * Obtiene un cliente mediante su ID.
	 * 
	 * @param clienteId
	 */
	public Cliente searchById(final Long clienteId);

	/**
	 * Obtiene un clientes por su nombre completo.
	 * 
	 * @param name
	 * @return List<Cliente>
	 */
	public List<Cliente> searchByName(final String name);

	/**
	 * Obtiene todos los clientes existentes.
	 * 
	 * @return List<Cliente>
	 */
	public List<Cliente> searchAll();

	/**
	 * Obtiene clientes por nombre y apellido.
	 * 
	 * @param name
	 * @param surname
	 * @return List<Cliente>
	 */
	public List<Cliente> searchByNameAndSurname(final String name, final String surname);

}
