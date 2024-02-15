package com.purushotham.spring_annotations.controller;

import com.purushotham.spring_annotations.service.Pizza;
import com.purushotham.spring_annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("pizzaDemo")
@Component()
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
        this.pizza = pizza;
    }


    public String getPizza(){
        return pizza.getPizza();
    }
}
