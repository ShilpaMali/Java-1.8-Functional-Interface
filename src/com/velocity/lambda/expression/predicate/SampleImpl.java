package com.velocity.lambda.expression.predicate;

public class SampleImpl {
	public static void main(String[] args) {

		Sample sample = (b) -> {
			return true;
		};

		boolean b1 = sample.getSample(20);
		System.out.println(b1);
	}

}
