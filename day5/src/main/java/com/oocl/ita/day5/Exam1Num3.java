package com.oocl.ita.day5;

public class Exam1Num3 {
	public int process() {
		int inner=2, outer=2;
		int result=0;
		for (int i=0; i<outer; i++)
		 {
		for (int j=0; j<inner; j++)
		 {
		 result = (result*result)+1;
		 }
		 }
		return result;
	}
}
