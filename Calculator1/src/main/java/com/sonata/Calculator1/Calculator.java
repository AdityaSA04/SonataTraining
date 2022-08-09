package com.sonata.Calculator1;

public class Calculator {
		CalculatorService service;
		public Calculator(CalculatorService service) {
			this.service=service;
		}
	public int perform(int x , int y) {
		return service.add(x, y);
	}
}
