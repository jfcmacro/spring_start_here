package org.jfcmc.sprstahere.chap05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.jfcmc.sprstahere.chap05.services.CommentService;

@Configuration
public class ProjectConfig {

  @Bean
  public CommentService commentService() {
    return new CommentService();
  }
}
