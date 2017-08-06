package com.oocl.ita.day5;

import java.util.ArrayList;

public class Exam1Num10d {
	static boolean a,b,c;
	public ArrayList<String> main()
	{
		ArrayList<String> output = new ArrayList<String>();
	a = true;
	b = false;
	c = false;
	System.out.println (a + ", " + b + ", " + c);
	output.add(a + ", " + b + ", " + c);
	do
	{
	if (b == c)
	b = a;
	else if (a == c)
	b = c;
	else
	a = c;
	System.out.println(a + ", " + b + ", " + c);
	output.add(a + ", " + b + ", " + c);
	}
	while ( a || b || c);
	return output;
	}
}
