package org.jfcmc.sprstahere.chap05.services;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Lazy;

@Service
@Lazy
public class CommentService {
    public CommentService() {
        System.out.println("Comment Service instance created!");
    }
}
