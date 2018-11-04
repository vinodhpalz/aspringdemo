package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage()
	{
		return "home";
	}	
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcomePage()
	{
		return "welcome";
	}
}
