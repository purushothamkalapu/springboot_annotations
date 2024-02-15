package com.purushotham.spring_annotations.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{
    @Override
    public String getPizza(){
        return "Vez Pizza";
    }
}
