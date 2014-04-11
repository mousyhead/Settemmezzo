package it.skedenpio;

import java.util.Scanner;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Turn turn = new Turn();
		boolean replay = false;
		do {
			turn.execute();
			
			System.out.println("RIGIOCA (R) | ESCI (X)");
			Scanner sc = new Scanner(System.in);
		    String i = sc.next();
		    System.out.println(i);
		    if (i.toLowerCase().equals("r")) {
		    	replay = true;
		    } else {
		    	return;
		    }
		} while (replay);
		
		
		
		

	}

}
