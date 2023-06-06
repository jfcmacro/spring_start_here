package org.jfcmc.sprstahere.chap06.config;

import org.jfcmc.sprstahere.chap06.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.jfcmc.sprstahere.chap06.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}
