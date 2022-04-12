package com.training.co;

public class Keywords extends Keyword {
	int num=2;
public void key2() {
	System.out.println(this.num);
	System.out.println(super.num);
}
public static void main(String[] args) {
	Keywords obj=new Keywords();
	obj.key2();
	
}
	

}

