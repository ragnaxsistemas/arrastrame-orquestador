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

	@Override
	public void obtenerValoresAplicacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginUsuarioClienteAsistencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarContrasenha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarUsuarioClienteAsistencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarContrasenha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviarEmailConfirmacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarDatosPagoUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarUsuarioClienteAsistencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarContrasenha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTipoAsistencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTipoGruaVehiculo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTipoSuperficieAsistencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTipoVehiculoAsistencia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarEstadoRuedasVehiculo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarAsistenciaTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarEventoAsistencia() {
		// TODO Auto-generated method stub
		
	}
	
//	@Autowired
//	private ZapalaClienteRest zapalaClienteRest;
	

	
	
	
	
}
