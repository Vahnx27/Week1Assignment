package com.oocl.ita.day5;

public class Exam1Num7 {

	public static void main (String args[]) {
	System.out.println(compute_value(60));
	}
	
	public static int compute_value(int integer_value) {
		// Declare Local Variables
		boolean done = false;
		int count = 1;
		int current = integer_value + 2;
		while (! done) {
		current = current / count;
		if (current % 3 == 0)
		done = true;
		else if (current < 1)
		done = true;
		else
		count += 1;
		System.out.println(current);
		}
		System.out.println (count);
		return count;
		} // method compute_value
}
