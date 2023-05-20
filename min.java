package com.practicing;
import java.util.Scanner;
public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  no of Integers:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the "+n+"Integers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Array elements are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min=arr[i];
			};			
		}
		System.out.println("Minimum value from array:"+ min);

	}

}
