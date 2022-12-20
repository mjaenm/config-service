package com.nttdata.hibernate.persistence;
import java.util.List;
/**
 * 
 * DAO de tabla NTTDATA_CLIENTE
 * 
 * @author Miriam
 *
 */

public interface ClienteDaoI extends CommonDaoI<Cliente> {

	/**
	 * Obtiene cliente por nombre y apellido.
	 * 
	 * @param name
	 * @param surname
	 * @return List<Cliente>
	 */
	public List<Cliente> searchByNameAndSurname(final String name, final String surname);
	
	/**
	 * Obtiene clientes por nombre.
	 * 
	 * @param name
	 * @return List<Cliente>
	 */
	public List<Cliente> searchByName(final String name);

}
