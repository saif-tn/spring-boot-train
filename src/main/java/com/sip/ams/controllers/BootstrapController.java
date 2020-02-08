package com.sip.ams.controllers;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("boot")
public class BootstrapController {
	
	@RequestMapping("/bc")
	
	public String accueil(Model model)
	{
		 //model.addAttribute("datetime", new Date());
	     //model.addAttribute("username", "Amine Mezghich");
		return "Bootstrap/test";
	     //return "Bootstrap/acceuil";
	}
}
