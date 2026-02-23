package io.github.joczar.starling.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StarlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarlingApplication.class, args);
	}

}
