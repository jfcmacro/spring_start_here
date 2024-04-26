package org.jfcmc.sprstahere.chap09.controller;

import java.util.Objects;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.jfcmc.sprstahere.chap09.service.LoggedUserManagementService;
import org.jfcmc.sprstahere.chap09.service.LoginCountService;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public MainController(LoggedUserManagementService loggedManagementService,
			  LoginCountService loginCountService) {
	this.loggedUserManagementService = loggedManagementService;
	this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout,
		       Model model) {
	if (!Objects.isNull(logout)) {
	    loggedUserManagementService.setUsername(null);
	}

	String username = loggedUserManagementService.getUsername();
	int count = loginCountService.getCount();

	if (Objects.isNull(username)) {
	    return "redirect:/";
	}

	model.addAttribute("username", username);
	model.addAttribute("loginCount", count);
	return "main.html";
    }
}
