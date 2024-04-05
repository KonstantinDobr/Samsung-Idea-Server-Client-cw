package com.samsung.hello.controller;

import com.samsung.hello.domain.Person;
import com.samsung.hello.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/v1/person/{id}")
    public Person getPerson(@PathVariable long id) {
        return personService.getPerson(id);
    }

}
