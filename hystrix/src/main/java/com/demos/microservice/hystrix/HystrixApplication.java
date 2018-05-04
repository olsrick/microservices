package com.demos.microservice.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
public class HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}
}
