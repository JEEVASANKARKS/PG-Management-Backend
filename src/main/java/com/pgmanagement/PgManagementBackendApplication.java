package com.pgmanagement.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.pgmanagement")
@EnableJpaRepositories(basePackages = "com.pgmanagement.Admin.repositories")
@EntityScan(basePackages = "com.pgmanagement.Admin.model")
public class PgManagementBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgManagementBackendApplication.class, args);
	}

}
