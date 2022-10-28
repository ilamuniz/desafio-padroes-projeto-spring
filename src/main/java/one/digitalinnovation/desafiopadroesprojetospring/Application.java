package one.digitalinnovation.desafiopadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto gerado no Spring Initializr
 * Módulos selecionados:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * - OpenFeign
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
