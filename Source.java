package com.practicing;

interface StringSpace{
	String addSpace(String s);
}
public class Source {

	public static void main(String[] args) {
		String inputString ="capgemini";
		String outputString=insertSpace(inputString);
		System.out.println(outputString);
		
	}
	public static String insertSpace(String s)
	{
		StringSpace s1 = (str)->str.chars().mapToObj(c->(char)c+" ").reduce("",String::concat);
		return s1.addSpace(s).trim();
	}

}
