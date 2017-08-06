package com.oocl.ita.day5;

import java.util.ArrayList;
import java.util.List;

public class Exam1Num10a {
	
	public ArrayList<String> process(){
	double count;
	ArrayList<String> output = new ArrayList<String>();
	int limit;
	count = 9.0;
	limit = 43/4;
	for (; count <= limit; count = count + 0.5)
	{
	output.add("in for:" + count);
	}
	output.add("after for" + count);
	return output;
	}
	}



