package org.akamai.starter.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pkonwar on 3/9/17.
 */
@Entity
@Table(name = "PERSONS")
public class Persons implements Serializable{

    public Persons(){}

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "ADDRESS", length = 200)
    private String address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
