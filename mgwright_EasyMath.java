// Name: Matthew Wright
// Class: 1404
// Program: 2.02

import  java.util.Scanner;

public class mgwright_EasyMath
{
	public static void main ( String args[] )
	{
		int inputNum;
		int totalNum;

		Scanner input = new Scanner( System.in );

		System.out.print("Please enter an integer value for x: ");
		inputNum = input.nextInt();

		totalNum = inputNum * inputNum + (3 * inputNum) + 2;

		System.out.printf("Given the value %d for x, y = %d in our function.\n", inputNum, totalNum);
	}
}
