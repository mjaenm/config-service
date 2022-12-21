package com.nttdata.hibernate.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * Entidad de tabla NTTDATA_CONTRATO
 * 
 * @author Miriam
 *
 */
@Entity
@Table(name = "NTTDATA_CONTRATO")
public class Contrato extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long contratoId;

	/** Equipo asociado (FK) */
	private Cliente cliente;

	/**
	 * @return the clienteId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONTRATO_ID")
	public Long getContratoId() {
		return contratoId;
	}

	/**
	 * @param contratoId
	 *            the contratoId to set
	 */
	public void setContratoId(Long contratoId) {
		this.contratoId = contratoId;
	}

	/**
	 * @return the name
	 */
	

	/**
	 * @return the cliente
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CLIENTE_ID", referencedColumnName = "CLIENTE_ID")
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Transient
	public Class<?> getClase() {
		return Contrato.class;
	}

	@Override
	public Long getId() {
		return this.contratoId;
	}

	@Override
	public void setId(Long id) {
		this.contratoId = id;
	}

}
