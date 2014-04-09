package it.skedenpio;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Deck d=new Deck();
		System.out.println( Deck.getRandomCard().getSeme() );

		System.out.println( Deck.getRandomCard().getNumero() );

	}

}
