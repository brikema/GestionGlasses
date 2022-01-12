package eu.ensup.gestionglasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GestionGlassesApplication {

	@RequestMapping("/")
	String home() {
		return "toto";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestionGlassesApplication.class, args);
	}

}
