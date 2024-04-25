package org.jfcmc.sprstahere.chap09.service;

import org.springframework.web.context.annotation.SessionScope;
import org.springframework.stereotype.Service;

@Service
@SessionScope
public class LoggedUserManagementService {

    private String username;

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }
}
