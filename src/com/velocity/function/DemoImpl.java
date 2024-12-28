package com.velocity.function;

import java.util.function.Function;

public class DemoImpl {
	public static void main(String[] args) {

		Function<Integer,String> fun= (a) -> {
			return "velocity";
		};

		String s = fun.apply(10);
		System.out.println(s);
	}

}
