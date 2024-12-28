package com.velocity.consumer;

import java.util.function.Consumer;

public class ProjectImpl {
public static void main(String[] args) {
		
		Consumer<Integer> con=(a)->{
			System.out.println(a);
		};
		
		con.accept(10);
	}

}
