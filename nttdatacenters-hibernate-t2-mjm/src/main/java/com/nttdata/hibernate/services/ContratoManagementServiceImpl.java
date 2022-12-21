package com.nttdata.hibernate.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.nttdata.hibernate.persistence.Contrato;
import com.nttdata.hibernate.persistence.ContratoDaoI;
import com.nttdata.hibernate.persistence.ContratoDaoImpl;

/**
 * 
 * Implementación del servicio de contratos.
 * 
 * @author Miriam
 *
 */
public class ContratoManagementServiceImpl implements ContratoManagementServiceI {

	/** DAO: NTTDATA_CONTRATO */
	private ContratoDaoI contratoDao;

	/**
	 * Método constructor.
	 */
	public ContratoManagementServiceImpl(final Session session) {
		this.contratoDao = new ContratoDaoImpl(session);
	}

	@Override
	public void insertNewContrato(final Contrato newContrato) {

		// Verificación de nulidad e inexistencia.
		if (newContrato != null && newContrato.getContratoId() == null) {

			// Insercción del nuevo contrato.
			contratoDao.insert(newContrato);
		}

	}

	public void updateContrato(final Contrato updatedContrato) {

		// Verificación de nulidad y existencia.
		if (updatedContrato != null && updatedContrato.getContratoId() != null) {

			// Actualización del contrato.
			contratoDao.update(updatedContrato);
		}

	}

	@Override
	public void deleteContrato(final Contrato deletedContrato) {

		// Verificación de nulidad y existencia.
		if (deletedContrato != null && deletedContrato.getContratoId() != null) {

			// Eliminación del contrato.
			contratoDao.delete(deletedContrato);
		}

	}

	@Override
	public Contrato searchById(final Long contratoId) {

		// Resultado.
		Contrato contrato = null;

		// Verificación de nulidad.
		if (contratoId != null) {

			// Obtención del contrato por ID.
			contrato = contratoDao.searchById(contratoId);
		}

		return contrato;
	}

	@Override
	public List<Contrato> searchAll() {

		// Resultado.
		List<Contrato> contratosList = new ArrayList<>();

		// Obtención de contratos.
		contratosList = contratoDao.searchAll();

		return contratosList;
	}


	@Override
	public void updateCliente(Contrato updatedContrato) {
		
	}

	

}

