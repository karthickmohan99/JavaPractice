package com.practicing;
import java.util.Scanner;
public class prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first integer:");
       int num1 = sc.nextInt();
       System.out.println("Enter the first integer:");
       int num2 = sc.nextInt();
       
       //sum ,difference,Product
       int sum = num1 +num2;
       int diff = num1-num2;
       int prod=num1*num2;
       
       System.out.println("sum:"+sum);
       System.out.println("difference:"+diff);
       System.out.println("Product:"+prod);
	}

}
