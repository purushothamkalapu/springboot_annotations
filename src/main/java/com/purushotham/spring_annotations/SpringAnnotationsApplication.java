package com.purushotham.spring_annotations;

import com.purushotham.spring_annotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		//PizzaController pizzaController = context.getBean(PizzaController.class);
		//PizzaController pizzaController = (PizzaController) context.getBean("pizzaDemo");
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
	}

}
