package com.uabc.controllers;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uabc.entities.CatalogoIndex;
import com.uabc.entities.Category;
import com.uabc.entities.Customer;
import com.uabc.entities.Film;
import com.uabc.services.CategoryService;
import com.uabc.services.FilmService;
import com.uabc.services.InventoryService;
import com.uabc.services.LanguageService;



@Controller
public class CustomerController {
	
	@Autowired
	private FilmService filmService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private LanguageService languageService;
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = {"/customers"})
	public String index(Model model, HttpServletRequest request, HttpServletResponse response, Principal principal) {
		
		
		model.addAttribute("Customer", new Customer());
		
		
		
		return "views/registro_clientes";
	}
	
	@RequestMapping(value = {"/InsertCustomer"}, method = RequestMethod.POST)
	public String insert(Customer customer,Model model, HttpServletRequest request, HttpServletResponse response, Principal principal) 
	{
		customerService.InsertCustomer(customer);
		return "views/registro_clientes";
	}
	
}
