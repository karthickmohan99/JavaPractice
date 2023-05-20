package com.practicing;


class A{
	public void funct1() {
		System.out.println("Inside Class A");
	}
}
class B extends A{
	public void funct2() {
	System.out.println("Inside Class B");
	}
}
class c extends  B{
	public void funct3() {
		System.out.println("Inside Class c");
		}
}
public class Multilevel {

	public static void main(String[] args) {
		c obj = new c();
		obj.funct1();
		obj.funct2();
		obj.funct3();
		

	}

}
