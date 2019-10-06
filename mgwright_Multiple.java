// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 4
// Due Date	: February 8th @ 12am
//
// Honor Pledge	:	On my honor as a student of the University of Nebraska
//			at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// This program accepts a number and tells the user if it is even or odd and also if it is a multiple of 13

import java.util.Scanner;

public class mgwright_Multiple
{
	public static void main ( String args[] )
	{
		//Declare Variables
		int num1 = 13;
		int num2;

		//Instantiate Scanner
		Scanner input = new Scanner( System.in );

		//Accept user input and assign to variable
		System.out.print("Please enter a non-negative (>= 0) integer (whole) number: ");
		num2 = input.nextInt();

		//Output num2
		System.out.print(num2);
		
		//Test to see if input is a multiple of 13 and if it is even or odd
		if((num2 % num1) != 0)
			System.out.print(":NOT");
		if((num2 % num1) == 0)
			System.out.print(":MULTIPLE");
		if((num2 % 2) == 0)
			System.out.println(":EVEN");
		if((num2 % 2) == 1)	
			System.out.println(":ODD");
	}
}
