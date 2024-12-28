package com.velocity.lambda.expression.bipredicate;

public class SampleImpl {
	public static void main(String[] args) {

		Sample sample = (a,b) -> {
			return true;
		};

		boolean b1 = sample.getSample(10,20);
		System.out.println(b1);
	}

}
