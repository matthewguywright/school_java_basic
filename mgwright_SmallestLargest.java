// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 5
// Due Date	: February 13th, 2009 @ 12 am
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program takes 6 numbers and produces the smallest and the largest of the group

import java.util.Scanner;

public class mgwright_SmallestLargest
{
	public static void main( String args[] )
	{
		//Declare variables and Scanner
		int value;
		int smallest;
		int largest;
		Scanner in = new Scanner( System.in );

		//Accept and input, then compare to smallest and largest
		System.out.print("Please enter the first integer: ");
		value = in.nextInt();
		
		smallest = value;
		largest = value;

		System.out.print("Please enter the second integer: ");
		value = in.nextInt();

		if(value < smallest)
			smallest = value;
		if(value > largest)
			largest = value;

		System.out.print("Please enter the third integer: ");
		value = in.nextInt();

		if(value < smallest)
			smallest = value;
		if(value > largest)
			largest = value;

		System.out.print("Please enter the fourth integer: ");
		value = in.nextInt();

		if(value < smallest)
			smallest = value;
		if(value > largest)
			largest = value;

		System.out.print("Please enter the fifth integer: ");
		value = in.nextInt();

		if(value < smallest)
			smallest = value;
		if(value > largest)
			largest = value;

		System.out.print("Please enter the sixth integer: ");
		value = in.nextInt();
	
		if(value < smallest)
			smallest = value;
		if(value > largest)
			largest = value;
		
			System.out.printf("%d:%d\n", largest, smallest);
	}
}
