package com.ragnax.arrastrameorquestador.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ragnax.arrastrameorquestador.controller.response.RagnaxError;
import com.ragnax.arrastrameorquestador.servicio.ArrastrameOrquestadorService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping
public class ArrastrameOrquestadorController {
	
	/****@GetMapping  no soporta Errors****/
	@Autowired
	ArrastrameOrquestadorService arrastrameOrquestadorService;

//	@GetMapping(value = "${servicio.app.uri.limpiarCache}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public void clearAllCaches() {
//		factoryArrastrameTripService.limpiarCacheLocal();
//	}

	

}
