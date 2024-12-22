package co.unicauca.gsrpi_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "co.unicauca.gsrpi_api")
public class GsrpiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsrpiApiApplication.class, args);
	}

}
