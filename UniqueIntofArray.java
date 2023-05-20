package com.practicing;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class UniqueIntofArray 
{
	
	public  int findNonRepeated(int[] arr) 
	{ 
	  int nonRepeated =0;
	  boolean foundNonRepeated = false;	
	  for(int i = 0 ; i<arr.length;i++) 
	  {
		 boolean isRepeated = false;
		 for(int j = 0 ; j<arr.length;j++) 
		 {   
			 if(i!=j && arr[i]==arr[j])
			 {
				 isRepeated=true;
			 }
			 
			 
		 }
		  if(!isRepeated)
		  {
			  nonRepeated = arr[i];
			  foundNonRepeated=true;
		  }
	  }
	  if(foundNonRepeated) 
	  {
		  System.out.println("Uique number is"+nonRepeated);
	  }
	return 0;
  }

	public static void main(String[] args) 
	{
		int []arr = {1,1,2,3,3,4,2,5,4};
		UniqueIntofArray ua = new UniqueIntofArray();
		ua.findNonRepeated(arr);
	}
}

//LinkedHashSet<Integer>uniqueNumbers=new LinkedHashSet<Integer>();
//
//for(int number:arr) {
//	uniqueNumbers.add(number);
//}
//
//System.out.println("The unique numbers in the array are:");
//for(int uniqueNumber:uniqueNumbers) {
//	System.out.println("The unique numbers are:"+uniqueNumber);
//}


