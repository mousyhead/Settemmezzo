package it.skedenpio;

import java.util.Scanner;

public class Turn {
	
	
	
	public void execute() {
		
		clearConsole();		
		Deck deck = new Deck();
		
		// TURNO PLAYER1
		Player player1 = new Player();
		player1.setScore(0);	
			
		do { 
			Card card = deck.getCard(); //dai carta
			System.out.println(deck.getCardsList().size());
			
			player1.setScore( player1.getScore() + deck.calcValue(card) );
			if ( isSballato(player1) ) {
				System.out.println(card.getNumero()+" di "+card.getSeme()+". Punti: "+deck.calcValue(card));
				System.out.println( "TOTALE: " + player1.getScore() );
				System.out.println( "HAI SBALLATO!!!" );		
				return;
			} else {
				System.out.println(card.getNumero()+" di "+card.getSeme()+". Punti: "+deck.calcValue(card));
				System.out.println( "TOTALE: " + player1.getScore() );
				System.out.println("CARTA (C) | STO BENE (S)");				
			}
		} while ( moreCards() && !isSballato(player1) );
		
		
		
		if ( !isSballato(player1) ) {
			// TURNO DEALER
			Player dealer = new Player();
			dealer.setScore(0);			
			System.out.println("TURNO DEALER");
			do { 
				Card carta2 = deck.getCard(); //dai carta	
				System.out.println(deck.getCardsList().size());
				dealer.setScore( dealer.getScore() + deck.calcValue(carta2) );
				if ( isSballato(dealer) ) {
					System.out.println(carta2.getNumero()+" di "+carta2.getSeme()+". Punti: "+deck.calcValue(carta2));
					System.out.println( "TOTALE: " + dealer.getScore() );
					System.out.println( "IL DEALER HA SBALLATO! HAI VINTO!!!" );									
				} else {
					System.out.println(carta2.getNumero()+" di "+carta2.getSeme()+". Punti: "+deck.calcValue(carta2));
					System.out.println( "TOTALE DEALER: " + dealer.getScore() );	
				}
			} while ( ( dealer.getScore() < player1.getScore()-2 ) && !isSballato(dealer) );
			
			if (player1.getScore() > dealer.getScore() ) {
				System.out.println( "HAI VINTO!!!" );	// VINCE PLAYER1				
			} else if(!isSballato(dealer)) {
				System.out.println( "HAI PERSO!!!" );	// VINCE DEALER				
			}
//			if (deck.getReShuffle()==true) {
//				deck = new Deck();
//			}
			return;			
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

	
	

}
