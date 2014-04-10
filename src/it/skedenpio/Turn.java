package it.skedenpio;

import java.util.Scanner;

public class Turn {
	
	public void execute() {
		
		Deck deck = new Deck(); //Shuffle
		
		Player player1 = new Player();
		player1.setScore(0);
		
		while ( moreCards() )
		{
			Card card = deck.getCard(); //dai carta
			System.out.println(card.getNumero()+" di "+card.getSeme()+". Punti: "+calcValue(card));
			player1.setScore( player1.getScore() + calcValue(card) );
			System.out.println( "TOTALE: " + player1.getScore() );
		} 
		
	}
	
	
	
	public boolean moreCards(){
		System.out.println("CARTA (C) | STO BENE (S)");
		Scanner sc = new Scanner(System.in);
	    String i = sc.next();
	    System.out.println(i);
	    if (i.toLowerCase().equals("c")) {
	    	return true;
	    } else {
	    	return false;
	    }
	}
	
	public boolean isSballato(Player player) {
		if ( player.getScore() > 7.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public float calcValue(Card carta) {
		float valoreCarta = carta.getNumero();
		// Gestisci qui il valore della matta
		if (carta.getNumero()>7) {
			valoreCarta = 0.5f;
		}
		return valoreCarta;
	}
	
	

	
	/*
	protected void execute() {
		 Deck deck = new Deck();

		Card carta = deck.getCard(); //Prendo carta
		System.out.println(carta.getNumero()+" di "+carta.getSeme());//Stampo la carta
		//controllo punteggio carta
		float valoreCarta = carta.getNumero();
		if (carta.getNumero()>7) {
			valoreCarta = 0.5f;
		}
		this.setScore( this.getScore() + valoreCarta );//ricalcolo punteggio
		if (isSballato()) {
			//SBALLATO
		}
		System.out.println(this.getScore());
		//stai o carta?		
		this.moreCards();
	}
			 */


	

}
