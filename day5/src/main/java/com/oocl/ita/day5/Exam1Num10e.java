package com.oocl.ita.day5;

import java.util.ArrayList;

public class Exam1Num10e {
	public ArrayList<String>main(int a, int b, int c)
	{
		ArrayList<String> output = new ArrayList<String>();
	int one = 1;
	int two = 2;
	int three = 3;
	do
	{
	one++;
	System.out.print("cart");
	output.add("cart");
	}
	while ( one < 3);
	for (int i = 0; i < two; i++)
	{
	System.out.print("o");
	output.add("o");
	}
	while (true) {
	three++;
	if (three == 5) {
	break;
	}
	System.out.print("n");
	output.add("n");
	}
	return output;
	}
}
