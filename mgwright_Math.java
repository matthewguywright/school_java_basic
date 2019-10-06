// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 13
// Due Date	: Thursday March 26th, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program accepts a double and uses various methods of the Math class to process it.

import java.util.Scanner;

public class mgwright_Math
{
	public static void main ( String srgs[] )
	{
		//Initialize variables and scanner
		Scanner in = new Scanner( System.in );
		double num;

		//Prompt for user input and process with Math class methods
		System.out.print("Please enter a number: ");
		num = in.nextDouble();

		System.out.printf("Math.ceil(%.3f) = %.3f\n", num, Math.ceil(num));
		System.out.printf("Math.abs(%.3f) = %.3f\n", num, Math.abs(num));
		System.out.printf("Math.floor(%.3f) = %.3f\n", num, Math.floor(num));
		System.out.printf("Math.log(%.3f) = %.3f\n", num, Math.log(num));
		System.out.printf("Math.pow(%.3f, %.3f) = %.3f\n", num, num, Math.pow(num, num));
		System.out.printf("Math.sqrt(%.3f) = %.3f\n", num, Math.sqrt(num));
	}
}
