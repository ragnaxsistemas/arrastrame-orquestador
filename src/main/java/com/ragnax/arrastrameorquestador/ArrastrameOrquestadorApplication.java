package com.ragnax.arrastrameorquestador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ragnax.arrastrameorquestador.configuration.FactoryApiProperties;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties(FactoryApiProperties.class)
public class ArrastrameOrquestadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrastrameOrquestadorApplication.class, args);
	}

}
