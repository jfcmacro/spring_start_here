package org.jfcmc.sprstahere.chap05.services;

import org.jfcmc.sprstahere.chap05.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.jfcmc.sprstahere.chap05.repositories.CommentRepository;
import org.jfcmc.sprstahere.chap05.processors.CommentProcessor;

@Service
public class CommentService {

  @Autowired
  private ApplicationContext context;

  public void sendComment(Comment c) {
    CommentProcessor p = context.getBean(CommentProcessor.class);

    p.setComment(c);
    p.processComment(c);
    p.validateComment(c);

    c = p.getComment();
    // do something further
  }

}
