package org.jfcmc.sprstahere.chap03.config;

import org.jfcmc.sprstahere.chap03.beans.Parrot;
import org.jfcmc.sprstahere.chap03.beans.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
