package org.ncu.Calculator_MWF_SetGet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Dependent class
@Configuration
public class CalculatorConfig {

//	Constructor Injection

//	@Bean
//
//	CalculatorFactory calc() {
//		return new CalculatorFactory(add(), sub(), div(), mult());
//
//	}
//
	@Bean
	MathService add() {
		// TODO Auto-generated method stub
		return new AdditionService();
	}

	@Bean
	MathService sub() {
		// TODO Auto-generated method stub
		return new SubtractionService();
	}

	@Bean

	MathService mult() {
		// TODO Auto-generated method stub
		return new MultiplicationService();
	}

	@Bean
	MathService div() {
		// TODO Auto-generated method stub
		return new DivisionService();
	}

//	Setter Injection
	@Bean
	CalculatorFactory calc() {
		CalculatorFactory c = new CalculatorFactory();
		c.setAdd(add());
		c.setSub(sub());
		c.setMult(mult());
		c.setDiv(div());
		return c;

	}
}
