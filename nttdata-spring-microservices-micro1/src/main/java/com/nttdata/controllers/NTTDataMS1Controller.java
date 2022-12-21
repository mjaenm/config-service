package com.nttdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.dtos.NTTDataMS1Dto;
import com.nttdata.services.NTTDataMS1ServiceI;

/**
 * Controlador Rest
 * 
 * @author Miriam
 *
 */

@RestController("api")
public class NTTDataMS1Controller {

	/**Servicio: información del aplicativo*/
	@Autowired
	private NTTDataMS1ServiceI nttDataService;
	
	@GetMapping("/whoAreYou")
	public NTTDataMS1Dto sendAppDataInfo() {
		// Invocación al servicio.
		return nttDataService.getAppDataInfo();
	}

}
