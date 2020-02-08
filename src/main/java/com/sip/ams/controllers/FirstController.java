package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"first"})
public class FirstController {
	
	// getting this value from application.properties
	@Value("${slogan}")
	private String sloganTxt;

	
	
	@RequestMapping("/home")
	public String home(@RequestParam(required=false,
						defaultValue="Spring default value") 
						String framework,
						@RequestParam(required=false,
						defaultValue="Spring default value") 
						String web,
						Model model) {
		
		// chainage
		model.addAttribute("param1", framework).addAttribute("param2", web).addAttribute("slogan", sloganTxt);
		
		// passing an array list
		ArrayList<String> cars = new ArrayList<>();
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Mazda");
		
		 model.addAttribute("cars", cars);
		
		// return view from the template directory
		return "First/home";
	}
	
	@RequestMapping("/book")
	public String book() {
		return "book";
	}
}
