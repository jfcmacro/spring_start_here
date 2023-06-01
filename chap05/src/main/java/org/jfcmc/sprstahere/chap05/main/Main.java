package org.jfcmc.sprstahere.chap05.main;

import
    org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.jfcmc.sprstahere.chap05.config.ProjectConfig;
import org.jfcmc.sprstahere.chap05.model.Comment;
import org.jfcmc.sprstahere.chap05.services.CommentService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var commentService = c.getBean(CommentService.class);

    commentService.sendComment(new Comment());
    commentService.sendComment(new Comment());
  }
}
