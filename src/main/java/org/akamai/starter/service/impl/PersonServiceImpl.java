package org.akamai.starter.service.impl;

import org.akamai.starter.models.Persons;
import org.akamai.starter.models.repository.PersonRepository;
import org.akamai.starter.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pkonwar on 3/9/17.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Persons addPersons(String name) {

        Persons persons = new Persons();
        persons.setName(name);
        return personRepository.save(persons);
    }

    @Override
    public List<Persons> displayPersons() {
        return personRepository.findAll();
    }
}
