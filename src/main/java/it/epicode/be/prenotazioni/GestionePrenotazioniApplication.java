package it.epicode.be.prenotazioni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionePrenotazioniApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionePrenotazioniApplication.class, args);
		System.out.println("sono buone le pizze!");
	}

}
