package co.simplon.cinema2026;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cinema2026Application {

	public static void main(String[] args) {

		// controller : reçoit des appels HTTP et renvoie une réponse

		// persistance des données
		// - entitées : représentent les tables
		// - repository : échangent entre les entitées et la base de données (CRUD)

		SpringApplication.run(Cinema2026Application.class, args);
	}

}
