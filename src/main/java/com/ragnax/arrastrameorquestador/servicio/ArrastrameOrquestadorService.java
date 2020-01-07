package com.ragnax.arrastrameorquestador.servicio;

public interface ArrastrameOrquestadorService {
	
	public void obtenerValoresAplicacion();
	
	public void loginUsuarioClienteAsistencia();
	
	public void recuperarContrasenha();
	
	public void validarUsuarioClienteAsistencia();
	
	public void validarEmail();
	
	public void validarContrasenha();
	
	public void enviarEmailConfirmacion();
	
	public void registrarDatosPagoUsuario();
	
	public void registrarUsuarioClienteAsistencia();
	
	public void editarUsuario();
	
	public void cambiarContrasenha();
		
	public void listarTipoAsistencia();
	
	public void listarTipoGruaVehiculo();
	
	public void listarTipoSuperficieAsistencia();
	
	public void listarTipoVehiculoAsistencia();
	
	public void listarEstadoRuedasVehiculo();
	
	public void solicitarAsistenciaTest();
	
	public void registrarEventoAsistencia();
   
}
