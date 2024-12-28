package com.velocity.supplier;

import java.util.function.Supplier;

public class ExampleImpl {
	public static void main(String[] args) {

		Supplier<String> sup = () -> {
			return "java";
		};

		String s1 = sup.get();
		System.out.println(s1);
	}

}
