package it.skedenpio;

import java.util.Scanner;

public class Turn {
	
	public void execute() {
		
		clearConsole();
		Deck deck = new Deck(); //Shuffle
		
		// TURNO PLAYER1
		Player player1 = new Player();
		player1.setScore(0);		
		do {
			Card card = deck.getCard(); //dai carta	
			player1.setScore( player1.getScore() + calcValue(card) );
			if ( isSballato(player1) ) {
				System.out.println( "TOTALE: " + player1.getScore() );
				System.out.println( "HAI SBALLATO!!!" );				
				Replay();
			} else {
				deck.getCard(); //dai carta
				System.out.println(card.getNumero()+" di "+card.getSeme()+". Punti: "+calcValue(card));
				System.out.println( "TOTALE: " + player1.getScore() );
				System.out.println("CARTA (C) | STO BENE (S)");
			}
		} while ( moreCards() && !isSballato(player1) );
		
		
		

		
		// TURNO DEALER
		if ( !isSballato(player1) ) {
			Player dealer = new Player();
			dealer.setScore(0);
			
			System.out.println("TURNO DEALER");
		}

		
	}
	
	public void Replay(){		
		System.out.println("RIGIOCA (R) | ESCI (X)");
		Scanner sc = new Scanner(System.in);
	    String i = sc.next();
	    System.out.println(i);
	    if (i.toLowerCase().equals("r")) {
	    	execute();
	    } else {
	    	System.exit(0);
	    }
	}
	
	public boolean moreCards(){		
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
	 * * UTILITIES da spostare in altro pacchetto
	 * 
	 * 
	 * 
	 */
	public final static void clearConsole() {
		for (int i = 0; i < 50; ++i) {
			System.out.println();
		}			
//		try {
//			final String os = System.getProperty("os.name");
//			if (os.contains("Windows")) {
//				Runtime.getRuntime().exec("cls");
//			} else {
//				Runtime.getRuntime().exec("clear");
//			}
//		} catch (final Exception e) {
//			// Handle any exceptions.
//		}
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
