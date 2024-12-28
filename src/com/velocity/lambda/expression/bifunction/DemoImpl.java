package com.velocity.lambda.expression.bifunction;

public class DemoImpl {
	public static void main(String[] args) {

		Demo demo = (a,b) -> {
			//System.out.println(a);
			//System.out.println(b);
			return "velocity";
		};

		String s = demo.getDemo(10,20);
		System.out.println(s);
	}
	

}
