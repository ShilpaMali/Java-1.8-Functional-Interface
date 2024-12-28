package com.velocity.lambda.expression.function;

public class DemoImpl {
	public static void main(String[] args) {

		Demo demo = (a) -> {
			return "velocity";
		};

		String s = demo.getDemo(10);
		System.out.println(s);
	}

}
