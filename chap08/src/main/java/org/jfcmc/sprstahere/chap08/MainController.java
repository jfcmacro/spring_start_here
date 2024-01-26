package org.jfcmc.sprstahere.chap08;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(Model model) {
	model.addAttribute("username", "Katy");
	model.addAttribute("color", "red");
	return "home.html";
    }
}
