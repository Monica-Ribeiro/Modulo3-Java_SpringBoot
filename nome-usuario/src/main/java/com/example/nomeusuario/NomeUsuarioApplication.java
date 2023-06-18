package com.example.nomeusuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/login")
public class NomeUsuarioApplication {
	@GetMapping("/{usuario}")
	public boolean validaAdmin(@PathVariable String usuario){
		if (usuario.equals("admin")){
			return true;
		}
		else {
			return false;
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(NomeUsuarioApplication.class, args);
	}

}
