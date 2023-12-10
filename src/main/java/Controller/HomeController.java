package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@GetMapping("/Hello")
	public String hello(Model model) {
		model.addAttribute("Name", "Abdullah");
		return "/WEB-INF/views/home.jsp";
		}
	
	@PostMapping("/AppendFormData")
	public String retrivdata(@ModelAttribute int electricity,int gas,int fuel_oil,String other_energy_sources ) {
		
		return "/WEB-INF/views/WaterMangment.html";
	}
	
}
