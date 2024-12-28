package com.velocity.biconsumer;

import java.util.function.BiConsumer;

public class ProjectImpl {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> con = (a, b) -> {
			System.out.println("a=" + a + "b=" + b);
		};

		con.accept(10, 20);
	}

}
