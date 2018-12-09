package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Employee;
import model.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value="/pc",method=RequestMethod.GET)
	public String productPage(@RequestParam("firstName")String name, @RequestParam("age")int age, Model m)
	{
		m.addAttribute("name", name);
		m.addAttribute("age", age);
		return "product";
	}
	
	@RequestMapping(value="/pc/{name}",method=RequestMethod.GET)
	public String productPath(@PathVariable("name")String name, Model m)
	{
		m.addAttribute("name", name);
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
	
	@ResponseBody
	@RequestMapping(value="/getproducts",method=RequestMethod.GET)
	public List<Product> getAllProducts()
	{
		List<Product> l = new ArrayList<Product>();
		l.add(new Product(1, "Watch", 5000));
		l.add(new Product(2, "Apple iPad", 80000));
		l.add(new Product(3, "Mobile", 60000));
		l.add(new Product(4, "MS Office", 4500));
		return l;
	}
	
	@RequestMapping(value="/listview", method=RequestMethod.GET)
	public String listView()
	{
		return "listproducts";
	}
	
}
