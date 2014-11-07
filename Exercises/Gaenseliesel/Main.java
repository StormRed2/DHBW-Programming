package edu.dhbw.gaenselieselapplication;

/**
 * 
 * Copyright (C) Florian Martin
 *
 */


public class GaenselieselApplication {
	
	
	public static void main(String[] args) {
		
		
		int gaense = 0;
		int huehner = 0;
		int kanienchen = 0;
		int schafe = 0;
		
		int legs = 90;
		int count = 0;
		
		for(gaense = 0; gaense < 45; gaense++){
			for(huehner = 0; huehner < 45; huehner++){
				for(kanienchen = 0; kanienchen < 23; kanienchen++){
					for(schafe = 0; schafe < 23; schafe++){
						
						count++;
						
						if( (2*huehner == gaense) && (3*schafe == kanienchen) && (gaense+huehner+2*kanienchen+2*schafe == legs/2)){
							System.out.println("Solution:");
							System.out.println("Schafe:"+schafe + " Huehner:" + huehner + " Kanienchen:" + kanienchen + " Schafe:" + schafe);
							System.out.println("Schleifen: " + count);
							return;
						}
					}
				}
			}
			
		}
		
	}

}
