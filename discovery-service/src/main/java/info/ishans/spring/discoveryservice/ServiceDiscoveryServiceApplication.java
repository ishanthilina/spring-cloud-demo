package info.ishans.spring.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryServiceApplication.class, args);
	}
}
