package org.akamai.starter.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pkonwar on 3/8/17.
 */
@Configuration
public class FactoryConfiguration {

    @Bean
    public String startServerDetails() {
        System.out.println("********Application Started in port 9090*******");
        return "8080";
    }



}
