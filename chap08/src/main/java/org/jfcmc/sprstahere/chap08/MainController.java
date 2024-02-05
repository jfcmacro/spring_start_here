package org.jfcmc.sprstahere.chap08;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String name,
		       @RequestParam(required = false) String color,
		       Model model) {
	model.addAttribute("username", name);
	model.addAttribute("color", color);
	return "home.html";
    }
}
