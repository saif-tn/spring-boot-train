package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sip.ams.entities.Person;
import com.sip.ams.forms.PersonForm;

@Controller
@RequestMapping("Persons")
public class PersonController {

	@Value("${error.message}")
	private String errorMessage;
	
	@Value("${welcome.message}")
	private String message;
	
	
	private static List<Person> persons = new ArrayList<Person>();
	// lors de la création du controlleur 
	// joue le role d'un constructeur
	/* 
	 * public PersonController() { ... }
	 * 
	 */
	// java 8
    static {
        persons.add(new Person(1, "Albert", "Einstein"));
        persons.add(new Person(2, "Frederic", "Gauss"));
    }
    static int nbr = 2;
    
    @RequestMapping(value = { "/indexPerson", "/Person" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        model.addAttribute("message", message);
 
        return "Person/index";
    }

    
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {
 
        model.addAttribute("persons", persons);
 
        return "Person/personList";
    }
    
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
    public String showAddPersonPage(Model model) {
 
        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);
 
        return "Person/addPerson";
    }
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
    public String savePerson(Model model, //
            @ModelAttribute("personForm") PersonForm personForm) {
    	 nbr++;
    	 
//    	int id = personForm.getId();
//        String firstName = personForm.getFirstName();
//        String lastName = personForm.getLastName();
// 
//        if (firstName != null && firstName.length() > 0 //
//                && lastName != null && lastName.length() > 0) {
//            Person newPerson = new Person(id, firstName, lastName);
//            persons.add(newPerson);
// 
//            return "redirect:personList";
//        }
        String firstName = personForm.getFirstName();
        String lastName = personForm.getLastName();
 
        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0) {
            Person newPerson = new Person(nbr,firstName, lastName);
            persons.add(newPerson);
 
            return "redirect:personList";
            //return "Person/personList";
        }
 
        model.addAttribute("errorMessage", errorMessage);
        return "Person/addPerson";
 
      
//        model.addAttribute("errorMessage", errorMessage);
//        return "Person/addPerson";
    }
    
    

    //@GetMapping(), method = RequestMethod.GET
    @RequestMapping(value = { "/editPerson/{id}" }, method = RequestMethod.GET)
    public String showUpdatePerson(@PathVariable("id") int id, @ModelAttribute("personForm") PersonForm personForm, Model model) {
    	
    	
    	//persons.indexOf(id)
    	
    	//persons.get(persons.indexOf(id));
    	    	
    	int id1 = id;
        String firstName = personForm.getFirstName();
        String lastName = "bb";
 
        
    	 PersonForm editForm = new PersonForm();
    	 editForm.setId(id1);
    	 editForm.setFirstName(firstName);
    	 editForm.setLastName(lastName);
    	 
         model.addAttribute("personForm", editForm);
    	
         return "Person/editPerson";
    }
    
    @RequestMapping(value = { "/deletePerson/{fname}/{lname}/{id}" }, method = RequestMethod.GET)
    public String deletePerson(@PathVariable String fname, @PathVariable String lname, @PathVariable int id, Model model) {
 
        //System.out.println(id);
    	Person p = new Person(id,fname,lname);
        persons.remove(p);
        // model.addAttribute("persons", persons);
        return "Person/personList";
     }
}