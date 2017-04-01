package org.akamai.starter.service;

import org.akamai.starter.models.Persons;

import java.util.List;

/**
 * Created by pkonwar on 3/9/17.
 */

public interface PersonService {

    Persons addPersons(String name);

    List<Persons> displayPersons();
}
