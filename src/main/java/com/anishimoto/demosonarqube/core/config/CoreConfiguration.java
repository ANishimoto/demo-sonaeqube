package com.anishimoto.demosonarqube.core.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = {"com.anishimoto.demosonarqube.core"})
public class CoreConfiguration {
}
