package org.ncu.Calculator_MWF_SetGet;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class CalculatorFactory {

	MathService add;
	MathService sub;
	MathService mult;
	MathService div;
//
//	CalculatorFactory(@Qualifier("additionService") MathService add,
//	@Qualifier("subtractionService") MathService sub,
//			@Qualifier("multiplicationService") MathService mult, @Qualifier("divisionService") MathService div) {
//		this.add = add;
//		this.sub = sub;
//		this.mult = mult;
//		this.div = div;
//	}

//	public void setAdd(AdditionService add) {
//		this.add = add;
//	}
//
//	public void setSub(SubtractionService sub) {
//		this.sub = sub;
//	}
//
//	public void setMult(MultiplicationService mult) {
//		this.mult = mult;
//	}
//
//	public void setDiv(DivisionService div) {
//		this.div = div;
//	}
	
	public void setAdd(@Qualifier("additionService") MathService add) {
		this.add = add;
	}

	public void setSub(@Qualifier("subtractionService") MathService sub) {
		this.sub = sub;
	}

	public void setMult(@Qualifier("multiplicationService") MathService mult) {
		this.mult = mult;
	}

	public void setDiv( @Qualifier("divisionService") MathService div) {
		this.div = div;
	}

	public void compute(String op, int x, int y) {
		if (op.equals("addition")) {
			add.operate(x, y);

		} else if (op.equals("subtraction")) {
			sub.operate(x, y);

		} else if (op.equals("multiplication")) {
			mult.operate(x, y);

		} else if (op.equals("division")) {
			div.operate(x, y);

		} else {
			throw new RuntimeException("Sorry! Invalid operation.");
		}
	}

}
