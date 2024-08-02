package br.edu.iftm.prova;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.prova.model.Pacote;

@SpringBootApplication
public class ProvaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pacote pacote = new Pacote();
		pacote.setDestinatario("Teste Destinatário");
		System.out.println(pacote.getDestinatario());
	}

}
