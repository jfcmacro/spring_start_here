package org.jfcmc.sprstahere.chap05.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.jfcmc.sprstahere.chap05.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
  }
}
