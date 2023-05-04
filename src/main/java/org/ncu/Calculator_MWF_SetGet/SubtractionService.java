package org.ncu.Calculator_MWF_SetGet;

import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements MathService {
	public void operate(int x, int y) {
		int sub;

		if (x >= y) {
			sub = x - y;
			System.out.println("The subtraction of the no.s is " + sub);

		} else {
			sub = y - x;
			System.out.println("The subtraction of the no.s is " + sub);
		}
	}
}