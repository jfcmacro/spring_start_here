package org.jfcmc.sprstahere.chap05.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = {
        "org.jfcmc.sprstahere.chap05.services"})
public class ProjectConfig {
}
