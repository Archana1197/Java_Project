package com.training.co;

public class Child_A extends Child_B{
	public void method_Three() {
		System.out.println("Child A derived from Child B");
}
	public static void main(String[] args) {
		Child_A obj = new Child_A();
		obj.method_Three();
		obj.method_Two();
		obj.method_One();
	}

	}


