package controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage(Model m)
	{
		m.addAttribute("name", "vinodh");
		return "home";
	}	
	
	@RequestMapping(value="/welcome/{id}/{name}",method=RequestMethod.GET)
	public String welcomePage(Model m, @PathVariable("id")int id, @PathVariable("name")String name)
	{
		m.addAttribute("id", id);
		m.addAttribute("nm", name);
		return "welcome";
	}
}
