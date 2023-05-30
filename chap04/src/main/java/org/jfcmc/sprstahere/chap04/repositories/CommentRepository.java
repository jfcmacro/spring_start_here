package org.jfcmc.sprstahere.chap04.repositories;

import org.jfcmc.sprstahere.chap04.model.Comment;

public interface CommentRepository {

  void storeComment(Comment comment);
}
