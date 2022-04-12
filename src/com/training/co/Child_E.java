package com.training.co;

public class Child_E extends Parent {
public void method3() {
	System.out.println("Child E derived from Parent class");
}
public static void main(String[] args) {

	Child_E obj1 = new Child_E();
	Child_D obj2 = new Child_D();
	Parent obj3 = new Parent();
	
obj1.method3();
obj2.method2();
obj3.method1();


}
}

