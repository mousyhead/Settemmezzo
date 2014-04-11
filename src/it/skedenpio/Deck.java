package it.skedenpio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

	private Card[] cards= {
		new Card("Denari",1),
		new Card("Denari",2),
		new Card("Denari",3),
		new Card("Denari",4),
		new Card("Denari",5),
		new Card("Denari",6),
		new Card("Denari",7),
		new Card("Denari",8),
		new Card("Denari",9),
		new Card("Denari",10),
		new Card("Spade",1),
		new Card("Spade",2),
		new Card("Spade",3),
		new Card("Spade",4),
		new Card("Spade",5),
		new Card("Spade",6),
		new Card("Spade",7),
		new Card("Spade",8),
		new Card("Spade",9),
		new Card("Spade",10),
		new Card("Bastoni",1),
		new Card("Bastoni",2),
		new Card("Bastoni",3),
		new Card("Bastoni",4),
		new Card("Bastoni",5),
		new Card("Bastoni",6),
		new Card("Bastoni",7),
		new Card("Bastoni",8),
		new Card("Bastoni",9),
		new Card("Bastoni",10),
		new Card("Coppe",1),
		new Card("Coppe",2),
		new Card("Coppe",3),
		new Card("Coppe",4),
		new Card("Coppe",5),
		new Card("Coppe",6),
		new Card("Coppe",7),
		new Card("Coppe",8),
		new Card("Coppe",9),
		new Card("Coppe",10)}; 

	private ArrayList<Card> cardsList; 

	private boolean reShuffle = false;
	
	public ArrayList<Card> getCardsList() {
		return cardsList;
	}

	public Deck(){
		shuffleDeck();
		System.out.println("Mazzo mescolato! Iniziamo...");
	}

	private void shuffleDeck(){
		cardsList = new ArrayList<Card>(Arrays.asList(cards));
		Collections.shuffle(cardsList);
	}

	public Card getCard(){
		Card c = cardsList.get(0);
		cardsList.remove(0);
		if ( c .getNumero() == 10 && c.getSeme().equals("Denari") ) {
			reShuffle = true;
		}
		return c;
	}
	
	public float calcValue(Card carta) {
		float valoreCarta = carta.getNumero();
		// Gestisci qui il valore della matta
		if (carta.getNumero()>7) {
			valoreCarta = 0.5f;
		}
		return valoreCarta;
	}
	
	public boolean getReShuffle() {
		return reShuffle;
	}

}