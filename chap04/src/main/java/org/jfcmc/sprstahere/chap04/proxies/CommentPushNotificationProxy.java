package org.jfcmc.sprstahere.chap04.proxies;

import org.jfcmc.sprstahere.chap04.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
