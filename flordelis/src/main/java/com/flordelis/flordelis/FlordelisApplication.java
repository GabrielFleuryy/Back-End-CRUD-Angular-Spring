package com.flordelis.flordelis;

import com.flordelis.flordelis.model.House;
import com.flordelis.flordelis.repository.HouseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlordelisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlordelisApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(HouseRepository homeRepository){
		return args -> {
			homeRepository.deleteAll();

			House home = new House();
			home.setName("Flor DElis");
			home.setCategory("Casa");
			home.setStatus("inativo");

			homeRepository.save(home);
		};
	}

}
