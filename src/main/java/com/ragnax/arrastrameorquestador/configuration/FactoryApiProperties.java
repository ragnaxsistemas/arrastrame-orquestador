package com.ragnax.arrastrameorquestador.configuration;

import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:factoryapi.properties")
@ConfigurationProperties(prefix = "factory")
/****Properties que pueden cambiar el valor, todas las variables que serian final static String****/
public class FactoryApiProperties {
	
	private Configdata configdata;
	
	
    public static class Configdata {
    	
private String fechayyyyMMddTHHmmssZ;
    	
    	@NotBlank
		private String estadoActivoConsulta;
    	
    	@NotBlank
		private String estadoInactivoConsulta;

		public String getEstadoActivoConsulta() {
			return estadoActivoConsulta;
		}
		
		public void setEstadoActivoConsulta(String estadoActivoConsulta) {
			this.estadoActivoConsulta = estadoActivoConsulta;
		}
		
		public String getEstadoInactivoConsulta() {
			return estadoInactivoConsulta;
		}
		
		public void setEstadoInactivoConsulta(String estadoInactivoConsulta) {
			this.estadoInactivoConsulta = estadoInactivoConsulta;
		}
		
		public String getFechayyyyMMddTHHmmssZ() {
			return fechayyyyMMddTHHmmssZ;
		}
		
		public void setFechayyyyMMddTHHmmssZ(String fechayyyyMMddTHHmmssZ) {
			this.fechayyyyMMddTHHmmssZ = fechayyyyMMddTHHmmssZ;
		}
    }
	
	public Configdata getConfigdata() {
		return configdata;
	}

	public void setConfigdata(Configdata configdata) {
		this.configdata = configdata;
	}

}