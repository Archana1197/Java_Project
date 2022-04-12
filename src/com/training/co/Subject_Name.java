package com.training.co;

public class Subject_Name {
public void tamil() {
	System.out.println("Tamil Subject");
}
public void english() {
	System.out.println("English Subject");
}
public void maths() {
	System.out.println("Maths Subject");
}
public void sceince() {
	System.out.println("Sceince Subject");
}
	//Main method//
public static void main(String[] args) {
//object creation
Subject_Name students = new Subject_Name();	
//method calling
students.tamil();
students.english();
students.maths();
students.sceince();
}
}

