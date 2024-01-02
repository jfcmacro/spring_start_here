package org.jfcmc.sprstahere.chap06.services;

import org.jfcmc.sprstahere.chap06.aspects.ToLog;
import org.jfcmc.sprstahere.chap06.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
	logger.info("Publishing comment:" + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
	logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment comment) {
	logger.info("Editing comment:" + comment.getText());
    }
 
    public void setLogger(Logger logger) {
	this.logger = logger;
    }
}
