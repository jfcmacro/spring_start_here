package org.jfcmc.sprstahere.chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();
    }
}
