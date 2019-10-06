// Name: Matthew Wright
// Class: 1400-005
// Program #: 1
// Due Date: January 30th, 2009

import java.util.Scanner;

public class mgwright_PunchRun
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		int number1, number2;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		if(number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if(number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if(number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if(number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if(number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if(number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
	}
}
