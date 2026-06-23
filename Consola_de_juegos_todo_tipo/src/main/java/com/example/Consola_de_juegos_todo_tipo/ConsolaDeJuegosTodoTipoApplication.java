package com.example.Consola_de_juegos_todo_tipo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConsolaDeJuegosTodoTipoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsolaDeJuegosTodoTipoApplication.class, args);
	}

}
