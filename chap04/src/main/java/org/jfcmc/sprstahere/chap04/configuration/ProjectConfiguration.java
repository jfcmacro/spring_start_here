package org.jfcmc.sprstahere.chap04.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.jfcmc.sprstahere.chap04.repositories.CommentRepository;
import org.jfcmc.sprstahere.chap04.repositories.DBCommentRepository;
import org.jfcmc.sprstahere.chap04.proxies.CommentNotificationProxy;
import org.jfcmc.sprstahere.chap04.proxies.EmailCommentNotificationProxy;
import org.jfcmc.sprstahere.chap04.services.CommentService;

@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService
        commentService(CommentRepository commentRepository,
                       CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository,
                                  commentNotificationProxy);
    }
}
