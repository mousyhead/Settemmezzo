package it.skedenpio;

public class Deck {

	private static Card[] cards= {new Card("Denari",1),
		new Card("Denari",2),
		new Card("Denari",3),
		new Card("Denari",10),
		new Card("Denari",9),
		new Card("Denari",8)}; 
	
	
	public static Card getRandomCard() {
		int i = (int) (Math.random()*cards.length);
		return cards[i];
	}
	




}