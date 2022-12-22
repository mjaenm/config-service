package com.everis.bootcamp.app.web;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	@Autowired
	PersonService personService;

	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> personlist = personService.allPersons();
		((Person) model).addAttribute("personList", personlist);
		return "personlist";
	}
}