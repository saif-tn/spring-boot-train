package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.ams.entities.Experience;
import com.sip.ams.entities.Formation;

@Controller
@RequestMapping("bootstrap")

public class BoostrapController {
	
	@RequestMapping("/index")
	public String home(Model Model) {
		
		Model.addAttribute("date", new Date());
		Model.addAttribute("nom", "Saif");
		Model.addAttribute("prenom", "Bej");
		
		
		
		Formation f1 = new Formation(1, "java", 10.5, "java");
		Formation f2 = new Formation(2, "spring", 40.5, "java");
		Formation f3 = new Formation(3, "j2ee", 15.5, "java");
		
		// ArrayList<String> ...
		ArrayList<Formation> formations = new ArrayList<Formation>();
		formations.add(f1);
		formations.add(f2);
		formations.add(f3);
		
		Model.addAttribute("formations", formations);
		
		
		ArrayList<Experience> experience = new ArrayList<Experience>();
		Experience e1 = new Experience (1, "Web", 2015);
		Experience e2 = new Experience (2, "Scrum", 2018);
		Experience e3 = new Experience (3, "Photoshop", 2020);
		
		experience.add(e1);
		experience.add(e2);
		experience.add(e3);
		
		Model.addAttribute("experiences", experience);
		
		// return the template
		return "Bootstrap/index";
	}
}
