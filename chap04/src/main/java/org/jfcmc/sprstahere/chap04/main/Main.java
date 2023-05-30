package org.jfcmc.sprstahere.chap04.main;

import org.jfcmc.sprstahere.chap04.model.Comment;
import org.jfcmc.sprstahere.chap04.proxies.EmailCommentNotificationProxy;
import org.jfcmc.sprstahere.chap04.repositories.DBCommentRepository;
import org.jfcmc.sprstahere.chap04.services.CommentService;

public class Main {

  public static void main(String[] args) {
    var commentRepository = new DBCommentRepository();
    var commentNotificationProxy = new EmailCommentNotificationProxy();

    var commentService = new CommentService(commentRepository,
                                            commentNotificationProxy);

    var comment = new Comment();
    comment.setAuthor("Laurentiu");
    comment.setText("Demo comment");

    commentService.publishComment(comment);
  }
}
