package com.example.prueba;

import com.example.prueba.Persistencia.Repositorios.RepositorioPacientes;
import com.example.prueba.model.personas.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class }*/)
@RestController
@EnableJpaRepositories("com.example.prueba.Persistencia.Repositorios")
public class PruebaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@GetMapping("/hola")
	public String hola(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
		return String.format("Hola %s!", nombre);
	}


	@Autowired
	private RepositorioPacientes reposiotrioPacientes;

	@Override
	public void run(String... args) throws Exception{

		Paciente paciente = new Paciente();
		paciente.setApellido("piaggio"); paciente.setNombre("facundo");

		//reposiotrioPacientes.save(paciente);
	}

}
