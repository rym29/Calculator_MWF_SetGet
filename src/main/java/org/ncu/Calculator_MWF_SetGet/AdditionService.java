package org.ncu.Calculator_MWF_SetGet;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService {
	
	public void operate(int x,int y) {
		int sum = x+y;
		System.out.println("The sum of the no.s is " + sum);
	}


}
