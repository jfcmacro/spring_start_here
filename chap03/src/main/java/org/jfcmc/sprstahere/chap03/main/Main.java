package org.jfcmc.sprstahere.chap03.main;

import org.jfcmc.sprstahere.chap03.beans.Parrot;
import org.jfcmc.sprstahere.chap03.beans.Person;
import
    org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.jfcmc.sprstahere.chap03.config.ProjectConfig;

public class Main {

    public static void main(String[] args) {
        var context =
            new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}
