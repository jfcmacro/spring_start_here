package org.jfcmc.sprstahere.chap02.config;

import org.jfcmc.sprstahere.chap02.Parrot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Riki");
        return p;
    }
}
