package tn.globebusiness.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GlobeBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobeBusinessApplication.class, args);
	}

}
