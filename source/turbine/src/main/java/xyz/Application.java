package xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;


/*//@Configuration
//@EnableAutoConfiguration
//@EnableDiscoveryClient
@SpringCloudApplication
@EnableTurbine*/

@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
