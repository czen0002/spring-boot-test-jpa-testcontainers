package io.czen.testjpatestcontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TestJpaTestcontainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJpaTestcontainersApplication.class, args);
	}

}
