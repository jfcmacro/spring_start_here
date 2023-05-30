package org.jfcmc.sprstahere.chap04.proxies;

import org.jfcmc.sprstahere.chap04.model.Comment;

public interface CommentNotificationProxy {

  void sendComment(Comment comment);
}
