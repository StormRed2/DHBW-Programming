package edu.dhbw.muenzenapplication;

/**
 * 
 * Copyright (C) Florian Martin
 *
 */

public class MuenzenApplication {
	
	public static void main(String[] args) {
		
		int oneEu; //a
		int twoEu; //b
		int tenCe; //c
		int maxCoins = 80; // max# of coins
		int counts = 0;
		
		
		
		
		// Equations used
		// b = 80 - a - c
		// a = 20 + 0.90c
		//	
		// c has to be a multiple of 10
		
		for (twoEu = 1; twoEu < maxCoins-1; twoEu++){
			for (tenCe = 10; tenCe < maxCoins-1; tenCe = tenCe+10){
				if(twoEu == 20 + 0.9f * tenCe){
					oneEu = 80 - twoEu - tenCe;
					
					counts++;
					//Check if oneEu values are positive
					if (oneEu>9){
					
						
					System.out.println("Solution " + counts + ": 2€ coins: " + twoEu + " (" + 2*twoEu + "€), 1€ coins: " + oneEu + " (" + oneEu + "€), 10ct coins: " + tenCe + " (" + 0.1f*tenCe + "€). ");
					
					} else if (oneEu>0){
						 
						System.out.println("Solution " + counts + ": 2€ coins: " + twoEu + " (" + 2*twoEu + "€), 1€ coins:  " + oneEu + "  (" + oneEu + "€), 10ct coins: " + tenCe + " (" + 0.1f*tenCe + "€). ");

					                    
					
				}
					
			}
				
		}
		
		
	}

}
}
