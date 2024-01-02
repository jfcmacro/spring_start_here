package org.jfcmc.sprstahere.chap06.services;

import org.jfcmc.sprstahere.chap06.aspects.ToLog;
import org.jfcmc.sprstahere.chap06.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
	logger.info("Publishing comment:" + comment.getText());
	return "SUCCESS";
    }
 
    public void setLogger(Logger logger) {
	this.logger = logger;
    }
}
