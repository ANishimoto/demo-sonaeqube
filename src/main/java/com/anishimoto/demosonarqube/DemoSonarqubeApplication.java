package com.anishimoto.demosonarqube;

import com.anishimoto.demosonarqube.core.config.CoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSonarqubeApplication {

	public static void main(String[] args) {

		SpringApplication.run(new Class[] {CoreConfiguration.class}, args);
	}

}
