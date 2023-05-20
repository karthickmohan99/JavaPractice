package com.practicing;

import java.util.ArrayList;
import java.util.Iterator;

//1. Write a Java program to create an array list, add some colors (strings) and print out the collection
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String>l1=new ArrayList<String>();
		l1.add("Green");
		l1.add("Blue");
		l1.add("Red");
		l1.add("Yellow");
		l1.add("Pink");
		Iterator itr = l1.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	
	}

}
