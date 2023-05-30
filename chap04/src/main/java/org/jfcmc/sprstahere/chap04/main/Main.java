package org.jfcmc.sprstahere.chap04.main;

import org.jfcmc.sprstahere.chap04.configuration.ProjectConfiguration;
import org.jfcmc.sprstahere.chap04.model.Comment;
import org.jfcmc.sprstahere.chap04.services.CommentService;
import
    org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context =
        new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    var comment = new Comment();
    comment.setAuthor("Laurentiu");
    comment.setText("Demo comment");

    var commentService = context.getBean(CommentService.class);
    commentService.publishComment(comment);
  }
}
