package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BustEntryTest {
	
	static Blackjack blackjackRef;
	static int iCount;
	
	@BeforeClass 
	static public void beforeClass() {
		System.out.println("Welcome to my Bust Entry Tests");
		blackjackRef = new Blackjack();
		iCount = 1;
	}
	
	@Before 
	public void setUp() {
		System.out.println("Bust Entry Test:" + iCount + "/2");
	}
	
	@After
	public void tearDown() {
		System.out.println("Bust Entry Test:" + iCount + "/2 finished");
		iCount++;
	}
	
	@Test
	public void test1() {
		assertEquals("both inputs valid, 2nd parameter is bust, therefore 1st parameter is returned",10,blackjackRef.play(10,30));	//player wins
	}
	
	@Test
	public void test2() {
		assertEquals("both inputs valid, 1st paramter is bust, therefore 2nd is returned",10,blackjackRef.play(30,10));	//dealer wins
	}	
	
	@AfterClass
	static public void afterClass() {
		System.out.println("Bust Entry Test Class complete");
	}	
	
}
