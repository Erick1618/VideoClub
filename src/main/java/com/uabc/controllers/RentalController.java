package com.uabc.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uabc.entities.Customer;
import com.uabc.entities.Rental;

@Controller
public class RentalController {
	
	
	@GetMapping("/rental")
	public String rental(Model model) {
		
			
			
			model.addAttribute("Rental", new Rental());
		return "views/rental";
	}

}
