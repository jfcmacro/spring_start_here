package org.jfcmc.sprstahere.chap05.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.jfcmc.sprstahere.chap05.repositories.CommentRepository;

@Service
public class UserService {
    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
