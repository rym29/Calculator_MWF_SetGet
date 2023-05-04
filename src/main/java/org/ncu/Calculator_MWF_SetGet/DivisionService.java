package org.ncu.Calculator_MWF_SetGet;

import org.springframework.stereotype.Component;

@Component
public class DivisionService implements MathService {
	
	public void operate(int x, int y) {
		int div;

		if (x >= y) {
			div = x/y;
			System.out.println("The division of the no.s is " + div);

		} else {
			div = y/x;
			System.out.println("The division of the no.s is " + div);
		}
	}
}