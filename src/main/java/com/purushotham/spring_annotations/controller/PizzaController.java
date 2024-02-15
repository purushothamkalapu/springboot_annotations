package com.purushotham.spring_annotations.controller;

import org.springframework.stereotype.Component;

//@Component("pizzaDemo")
@Component()
public class PizzaController {
    public String getPizza(){
        return "Hot Pizza";
    }
}
