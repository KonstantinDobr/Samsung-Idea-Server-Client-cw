package com.samsung.hello.service;

import com.samsung.hello.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private List<Person> personList;

    public PersonServiceImpl(List<Person> personList) {
        this.personList = new ArrayList<>();
        personList.add(new Person(1, "Kostya1", 16));
        personList.add(new Person(2, "Kostya2", 17));
        personList.add(new Person(3, "Kostya3", 18));
        personList.add(new Person(4, "Kostya4", 19));
        personList.add(new Person(5, "Kostya5", 20));
    }

    @Override
    public Person getPerson(long id) {

        for (Person person : personList) {
            if (person.getId() == id) return person;
        }

        return null;
    }
}
