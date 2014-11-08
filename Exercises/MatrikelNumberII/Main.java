package edu.dhbw.matrikelnumberii;

/**
 * Copyright Florian Martin
 * Nov 7, 2014 
 *
 */

public class MatrikelNumberII {

	
	
	private static void VerifyIsANumber(String input) throws Exception {

		try 
		{
			Integer.parseInt(input);		
		}
		catch (Exception e)
		{
			
			throw new Exception("Not a Number...");
			//System.out.println("Error : " +e.getMessage());
		}
		
		/*
		if (input.matches("[0123456789]*")==false)
		{
			throw new Exception("ist eine Zahl aber mit ungueltigen Zeichen (+,-,...)");
		}
		*/
	}
	
	private static void VerifyHas7Digits(String input) throws Exception {
		
		if (input.length()==7)
		{
		
		  return;
			
		}
		
		throw new Exception("Input must be 7 digits long...");
		
	}
	private static void VerifyCheckSum(String input) throws Exception {
		//try
		//{
			int MatrikelNumber = Integer.parseInt(input);
			
			//if all zs are 9 checksum = 117
			int z7 = MatrikelNumber % 10;
			int z6 = MatrikelNumber / 10 % 10;
			int z5 = MatrikelNumber / 100 % 10; 
			int z4 = MatrikelNumber / 1000 % 10;
			int z3 = MatrikelNumber / 10000 % 10;
			int z2 = MatrikelNumber / 100000 % 10;
			int z1 = MatrikelNumber / 1000000 % 10;	
			
			if ((z1*2 + z2*1 + z3*4 + z4*3 + z5*2 + z6*1)%10 != z7)
			{
				throw new Exception("Not a valid Matrikel Number...");
			}
		}
		//catch (Exception e)
		
		
	//}
	

	
	private static void CheckInput (String Input){
		
	try {
		VerifyIsANumber(Input);
		VerifyHas7Digits(Input);
		VerifyCheckSum(Input);
		
		System.out.println(Input + ": is a valid Matrikel Number!");
		
	}	
	catch (Exception e)
	{
		System.err.println("Caught IOException: " + e.getMessage());
	}
		
		
	}


	public static void main (String[] args){
		
		CheckInput("9999997");
		
	
	
	}


}
