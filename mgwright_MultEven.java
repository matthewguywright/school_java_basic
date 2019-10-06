// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 8
// Due Date	: Wednesday, march 4, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program accepts a number and outputs if it is EVEN or ODD and if it's a multiple of 13

import java.util.Scanner;

public class mgwright_MultEven
{
	//instantiate variables and Scanner
	private int number;
	Scanner in = new Scanner(System.in);

	public mgwright_MultEven()
	{
		//output welcome and initialize number variable
		System.out.println("Welcome to the MultEven object!");
		number = 0;
	}

	public void input()
	{
		//prompt for and accept user input and store in number variable
		System.out.print("Please enter a non-negative, integer whole value: ");
		number = in.nextInt();
	}

	public void testEven()
	{
		//test number to see if it is EVEN or ODD
		System.out.print(number + "=");

		if(number%2 == 0)
			System.out.print("EVEN\n");
		else
			System.out.print("ODD\n");
	}

	public void testMultiple()
	{
		//test number to see if it is a MULTIPLE of 13
		System.out.print(number + "=");
		
		if(number%13 == 0)
			System.out.print("MULTIPLE\n");
		else
			System.out.print("NOT\n");
	}
}
