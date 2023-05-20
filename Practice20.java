package com.practicing;
import java.util.*;
//Take integer inputs from user 
// until he/she presses q ( Ask to press q to quit 
// after every integer input ). 
// Print average and product of all numbers.

public class Practice20 {

	public static void main(String[] args) {
		String choice ="";
		int sum =0;
		int Product =1;
		int count =0;
		while(!choice.equalsIgnoreCase("Q"))
		{   
			Scanner  sc = new Scanner(System.in);
			System.out.println("Enter number or enter Q to quit");
			choice =sc.next();
			if(!choice.equalsIgnoreCase("Q"))
			{   int number = Integer.parseInt(choice);
				sum+=number;
				Product*=number;
				count++;
			}
			
		}
		
		System.out.println("Product is:"+Product+"\nAverage is:"+(sum/count));
	}

}
