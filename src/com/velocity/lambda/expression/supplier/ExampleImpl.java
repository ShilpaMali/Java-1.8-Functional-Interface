package com.velocity.lambda.expression.supplier;

public class ExampleImpl {
	public static void main(String[] args) {

		Example example = () -> {
			return "java";
		};

		String s = example.getExample();
		System.out.println(s);
	}

}
