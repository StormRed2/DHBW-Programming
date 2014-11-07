package edu.dhbw.taxapplication;

/**
 *  Copyright Florian Martin
 *  Oct 23, 2014
 *
 */
public class TaxApplication {

	private static final int TAX = 19; // Tax Value in %
	
	
	private static float getCalculatedNetto(String stringNettoValue ){
		
		float NettoValue = 0.0f;
		try
		{
			NettoValue = Float.parseFloat(stringNettoValue);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Error: Invalid Input");
		}
		
		return NettoValue;
		
	}
	
	private static float getBrutto(String value, float Netto) {
		//float temp = Float.parseFloat(TAX);
		return (Netto + ((TAX * Netto)/100));
				
	}
	
	private static void printTaxes(String value) {
		
		float Netto = getCalculatedNetto(value);
		float Brutto = getBrutto(value, Netto);
				
		System.out.println("Netto " + value + "$");
		System.out.println("Taxes " + TAX  +"%");
		System.out.println("Brutto " +Brutto+ "$");
		//System.out.println("Brutto " + (value + ((TAX * Netto)/100)) + "$");
		//System.out.println(((TAX * Netto)/100));
	}
	
	
    public static void main(String[] args) {
    	
    	switch (args.length)  //muster loesung
    	{
    		case 0:
    			System.out.println("No args");
    			break;
    		case 1:
    			printTaxes(args[0]);
    			break;
    		default:
    			System.out.println("too many");
    			break;
    	}
    	
    	//printTaxes(args[0]);
    	
    	//array checken fuer nummern und etc  -> try catch
    	
    }
}
