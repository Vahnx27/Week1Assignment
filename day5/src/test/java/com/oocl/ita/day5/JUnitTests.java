package com.oocl.ita.day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class JUnitTests {

	@Test
	public void test3() {
		Exam1Num3 exer3 = new Exam1Num3();
		assertEquals(26, exer3.process());
		
	}
	
	@Test
	public void test7() {
	Exam1Num7 exer7 = new Exam1Num7();
	assertEquals(5, exer7.compute_value(60));
	}
	
	@Test
	public void test10a() {
		ArrayList<String> expectedresult = new ArrayList<String>();
		expectedresult.add("in for:9.0");
		expectedresult.add("in for:9.5");
		expectedresult.add("in for:10.0");
		expectedresult.add("after for10.5");
		Exam1Num10a exer10a = new Exam1Num10a();
		assertEquals(expectedresult,exer10a.process());
	}
	
	@Test
	public void test10b() {
		ArrayList<String> expectedresult = new ArrayList<String>();
		expectedresult.add("Main before p1: 10");
		expectedresult.add("In p1: 100");
		expectedresult.add("Main before p2: 100");
		expectedresult.add("In p2: 20");
		expectedresult.add("Main at the end: 20");
		expectedresult.add("-----");
		expectedresult.add("Main before p1: 30");
		expectedresult.add("In p1: 600");
		expectedresult.add("Main before p2: 600");
		expectedresult.add("In p2: 120");
		expectedresult.add("Main at the end: 120");
		
		Exam1Num10b exer10b = new Exam1Num10b();
		assertEquals(expectedresult,exer10b.main());
	}
	
	@Test
	public void test10c() {
		ArrayList<String> expectedresult = new ArrayList<String>();
		expectedresult.add("*");
		expectedresult.add("*");
		expectedresult.add("*");
		expectedresult.add("*");
		expectedresult.add("*");
		Exam1Num10c exer10c = new Exam1Num10c();
		assertEquals(expectedresult,exer10c.main());
		
	}
	@Test
	public void test10d() {
		ArrayList<String> expectedresult = new ArrayList<String>();
		
		
		
		
		expectedresult.add("true, false, false");
		expectedresult.add("true, true, false");
		expectedresult.add("false, true, false");
		expectedresult.add("false, false, false");
		Exam1Num10d exer10d = new Exam1Num10d();
		assertEquals(expectedresult,exer10d.main());
		
	}	
	@Test
	public void test10e() {
		ArrayList<String> expectedresult = new ArrayList<String>();
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int c = in.nextInt();
		Exam1Num10e exer10e = new Exam1Num10e();
		expectedresult.add("cart");
		expectedresult.add("cart");
		expectedresult.add("o");
		expectedresult.add("o");
		expectedresult.add("n");
		assertEquals(expectedresult,exer10e.main(1,2,3));
		
	}	

}
