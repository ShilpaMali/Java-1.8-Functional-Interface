package com.velocity.lambda.expression.biconsumer;

public class ProjectImpl {
	public static void main(String[] args) {

		Project project = (a, b) -> {
			System.out.println("a>>" + a + "b>>" + b);
		};

		project.getProject(10, 20);
	}

}
