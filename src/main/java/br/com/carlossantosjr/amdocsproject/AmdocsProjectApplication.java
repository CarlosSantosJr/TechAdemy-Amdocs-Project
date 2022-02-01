package br.com.carlossantosjr.amdocsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication(scanBasePackages = "br.com.carlossantosjr.amdocsproject")
@EntityScan(basePackages = "br.com.carlossantosjr.amdocsproject.model")
public class AmdocsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmdocsProjectApplication.class, args);
	}

}
