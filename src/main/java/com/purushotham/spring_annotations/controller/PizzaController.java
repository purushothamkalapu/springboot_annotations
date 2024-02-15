package com.purushotham.spring_annotations.controller;

import com.purushotham.spring_annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("pizzaDemo")
@Component()
public class PizzaController {
    @Autowired
    private VegPizza vegPizza;
    /*Constructor injection*/

    /*@Autowired
    public PizzaController(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    /*Setter injection*/
    /*@Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }
*/

    public String getPizza(){
        return vegPizza.getPizza();
    }
}
