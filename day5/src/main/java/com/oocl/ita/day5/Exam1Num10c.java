package com.oocl.ita.day5;

import java.util.ArrayList;

public class Exam1Num10c {
	
		public ArrayList<String> main()
		{
		ArrayList<String> output = new ArrayList<String>();
		int value = 5;
		int value2 = 1;
		while (value2 < 4)
		{
		for (;value >= value2; value--)
		{
			output.add("*");
			System.out.println("*");
		}
		value2++;
		}
		return output;
		}
		
}
