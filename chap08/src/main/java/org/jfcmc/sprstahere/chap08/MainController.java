package org.jfcmc.sprstahere.chap08;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color,
		       Model model) {
	model.addAttribute("username", "Kathy");
	model.addAttribute("color", color);
	return "home.html";
    }
}
