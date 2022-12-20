package com.nttdata.hibernate.services;

import java.util.ArrayList;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;

import com.nttdata.hibernate.persistence.Cliente;
import com.nttdata.hibernate.persistence.ClienteDaoI;
import com.nttdata.hibernate.persistence.ClienteDaoImpl;

/**

 * 
 * Implementación de los clientes.
 * 
 * @author Miriam
 *
 */
public class ClienteManagementServiceImpl implements ClienteManagementServiceI {

	/** DAO: NTTDATA_CLIENTE */
	private ClienteDaoI clienteDao;

	/**
	 * Método constructor.
	 * @return 
	 */
	public void cliente(final Session session) {
		this.clienteDao = new ClienteDaoImpl(session);
	}

	@Override
	public void insertNewCliente(final Cliente newCliente) {

		// Verificación de nulidad e inexistencia.
		if (newCliente != null && newCliente.getClienteId() == null) {

			// Insercción del nuevo cliente.
			clienteDao.insert(newCliente);
		}

	}

	@Override
	public void updateCliente(final Cliente updatedCliente) {

		// Verificación de nulidad y existencia.
		if (updatedCliente != null && updatedCliente.getClienteId() != null) {

			// Actualización del cliente.
			clienteDao.update(updatedCliente);
		}

	}

	@Override
	public void deleteCliente(final Cliente deletedCliente) {

		// Verificación de nulidad y existencia.
		if (deletedCliente != null && deletedCliente.getClienteId() != null) {

			// Eliminación del cliente.
			clienteDao.delete(deletedCliente);
		}

	}

	@Override
	public Cliente searchById(final Long clienteId) {

		// Resultado.
		Cliente cliente = null;

		// Verificación de nulidad.
		if (clienteId != null) {

			// Obtención del cliente por ID.
			cliente = clienteDao.searchById(clienteId);
		}

		return cliente;
	}

	@Override
	public List<Cliente> searchByName(final String name) {

		// Resultado.
		List<Cliente> clientesList = new ArrayList<>();

		// Verificación de nulidad.
		if (StringUtils.isNotBlank(name)) {

			// Obtención del cliente por nombre.
			clientesList = clienteDao.searchByName(name);
		}

		return clientesList;
	}

	@Override
	public List<Cliente> searchAll() {

		// Resultado.
		List<Cliente> clientesList = new ArrayList<>();

		// Obtención de cliente.
		clientesList = clienteDao.searchAll();

		return clientesList;
	}

	@Override
	public List<Cliente> searchByNameAndSurname(String name, String surname) {
		
		// Resultado.
		List<Cliente> clientesList = new ArrayList<>();

		// Obtención de clientes.
		clientesList = clienteDao.searchByNameAndSurname(name, surname);

		return clientesList;
	}

}
