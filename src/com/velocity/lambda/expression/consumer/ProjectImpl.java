package com.velocity.lambda.expression.consumer;

public class ProjectImpl {
public static void main(String[] args) {
		
		Project project=(a)->{
			System.out.println(a);
		};
		
		project.getProject(10);
	}

}
