package org.jfcmc.sprstahere.chap02.config;

import org.jfcmc.sprstahere.chap02.Parrot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
