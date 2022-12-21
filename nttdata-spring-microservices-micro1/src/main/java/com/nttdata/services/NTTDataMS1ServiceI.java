package com.nttdata.services;

import com.nttdata.dtos.NTTDataMS1Dto;
/**
 * Interface del servicio de información de la APP.
 * 
 * @author Miriam
 *
 */

public interface NTTDataMS1ServiceI {
	
	/**
	 * Retorna la información básica de la app
	 * 
	 * @return NTTDataMS1Dto
	 */

		public NTTDataMS1Dto getAppDataInfo();

}
