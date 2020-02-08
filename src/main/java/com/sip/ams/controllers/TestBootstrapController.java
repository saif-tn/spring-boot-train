package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("tbc")
public class TestBootstrapController {
	
	@RequestMapping("/info")
	public String info(Model model)
	{
		ArrayList<String> formations = new ArrayList<>();
		formations.add("OCA");
		formations.add("OCP");
		formations.add("SpringBoot");
		model.addAttribute("formations",formations);
		
		ArrayList<String> diplomes = new ArrayList<>();
		diplomes.add("Ingenieur");
		diplomes.add("Mater");
		diplomes.add("Doctorat");
		model.addAttribute("diplomes",diplomes);
		
		model.addAttribute("nom","Mezghich").addAttribute("prenom","Mohamed Amine");
		//model.addAttribute("prenom","Mohamed Amine");
		model.addAttribute("email","ma.mezghich@smart-it-partner.com");
		model.addAttribute("profession","Formateur IT");
		return "First/info";
	}

}
