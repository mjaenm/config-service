package com.nttdata.hibernate.persistence;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Hibernate - Ejemplo
 * 
 * Entidad de tabla NTTDATA_CLIENTE
 * 
 * @author Miriam
 *
 */

@Entity
@Table(name = "NTTDATA_CLIENTE")
public class Cliente extends AbstractEntity implements Serializable {


	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long ClienteId;

	/** Nombre del cliente */
	private String name;

	/** Apellido1 del cliente */
	private String surname;

	/** Apellido2 del cliente */
	private String secondsurname;

	/**
	 * @return the ClienteId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLIENTE_ID")
	public Long getClienteId() {
		return ClienteId;
	}

	/**
	 * @param clienteId
	 *            the clienteId to set
	 */
	public void setClienteId(Long clienteId) {
		this.ClienteId = clienteId;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @return the name
	 */
	@Column(name = "SURNAME", nullable = false)
	public String getSurname() {
		return surname;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Cliente [clienteId=" + ClienteId + ", name=" + name + ", surname=" + surname +  "]";
	}

	@Transient
	public Class<?> getClase() {
		return Cliente.class;
	}

	@Override
	public Long getId() {
		return this.ClienteId;
	}

	@Override
	public void setId(Long id) {
		this.ClienteId = id;
	}

	public String getSecondsurname() {
		return secondsurname;
	}

	public void setSecondsurname(String secondsurname) {
		this.secondsurname = secondsurname;
	}

}
