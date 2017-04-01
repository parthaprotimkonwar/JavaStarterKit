package org.akamai.starter.controller;

import org.akamai.starter.models.Persons;
import org.akamai.starter.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pkonwar on 3/8/17.
 */

@RestController
public class HelloController{


    @RequestMapping("/index")
    public String index() {

        return "hello world";
    }

    @Autowired
    PersonService personService;


    @RequestMapping("/person/{name}")
    public String addAndDisplayEmployee(@PathVariable String name) {

        System.out.println("Name is :" + name);
        personService.addPersons(name);

        List<Persons> personsList = personService.displayPersons();

        StringBuilder sb = new StringBuilder();

        for(Persons persons : personsList) {
            sb.append(persons.getName()).append(",");
        }

        return sb.toString();
    }

}
