package com.qa.myblackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NormalEntryTest {

	static Blackjack blackjackRef;
	static int iCount;
	
	@BeforeClass 
	static public void beforeClass() {
		System.out.println("Welcome to my Normal Entry Tests");
		blackjackRef = new Blackjack();
		iCount = 1;
	}
	
	@Before 
	public void setUp() {
		System.out.println("Normal Entry Test:" + iCount + "/3");
	}
	
	@After
	public void tearDown() {
		System.out.println("Normal Entry Test:" + iCount + "/3 finished");
		iCount++;
	}	
	
	@Test
	public void test1() {
		assertEquals("both inputs valid, 2nd parameter is higher, therefore it's returned",20,blackjackRef.play(10,20));	//dealer wins	
	}	
	
	@Test
	public void test2() {
		assertEquals("both inputs valid, 1st parameter is higher, therefore it's returned",20,blackjackRef.play(20,10));	//player wins
	}	
	
	@Test
	public void test4() {
		assertEquals("both inputs valid, both are same, no one wins",20,blackjackRef.play(20,20));	//player wins
	}		
	
	@Test
	public void test3() {
		assertEquals("both inputs are valid, both are bust, no one wins",0,blackjackRef.play(30,30));	//no one wins
	}
	
	
	
	@AfterClass
	static public void afterClass() {
		System.out.println("Normal Entry Test Class complete");
	}
	
}
