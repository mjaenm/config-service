package com.nttdata.services;

import org.springframework.beans.factory.annotation.Value;

import com.nttdata.dtos.NTTDataMS1Dto;

/**
 * 
 * Servicio de información de la App
 * 
 * @author Miriam
 */
public class NTTDataMS1ServiceImpl implements NTTDataMS1ServiceI {
	
	/** Nombre de la aplicación*/
	@Value("${spring.application.name}")
	private String applicationName;
	
	/**Puerto de escucha*/
	@Value("${server.port}")
	private String port;
	
	@Override
	public NTTDataMS1Dto getAppDataInfo() {
	
	//Generación de DTO informativo.
	final NTTDataMS1Dto resultDto = new NTTDataMS1Dto();
	
	resultDto.setApplicationName(applicationName);
	resultDto.setPort(port);
	
	return null;
}

}