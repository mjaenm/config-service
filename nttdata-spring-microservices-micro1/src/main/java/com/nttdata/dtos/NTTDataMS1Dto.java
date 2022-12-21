package com.nttdata.dtos;

/**
 * 
 * DTO de información.
 * 
 * @author Miriam
 *
 */
public class NTTDataMS1Dto {

	/** Nombre de la aplicación */
	private String applicationName;

	/** Puerto de escucha */
	private String port;

	/**
	 * 
	 * @return the application name
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;

	}

	/**
	 * 
	 * @return the port
	 */
	public String port() {
		return port;
	}

	/**
	 * @param port the applicationName to set
	 */
	public void setPort(String port) {
		this.port = port;

	}
}
