package com.oocl.ita.day5;

import java.util.ArrayList;

public class Exam1Num10b {

	static int value = 10;
	static ArrayList<String> output = new ArrayList<String>();
	public ArrayList<String> main()
	{
	
	System.out.println("Main before p1: " + value);
	output.add("Main before p1: " + value);
	value = p1(value);
	System.out.println("Main before p2: " + value);
	output.add("Main before p2: " + value);
	value = p2(value);
	System.out.println("Main at the end: " + value);
	output.add("Main at the end: " + value);
	System.out.println("-----");
	output.add("-----");
	int value = 30;
	System.out.println("Main before p1: " + value);
	output.add("Main before p1: " + value);
	value = p1(value);
	System.out.println("Main before p2: " + value);
	output.add("Main before p2: " + value);
	value = p2(value);
	System.out.println("Main at the end: " + value);
	output.add("Main at the end: " + value);
	return output;
	}
	static int p1(int input)
	{
	value = input * value;
	System.out.println("In p1: " + value);
	output.add("In p1: " + value);
	return value;
	}
	static int p2(int input)
	{
	int value = 5;
	value = input / value;
	System.out.println("In p2: " + value);
	output.add("In p2: " + value);
	return value;
	}


}
