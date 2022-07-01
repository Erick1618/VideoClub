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
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private LanguageService languageService;
	
	@Autowired
	private InventoryService inventoryService;

	@RequestMapping(value = {"/films"})
	public String index(Model model) {
		
		model.addAttribute("Film", new Film());
		
		return "views/registro_peliculas";
	}
	
}
