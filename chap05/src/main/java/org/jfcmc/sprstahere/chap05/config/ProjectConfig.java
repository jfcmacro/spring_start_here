package org.jfcmc.sprstahere.chap05.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.jfcmc.sprstahere.chap05.services", 
                               "org.jfcmc.sprstahere.chap05.repositories"})
public class ProjectConfig {

}
