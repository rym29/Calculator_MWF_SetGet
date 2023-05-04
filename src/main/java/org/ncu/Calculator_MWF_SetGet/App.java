package org.ncu.Calculator_MWF_SetGet;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		int x, y;
		String l;
		System.out.println("Enter Integer Values");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Enter Your operator addition,subtraction,multiplication,division");
		l = sc.next();

//		CalculatorFactory factory = new CalculatorFactory();
//		MathService service = factory.compute(l, x, y);
//
//		service.operate(x, y);

		// Step 1: Initialize the spring container
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application_Context.xml");

//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(annotaion_config.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);

		// Step 2: Get the desired bean
		CalculatorFactory service = context.getBean("calc", CalculatorFactory.class);

		// Step 3: Perform the required operation
		service.compute(l, x, y);

		// Step 4: close the context
		context.close();

	}
}
