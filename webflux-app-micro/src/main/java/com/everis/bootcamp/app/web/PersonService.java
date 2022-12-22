package com.everis.bootcamp.app.web;

import reactor.core.publisher.Flux;

public interface PersonService {

	Flux<Person> allPersons();

}
