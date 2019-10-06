// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 10
// Due Date	: Monday, March 9, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program accepts a distance and a weight and calculates the cost for shipping.

import java.util.Scanner;

public class mgwright_Shipping
{
	public static void main( String args[] )
	{
		//initialize variables and Scanner
		int weight = 0;
		int distance = 0;
		double rate = 0.0;
		double totalCost = 0.0;
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Matt's Magical World of Shipping Wonderfullness!");

		//accept and validate user input and store into appropriate variables
		do
		{
			System.out.print("How far will you be shipping the package in miles? ");
			distance = in.nextInt();
		} while(distance < 1);

		do
		{
			System.out.print("How heavy is your package in pounds (1-65)? ");
			weight = in.nextInt();
		} while(weight < 1 || weight > 65);

		//Calculate and process shipping rate
		if(weight >= 1 && weight <= 4)
		{
			rate = 2.34;
		}
		else if(weight >= 5 && weight <= 12)
		{
			rate = 4.31;
		}
		else if(weight >= 13 && weight <= 22)
		{
			rate = 6.01;
		}
		else if(weight >= 23 && weight <= 45)
		{
			rate = 6.27;
		}
		else if(weight >= 46 && weight <= 65)
		{
			rate = 7.01;
		}
		
		if(distance >= 1 && distance <= 25)
		{
			totalCost = rate;
		}
		else if(distance > 25)
		{
			totalCost = rate * (distance / 25);
			
			if(distance % 25 != 0)
				totalCost += rate;
		}

		//output shipping and cost information
		System.out.printf("The shipping rate is $%f per 25 miles.\n", rate);
		System.out.printf("Your total shipping cost for %d mile(s) is $%f\n", distance, totalCost);
	}
	
}
