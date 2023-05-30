package org.jfcmc.sprstahere.chap04.services;

import org.jfcmc.sprstahere.chap04.model.Comment;
import org.jfcmc.sprstahere.chap04.proxies.CommentNotificationProxy;
import org.jfcmc.sprstahere.chap04.repositories.CommentRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
