package eu.ensup.gestionglasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class GestionGlassesApplication {

	@GetMapping("/")
	String home() {
		return "redirect:/glasses/list";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestionGlassesApplication.class, args);
	}

}
