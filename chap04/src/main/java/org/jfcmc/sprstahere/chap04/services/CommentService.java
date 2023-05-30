package org.jfcmc.sprstahere.chap04.services;

import org.jfcmc.sprstahere.chap04.model.Comment;
import org.jfcmc.sprstahere.chap04.proxies.CommentNotificationProxy;
import org.jfcmc.sprstahere.chap04.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
