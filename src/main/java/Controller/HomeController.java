package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@GetMapping("/Hello")
	public String hello(Model model) {
		model.addAttribute("Name", "Abdullah");
		return "/WEB-INF/views/home.jsp";
	}
	
}
