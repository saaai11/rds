package com.rds.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentApplication.class, args);
	}

}
