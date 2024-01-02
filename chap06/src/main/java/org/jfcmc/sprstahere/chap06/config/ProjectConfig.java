package org.jfcmc.sprstahere.chap06.config;

import org.jfcmc.sprstahere.chap06.aspects.LoggingAspect;
import org.jfcmc.sprstahere.chap06.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.jfcmc.sprstahere.chap06.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect loggingAspect() {
	return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
	return new SecurityAspect();
    }

}
