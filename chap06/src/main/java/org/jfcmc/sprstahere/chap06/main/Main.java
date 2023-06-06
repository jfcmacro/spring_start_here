package org.jfcmc.sprstahere.chap06.main;

import org.jfcmc.sprstahere.chap06.config.ProjectConfig;
import org.jfcmc.sprstahere.chap06.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.jfcmc.sprstahere.chap06.services.CommentService;

import java.util.logging.Logger;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo comment");
    comment.setAuthor("Natasha");

    String value = service.publishComment(comment);

    logger.info(value);
  }
}
