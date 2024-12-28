package com.velocity.why;

@FunctionalInterface
public interface Test {
	//developer-1- vikas
		public abstract void getTest();
		//developer-2- yogesh
		//public abstract void getData();
		
		public default void getData() {
			System.out.println("This is getData() method");
		}

}
