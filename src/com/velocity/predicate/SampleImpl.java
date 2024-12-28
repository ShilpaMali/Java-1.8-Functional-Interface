package com.velocity.predicate;

import java.util.function.Predicate;

public class SampleImpl {
	public static void main(String[] args) {

		Predicate<Integer> sample = (b) -> {
			return true;
		};

		boolean b1 = sample.test(20);
		System.out.println(b1);

	}

}
