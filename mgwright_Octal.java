// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 6
// Due Date	: Tuesday, February 24th, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program accepts a number and converts it into it's Octal equivalent

import java.util.Scanner;

public class mgwright_Octal
{
	public static void main( String args[] )
	{
		int num;
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a number between 0 and 32767 to convert: ");
		num = in.nextInt();

		if(num <= 32767)
		{
			System.out.print("Your integer number " + num + " is ");			

			//Convert num to octal equivalent
			System.out.print(num/(8*8*8*8));
			num = num%(8*8*8*8);
			System.out.print(num/(8*8*8));
			num = num%(8*8*8);   				
			System.out.print(num/(8*8));
			num = num%(8*8);
			System.out.print(num/8);
			num = num%8;
			System.out.print(num/1);
			num = num%1;			

			System.out.print(" in octal.\n");
		}
		else
		{
			System.out.println("UNABLE TO CONVERT");
		}
	}
}
