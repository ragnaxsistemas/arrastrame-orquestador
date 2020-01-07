package com.ragnax.arrastrameorquestador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ragnax.arrastrameorquestador.configuration.FactoryApiProperties;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties(FactoryApiProperties.class)
@EntityScan({"com.ragnax.domain.arrastramerepositorio.entidad", 
	"com.ragnax.domain.response.error", "com.ragnax.domain.sso.entidad", "com.ragnax.domain.ssoorquestador.modelo",
	"com.ragnax.domain.ventapago.entidad", "com.ragnax.domain.zapala.modelo"})
public class ArrastrameOrquestadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrastrameOrquestadorApplication.class, args);
	}

}
