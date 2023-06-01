package org.jfcmc.sprstahere.chap05.main;

import
    org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.jfcmc.sprstahere.chap05.config.ProjectConfig;
import org.jfcmc.sprstahere.chap05.services.CommentService;
import org.jfcmc.sprstahere.chap05.services.UserService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var s1 = c.getBean(CommentService.class);
    var s2 = c.getBean(UserService.class);

    boolean b = s1.getCommentRepository() == s2.getCommentRepository();

    System.out.println(b);
  }
}
