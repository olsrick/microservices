package com.demos.microservices.configdemosmicroservicesconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.config.server.EnableConfigServer
public class ConfigDemosMicroservicesConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDemosMicroservicesConfigureApplication.class, args);
	}
}
