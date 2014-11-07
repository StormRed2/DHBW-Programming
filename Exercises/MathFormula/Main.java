package edu.dhbw.mathformular;

import java.text.DecimalFormat;

/**
 *  Copyright Florian Martin
 *  Nov 6, 2014
 *
 */
public class MathFormular {

	private static double calculate (int value){
		
		double actualValue = 0.0;
		
		
		if (value == 1)
		{
			return 1;
		}
		else
		{
			return actualValue = calculate(value - 1)+ Math.pow(1.25, value);
		}
		//return actualValue;
		
		
	}
	
	// if (i == 0)
	//{
	//actualValue = 0.0
	//}
	//
	//for (int i=1; i<=index; i++)
	//{
	//actualValue = actualValue + Math.pow(1.25, i)
	//}
	//return actualValue
	//}
	//      !!abbruchbedingung nicht vergessen!!
	
	public static void main(String[] args){
		
		calculate(1);
	
	DecimalFormat myFormat = new DecimalFormat( "###0.00");
	System.out.println("Formatiert" +myFormat.format(calculate(10)));
	
	}
}
