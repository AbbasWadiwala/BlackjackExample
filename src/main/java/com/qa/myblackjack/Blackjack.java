package com.qa.myblackjack;

public class Blackjack {

	public static void main(String[] args) {
		
		
	}
	
	public int play(int player, int dealer) {			
		if((player > 0 && player < 31) && (dealer > 0 && dealer < 31)) {
				return Math.max(player > 21 ? 0 : player, dealer > 21 ? 0 : dealer);
		}					
		return 0;
	}

}
