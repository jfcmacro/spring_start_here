package org.jfcmc.sprstahere.chap09.controller;

import java.util.Objects;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.jfcmc.sprstahere.chap09.service.LoggedUserManagementService;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedManagementService) {
	this.loggedUserManagementService = loggedManagementService;
    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout,
		       Model model) {
	String username =
	    loggedUserManagementService.getUsername();

	if (!Objects.isNull(logout)) {
	    loggedUserManagementService.setUsername(null);
	}

	if (Objects.isNull(username)) {
	    return "redirect:/";
	}

	model.addAttribute("username", username);
	return "main.html";
    }
}
