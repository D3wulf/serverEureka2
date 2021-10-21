package Eureka2.reto.serverEureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerEureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerEureka2Application.class, args);
	}

}
