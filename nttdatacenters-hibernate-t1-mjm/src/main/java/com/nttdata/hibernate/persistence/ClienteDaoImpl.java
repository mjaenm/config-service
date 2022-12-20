package com.nttdata.hibernate.persistence;

import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

/**
 
 * DAO de tabla NTTDATA_CLIENTE
 * 
 * @author NTT Data Sevilla
 *
 */
public class ClienteDaoImpl extends CommonDaoImpl<Cliente> implements ClienteDaoI {

	/** Sesión de conexión a BD */
	private Session session;

	/**
	 * Método constructor
	 */
	public ClienteDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> searchByName(final String name) {

		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Localiza clientes en función del nombre.
		final List<Cliente> playersList = session.createQuery("FROM Cliente WHERE name=" + name).list();

		return playersList;
	}

	@Override
	public List<Cliente> searchByNameAndSurname(final String name, final String surname) {

		// Consulta.
		final CriteriaBuilder cb = session.getCriteriaBuilder();
		final CriteriaQuery<Cliente> cquery = cb.createQuery(Cliente.class);
		// Ejecución de consulta.
		final List<Cliente> results = session.createQuery(cquery).getResultList();

		return results;
	}

	@Override
	public void insert(Cliente paramT) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente paramT) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cliente paramT) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente searchById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
