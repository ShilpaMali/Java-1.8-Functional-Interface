package com.velocity.why;

public class TestImpl {
	public static void main(String[] args) {

		Test test = () -> {
			System.out.println("Inside getTest() method");
		};

		test.getTest();
	}

}
