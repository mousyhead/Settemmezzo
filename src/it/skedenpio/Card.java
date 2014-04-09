package it.skedenpio;

public class Card {
	
	private String seed;
	
	private int number;

	protected String getSeme() {
		return seed;
	}

	protected int getNumero() {
		return number;
	}

	public Card(String seed, int number){
		
		this.seed=seed;
		this.number=number;
	}
	
	

}
