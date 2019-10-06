//Name: Matthew Wright
//Class: 1400-005

import java.util.Scanner;

public class mgwright_second
{
	public static void main (String args[])
	{
		int dollars;
		int cents = 56;
		String name = "Matt";
		int pennies;

		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Please enter amount of dollars: ");
		dollars = scanner.nextInt();

		System.out.printf("There are %d dollars ", dollars);
		System.out.printf("and %d cents.\n", cents);

		pennies = dollars * 100 + cents;

		System.out.printf("There are %d pennies.", pennies);

		System.out.printf("%s, your program ran!\n", name);
	}
}
