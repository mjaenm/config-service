package com.nttdata.hibernate.persistence;

import org.hibernate.Session;

/**
 * Formación - Hibernate - Ejemplo
 * 
 * DAO de tabla NTTDATA_HEX_CONTRACT
 * 
 * @author NTT Data Sevilla
 *
 */
public class ContratoDaoImpl extends CommonDaoImpl<Contrato> implements ContratoDaoI {

	/** Sesión de conexión a BD */
	private Session session;

	/**
	 * Método constructor
	 */
	public ContratoDaoImpl(Session session) {
		super(session);
		this.setSession(session);
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
