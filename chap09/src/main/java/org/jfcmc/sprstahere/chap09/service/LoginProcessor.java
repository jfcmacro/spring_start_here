package org.jfcmc.sprstahere.chap09.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private LoggedUserManagementService loggedUserManagementService;

    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
	this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
	String username = this.getUsername();
	String password = this.getPassword();

	boolean loginResult = false;
	if ("natalie".equals(username) &&
	    "password".equals(password)) {
	    loginResult = true;
	    loggedUserManagementService.setUsername(username);
	}

	return loginResult;
    }

    public String getUsername() {
	return username;
    }

    public String getPassword() {
	return password;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
