package com.velocity.bipredicate;

import java.util.function.BiPredicate;

public class SampleImpl {
	public static void main(String[] args) {

		BiPredicate<Integer,Integer> sample = (a,b) -> {
			return true;
		};

		boolean b1 = sample.test(10,20);
		System.out.println(b1);

	}

}
