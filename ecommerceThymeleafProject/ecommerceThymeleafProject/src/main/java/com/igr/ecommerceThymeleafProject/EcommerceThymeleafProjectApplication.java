package com.igr.ecommerceThymeleafProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.igr.ecommerceThymeleafProject.repository")
@SpringBootApplication
public class EcommerceThymeleafProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceThymeleafProjectApplication.class, args);
	}

}
