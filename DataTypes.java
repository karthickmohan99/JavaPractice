package com.practicing;

public class DataTypes {

	public static void main(String[] args) {
		int num =10;
		double d = 199999;
		char c ='c';
		System.out.println("Number:"+num +"\nDouble:"+ d +"\nCharacter:"+ c);		
		
		//Area of rectngle
		int length = 3;
		int width = 2;
		System.out.println("Area of Rectangle:"+ length * width);
		
		//Product of float and integer
		int n = 6;
		float f=8.2f;
		System.out.println("Product is:"+ n*f);
		
		//ASCII value of int
		char ch1 = 'd';
//		int Ascii = ch1;
//		System.out.println("ASCII value of h:"+ Ascii);
		System.out.println("ASCII value of h:"+(int)'d');
		
		//Assign Double into int
		double d1 = 100.235;
		 
		 System.out.println("implicit casting:"+(int)d);
		 Double double1 = new Double(d1);
		 int value = double1.intValue();
		 int value2 =(int)Math.round(d1);
		 System.out.println("Type Casting:"+ value );
	
		 //Add 3 in ASCII value of d and print char
		 
		 
		 int x = 3+'d';
		  System.out.println((char)x);
		  
		  int v1= 5;System.out.println("3+ASCII OF D :"+ 3+(int)'d');
		  double v2 = 6.2;
		  System.out.println("add int and double:"+v1+v2);
		  
		  System.out.println("Square of a number:"+3.9*3.9);


	}

}
