package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Employee;

@Controller
public class ProductController {
	
	@RequestMapping(value="/pc",method=RequestMethod.POST)
	public String productPage(@ModelAttribute("emp")Employee e1)
	{
		return "product";
	}
	
	@ResponseBody
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> getAllEmployees()
	{
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("vinodh",20));
		l.add(new Employee("kekin",24));
		l.add(new Employee("abhishek",23));
		l.add(new Employee("gaurav",24));
		return l;
	}
	
}
