package org.akamai.starter.models.repository;

import org.akamai.starter.models.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pkonwar on 3/9/17.
 */
@Repository
public interface PersonRepository extends JpaRepository<Persons, Long>{
}
