package it.skedenpio;

import java.util.Scanner;

public class Turn {
	
	private double score = 0;
	
	protected void giveCard() {
		Deck deck = new Deck();
		Card carta = deck.getCard(); //Prendo carta
		System.out.println(carta.getNumero()+" di "+carta.getSeme());//Stampo la carta
		//controllo punteggio carta
		double valoreCarta = carta.getNumero();
		if (carta.getNumero()>7) {
			valoreCarta = 0.5;
		}
		this.setScore( this.getScore() + valoreCarta );//ricalcolo punteggio
		if (isSballato()) {
			//SBALLATO
		}
		System.out.println(this.getScore());
		//stai o carta?		
		this.moreCards();
	}

	public void moreCards(){
		System.out.println("CARTA (C) | STO BENE (S)");
		Scanner sc = new Scanner(System.in);
	    String i = sc.next();
	    System.out.println(i);
	    if (i.equals("C")) {
	    	giveCard();
	    }
	}
	
	public boolean isSballato() {
		if ( this.getScore() > 7.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
