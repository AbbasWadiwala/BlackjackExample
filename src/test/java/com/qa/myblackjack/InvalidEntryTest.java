package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvalidEntryTest {
	
	static Blackjack blackjackRef;
	static int iCount;
	
	@BeforeClass 
	static public void beforeClass() {
		System.out.println("Welcome to my Invalid Entry Tests");
		blackjackRef = new Blackjack();
		iCount = 1;
	}
	
	@Before 
	public void setUp() {
		System.out.println("Invalid Entry Test:" + iCount + "/12");
	}
	
	@After
	public void tearDown() {
		System.out.println("Invalid Entry Test:" + iCount + "/12 finished");
		iCount++;
	}
	
	@Test
	public void test1() {		
		assertEquals("2 low invalid entry", 0,blackjackRef.play(-10,-10)); //both invalid	
	}
	
	@Test
	public void test2() {	
		assertEquals("1st parameter low invalid entry, 2nd paramater valid",0,blackjackRef.play(-10,10));  //one invalid
	}	
	
	@Test
	public void test3() {		
		assertEquals("2nd parameter low invalid entry, 2nd parameter valid but bust",0,blackjackRef.play(-10,30));  //one invalid
	}
	
	@Test
	public void test4() {
		assertEquals("1st parameter low invalid entry and 2nd parameter high invalid entry",0,blackjackRef.play(-10,50));  //both invalid
	}
	
	@Test
	public void test5() {
		assertEquals("1st parameter valid, 2nd parameter low invalid entry",0,blackjackRef.play(10,-10));  //one invalid
	}		
	
	@Test
	public void test6() {
		assertEquals("1st paramter valid, 2nd parameter high invalid entry",0,blackjackRef.play(10,50));	//one invalid
	}	
	
	@Test
	public void test7() {
		assertEquals("1st parameter valid but bust, 2nd paramter is low invalid entry",0,blackjackRef.play(30,-10));	//one invalid
	}	
		
	@Test
	public void test8() {
		assertEquals("1st paramter valid but bust, 2nd paramter high invalid entry", 0,blackjackRef.play(30,50));	//one invalid
	}
	
	@Test
	public void test9() {
		assertEquals("1st parameter high invalid entry, 2nd paramater low invalid entry",0,blackjackRef.play(50,-10)); 	//both invalid
	}	
	
	@Test
	public void test10() {
		assertEquals("1st parameter high invalid entry, 2nd parameter valid",0,blackjackRef.play(50,10));	//one invalid
	}
	
	@Test
	public void test11() {
		assertEquals("1st parameter high invalid entry, 2nd parameter valid but bust",0,blackjackRef.play(50,30));	//one invalid
	}
	
	
	@Test
	public void test12() {
		assertEquals("both parameters high invalid entry", 0,blackjackRef.play(50,50));	//both invalid
	}
	
	@AfterClass
	static public void afterClass() {
		System.out.println("Invalid Entry Test Class complete");
	}	
}
