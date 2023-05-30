package org.jfcmc.sprstahere.chap04.proxies;

import org.springframework.stereotype.Component;
import org.jfcmc.sprstahere.chap04.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
