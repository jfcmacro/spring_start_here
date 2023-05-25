package org.jfcmc.sprstahere.chap02;

import
    org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.jfcmc.sprstahere.chap02.config.ProjectConfig;

public class Main {

    public static void main(String[] args) {
        var context =
            new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("parrot2", Parrot.class);

        System.out.println(p.getName());
    }
}
