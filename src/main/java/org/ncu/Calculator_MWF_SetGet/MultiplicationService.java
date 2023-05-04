package org.ncu.Calculator_MWF_SetGet;

import org.springframework.stereotype.Component;

@Component

public class MultiplicationService implements MathService {
	public void operate(int x, int y) {
		int mult = x * y;
		System.out.println("The multiplication of the no.s is " + mult);

	}
}
