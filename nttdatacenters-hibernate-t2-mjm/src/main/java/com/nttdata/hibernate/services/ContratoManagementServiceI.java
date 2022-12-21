package com.nttdata.hibernate.services;


import java.util.List;

import com.nttdata.hibernate.persistence.Contrato;

/**
 
 * Interface del servicio de contratos.
 * 
 * @author Miriam
 *
 */
public interface ContratoManagementServiceI {

	/**
	 * Inserta un nuevo contrato.
	 * 
	 * @param newCliente
	 */
	public void insertNewContrato(final Contrato newContrato);

	/**
	 * Actualiza un contrato existente.
	 * 
	 * @param updatedCliente
	 */
	public void updateCliente(final Contrato updatedContrato);

	/**
	 * Elimina un contrato existente.
	 * 
	 * @param deletedCliente
	 */
	public void deleteContrato(final Contrato deletedContrato);

	/**
	 * Obtiene un contrato mediante su ID.
	 * 
	 * @param clienteId
	 */
	public Contrato searchById(final Long contratoId);

	/**
	 * Obtiene todos los contratos existentes.
	 * 
	 * @return List<Contrato>
	 */
	public List<Contrato> searchAll();

	void updateContrato(Contrato updatedContrato);

}

