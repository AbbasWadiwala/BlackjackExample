package com.qa.myblackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BlackjackTest {
	static Blackjack blackjackRef;
	static int iCount;
	
	@BeforeClass 
	static public void beforeClass() {
		System.out.println("Welcome to my tests");
		blackjackRef = new Blackjack();
		iCount = 1;
	}
	
	@Before 
	public void setUp() {
		System.out.println("Test:" + iCount + "/17");
	}
	
	@After
	public void tearDown() {
		System.out.println("Test:" + iCount + "/17 finished");
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
		assertEquals("both inputs valid, 2nd parameter is higher, therefore it's returned",20,blackjackRef.play(10,20));	//dealer wins	
	}
	
	@Test
	public void test7() {
		assertEquals("both inputs valid, 2nd parameter is bust, therefore 1st parameter is returned",10,blackjackRef.play(10,30));	//player wins
	}
	
	@Test
	public void test8() {
		assertEquals("1st paramter valid, 2nd parameter high invalid entry",0,blackjackRef.play(10,50));	//one invalid
	}
	
	
	@Test
	public void test9() {
		assertEquals("both inputs valid, 1st parameter is higher, therefore it's returned",20,blackjackRef.play(20,10));	//player wins
	}
	
	@Test
	public void test10() {
		assertEquals("1st parameter valid but bust, 2nd paramter is low invalid entry",0,blackjackRef.play(30,-10));	//one invalid
	}
	
	@Test
	public void test11() {
		assertEquals("both inputs valid, 1st paramter is bust, therefore 2nd is returned",10,blackjackRef.play(30,10));	//dealer wins
	}
	
	
	@Test
	public void test12() {
		assertEquals("both inputs are valid, both are bust, no one wins",0,blackjackRef.play(30,30));	//no one wins
	}
	
	
	@Test
	public void test13() {
		assertEquals("1st paramter valid but bust, 2nd paramter high invalid entry", 0,blackjackRef.play(30,50));	//one invalid
	}
	
	@Test
	public void test14() {
		assertEquals("1st parameter high invalid entry, 2nd paramater low invalid entry",0,blackjackRef.play(50,-10)); 	//both invalid
	}
	
	
	@Test
	public void test15() {
		assertEquals("1st parameter high invalid entry, 2nd parameter valid",0,blackjackRef.play(50,10));	//one invalid
	}
	
	@Test
	public void test16() {
		assertEquals("1st parameter high invalid entry, 2nd parameter valid but bust",0,blackjackRef.play(50,30));	//one invalid
	}
	
	
	@Test
	public void test17() {
		assertEquals("both parameters high invalid entry", 0,blackjackRef.play(50,50));	//both invalid
	}
	
	
	
	
	@AfterClass
	static public void afterClass() {
		System.out.println("Test class complete");
	}
	
	
	
												
	
	
	
	
}
