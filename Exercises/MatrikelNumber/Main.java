package edu.dhbw.matrikelnumber;

import java.util.Scanner;

/**
 *  Copyright Florian Martin
 *  Oct 30, 2014
 *
 */
public class MatrikelnumberApplication {
	
	private static boolean verifyIsANumber(String Input){
		
		try
		{
			int test = Integer.parseInt(Input);
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Error: Invalid Input, please enter numbers from 0-9.");
			return false;
			
			
		}
	}
	
	private static boolean verifyHas7Digits(String Input){
		
		if(Input.length()== 7 && (verifyIsANumber(Input) == true))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static boolean verifyChecksum(String Input){
		
		//z1*2 + z2*1 + z3*4 + z4*3 + z5*2 + z6*1 = checksum = z7
		
		if((verifyHas7Digits(Input) == true))
		{
			int MatrikelNumber = Integer.parseInt(Input);
			
			//if all zs are 9 checksum = 117
			int z7 = MatrikelNumber % 10;
			int z6 = MatrikelNumber / 10 % 10;
			int z5 = MatrikelNumber / 100 % 10; 
			int z4 = MatrikelNumber / 1000 % 10;
			int z3 = MatrikelNumber / 10000 % 10;
			int z2 = MatrikelNumber / 100000 % 10;
			int z1 = MatrikelNumber / 1000000 % 10;	
			
			if ((z1*2 + z2*1 + z3*4 + z4*3 + z5*2 + z6*1)%10 == z7)
			{
				return true;
			}
								
			//System.out.println(z5);
			
			
			
		return false;
		}
		else
		{
			return false;
		}
		
		   
	}
	private static void CheckInput(String string){
		
		System.out.println("You entered: " + string);
		System.out.println("Checking if its a valid Input....");
		System.out.println("");
		
		if ((verifyIsANumber(string)== true) && (verifyHas7Digits(string) == true))
		{
			verifyChecksum(string);
			System.out.println("You entered a correct Matrikel Number!");
			//System.out.println(z1);
		}
		else
		{
			System.out.println("You didn't enter a valid Matrikel Number!");
		}
	}
	
	
	public static void main(String[] args){
		
		/*
		Scanner input = new Scanner(System.in);
		String n;
		System.out.print("Enter the Matrikel Number:");
		n = input.next(); //.nextInt();
		
		//System.out.println("You entered: " +n );
		*/
		
		//CheckInput("1234567");
		//CheckInput("123456");
		//CheckInput("Hugo");
		CheckInput("123456");
		
	}

}

//
// UMBAUEN MIT TRY CATCH --> KEIN IF ELSE :::etnweder if else oder exceptions, nicht beides
// try
//alle methoden
//catch
//

/*
* verifynumber, 7digits, checksum
* z1*2 + z2*1 + z3*4 + z4*3 + z5*2 + z6*1 = checksum 
* 1234567 = doesnt work
*/
