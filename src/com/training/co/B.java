package com.training.co;

public class B extends A {
	
public void method_Two() {
	System.out.println("child class method");
}
public static void main(String[] args) {
	B obj= new B();
	obj.method_One();
	obj.method_Two();
}
}

