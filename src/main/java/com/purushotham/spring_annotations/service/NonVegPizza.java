package com.purushotham.spring_annotations.service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {

        return "Non-veg Pizza";
    }
}
