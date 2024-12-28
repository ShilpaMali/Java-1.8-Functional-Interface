package com.velocity.bifunction;

import java.util.function.BiFunction;

public class DemoImpl {
	public static void main(String[] args) {

		BiFunction<Integer,Integer,String> fun= (a,b) -> {
			return "velocity";
		};

		String s = fun.apply(10,20);
		System.out.println(s);
	}

}
