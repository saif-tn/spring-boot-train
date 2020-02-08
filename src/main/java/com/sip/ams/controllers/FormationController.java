package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.ams.entities.Formation;

@Controller
@RequestMapping({"formation"})
public class FormationController {
	
	
	@RequestMapping("/show")
	public String showFormations(Model model) {
		
		Formation form1 = new Formation(1, "java", 10.5, "java");
		Formation form2 = new Formation(2, "spring", 40.5, "java");
		Formation form3 = new Formation(3, "j2ee", 15.5, "java");
		
		ArrayList<Formation> listeFormations = new ArrayList<Formation>();
		listeFormations.add(form1);
		listeFormations.add(form2);
		listeFormations.add(form3);
		
		
		model.addAttribute("formtions", listeFormations);
		// get the directory listing from templates
		return "Formation/show";
		
	}
	
}
