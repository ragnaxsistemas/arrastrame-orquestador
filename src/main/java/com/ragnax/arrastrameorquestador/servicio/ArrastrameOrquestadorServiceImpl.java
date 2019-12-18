package com.ragnax.arrastrameorquestador.servicio;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ragnax.arrastrameorquestador.configuration.FactoryApiProperties;
import com.ragnax.arrastrameorquestador.servicio.clientes.ArrastrameRespositorioCliente;


@Service
@ComponentScan(basePackageClasses = { FactoryApiProperties.class})
public class ArrastrameOrquestadorServiceImpl implements ArrastrameOrquestadorService {

	private static final Logger objLog = LoggerFactory.getLogger(ArrastrameOrquestadorServiceImpl.class);
	
	@Autowired
	private FactoryApiProperties factoryApiProperties;
	
	@Autowired
	private ArrastrameRespositorioCliente arrastrameRespositorioCliente;
	
//	@Autowired
//	private ZapalaClienteRest zapalaClienteRest;
	

	
	
	
	
}
