package ec.edu.uce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaguinaController {

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
}
