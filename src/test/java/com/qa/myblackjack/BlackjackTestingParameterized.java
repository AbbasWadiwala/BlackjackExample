package com.qa.myblackjack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BlackjackTestingParameterized {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {{0,-10,-10},{0,-10,10},{0,-10,30},{0,-10,50},{0,10,-10},{20,10,20},{10,10,30},{0,10,50},{20,20,10},
			{0,30,-10},{10,30,10},{0,30,30},{0,30,50},{0,50,-10},{0,50,10},{0,50,30},{0,50,50}});
	}
	
	private int iPut1;
	private int iPut2;
	private int iExpected;
	private Blackjack blackjackRef = new Blackjack();
	
	public BlackjackTestingParameterized(int iExpected, int iPlayer, int iDealer) {
		this.iExpected = iExpected;
		this.iPut1 = iPlayer;
		this.iPut2 = iDealer;			
	}
	
	@Test
	public void test() {
		assertEquals(iExpected, blackjackRef.play(iPut1, iPut2));
	}
}
