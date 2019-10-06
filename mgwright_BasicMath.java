// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 3
// Due Date	: February 6th @ 12am
//
// Honor Pledge	: 	On my honor as a student of the University of Nebraska
//			at Omaha, I have neither given nor received unauthorized
//			help on this assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// This program receives 3 integer inputs and performs various calculations with them.
// It adds, multiplies, divides, mod divides and subtracts the inputs in different combinations.

import java.util.Scanner;

public class mgwright_BasicMath 
{
	public static void main (String args[])
	{
		//Declare Variables
		int first;
		int second;
		int third;
		int add;
		int div;
		int mod;
		int pro;
		int dif;

		//Instantiate Scanner
		Scanner input = new Scanner( System.in );		

		//Receive user input and put into variables
		System.out.print("Please enter your first number: ");
		first = input.nextInt();

		System.out.print("Please enter your second number: ");
		second = input.nextInt();

		System.out.print("Please enter your third number: ");
		third = input.nextInt();

		//Perform arithmetic to load add, div, mod, pro and dif variables
		add = first + second + third;
		div = first / third;
		pro = first * second * third;
		mod = first % second;
		dif = first - second;
		
		//Output results of arithmetic to console
		System.out.println("ADD:" + add);
		System.out.println("DIV:" + div);
		System.out.println("MOD:" + mod);
		System.out.println("PRO:" + pro);
		System.out.println("DIF:" + dif);
	}
}
