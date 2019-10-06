// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 9
// Due Date	: Friday, March 6, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program converts a single character into it's Leet equivalent

import java.util.Scanner;

public class mgwright_Leet
{
	public static void main( String args[] )
	{
		//initialize variables and Scanner
		char input;
		Scanner in = new Scanner(System.in);

		//prompt for and accept user input and store in input variable
		System.out.print("Enter character to covert: ");
		input = in.next().charAt(0);

		//create conversion switch statement
		switch(input)
		{
			case 'A': case 'a':
				System.out.println(input + " 4");
				break;
			case 'B': case 'b':
				System.out.println(input + " I3");
				break;
			case 'C': case 'c':
				System.out.println(input + " [");
				break;
			case 'D': case 'd':
				System.out.println(input + " )");
				break;
			case 'E': case 'e':
				System.out.println(input + " 3");
				break;
			case 'F': case 'f':
				System.out.println(input + " |=");
				break;
			case 'G': case 'g':
				System.out.println(input + " &");
				break;
			case 'H': case 'h':
				System.out.println(input + " #");
				break;
			case 'I': case 'i':
				System.out.println(input + " 1");
				break;
			case 'J': case 'j':
				System.out.println(input + " J");
				break;
			case 'K': case 'k':
				System.out.println(input + " >|");
				break;
			case 'L': case 'l':
				System.out.println(input + " 1");
				break;
			case 'M': case 'm':
				System.out.println(input + " /\\/\\");
				break;
			case 'N': case 'n':
				System.out.println(input + " ^/");
				break;
			case 'O': case 'o':
				System.out.println(input + " 0");
				break;
			case 'P': case 'p':
				System.out.println(input + " |*");
				break;
			case 'Q': case 'q':
				System.out.println(input + " Q");
				break;
			case 'R': case 'r':
				System.out.println(input + " I2");
				break;
			case 'S': case 's':
				System.out.println(input + " 5");
				break;
			case 'T': case 't':
				System.out.println(input + " 7");
				break;
			case 'U': case 'u':
				System.out.println(input + " (_)");
				break;
			case 'V': case 'v':
				System.out.println(input + " \\/");
				break;
			case 'W': case 'w':
				System.out.println(input + " \\/\\/");
				break;
			case 'X': case 'x':
				System.out.println(input + " ><");
				break;
			case 'Y': case 'y':
				System.out.println(input + " Y");
				break;
			case 'Z': case 'z':
				System.out.println(input + " 2");
				break;
			default:
				System.out.println(input + " -");
		}
	}
}
