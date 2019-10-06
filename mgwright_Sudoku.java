// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 7
// Due Date	: Friday, February 27th, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description:	This program takes 4 columns and 4 rows of numbers and evaluates them to see if they are valid Sodoku groupings.

import java.util.Scanner;

public class mgwright_Sudoku
{
	public static void main( String args[] )
	{
		//Output game instructions
		System.out.print("Welcome to the Sudoku Checker v1.0!\n\nThis program checks simple, small, 4x4 Sudoku grids for correctness. Each column, row and 2x2 region contains the numbers 1 through 4 only once.\n\nTo check your Sudoku, enter your board one row at a time, with each digit separated by a space. Hit ENTER at the end of a row.\n\n");

		Scanner in = new Scanner(System.in);
		int num1a, num2a, num3a, num4a, num1b, num2b, num3b, num4b, num1c, num2c, num3c, num4c, num1d, num2d, num3d, num4d;
		int valid = 1;

		//Accept input and load variables
		System.out.print("Enter Row 1: ");
		num1a = in.nextInt();
		num1b = in.nextInt();
		num1c = in.nextInt();
		num1d  = in.nextInt();

		System.out.print("Enter Row 2: ");
		num2a = in.nextInt();
		num2b = in.nextInt();
		num2c = in.nextInt();
		num2d = in.nextInt();
		
		System.out.print("Enter Row 3: ");
		num3a = in.nextInt();
		num3b = in.nextInt();
		num3c = in.nextInt();
		num3d = in.nextInt();
			
		System.out.print("Enter Row 4: ");
		num4a = in.nextInt();
		num4b = in.nextInt();
		num4c = in.nextInt();
		num4d = in.nextInt();

		//Check Regions, Rows and Columns
		//REGION 1
		if(num1a + num1b + num2a + num2b == 10)
		{
			System.out.println("\nREG-1:GOOD");
		}
		else
		{
			valid = 0;
			System.out.println("\nREG-1:BAD");
		}
				
		//REGION 2
		if(num3a + num4a + num3b + num4b == 10)
		{
			System.out.println("REG-2:GOOD");
		}
		else
		{
			valid = 0;
			System.out.println("REG-2:BAD");
		}	
		
		//REGION 3
		if(num1c + num1d + num2c + num2d == 10)
		{
			System.out.println("REG-3:GOOD");
		}
		else
		{
			valid = 0;
			System.out.println("REG-3:BAD");
		}	
		
		//REGION 4
		if(num3c + num3d + num4c + num4d == 10)
		{
			System.out.println("REG-4:GOOD");
		}
		else
		{
			valid = 0;
			System.out.println("REG-4:BAD");
		}	

		//ROW 1
		if(num1a + num1b + num1c + num1d == 10)
		{
			System.out.println("ROW-1:GOOD");
		}
		else
		{
			System.out.println("ROW-1:BAD");
			valid = 0;
		}
		
		//ROW 2
		if(num2a + num2b + num2c + num2d == 10)
		{
			System.out.println("ROW-2:GOOD");
		}
		else
		{
			System.out.println("ROW-2:BAD");
			valid = 0;
		}

		//ROW 3
		if(num3a + num3b + num3c + num3d == 10)
		{
			System.out.println("ROW-3:GOOD");
		}
		else
		{
			System.out.println("ROW-3:BAD");
			valid = 0;
		}

		//ROW 4
		if(num4a + num4b + num4c + num4d == 10)
		{
			System.out.println("ROW-4:GOOD");
		}
		else
		{
			System.out.println("ROW-4:BAD");
			valid = 0;
		}

		//COLUMN 1
		if(num1a + num2a + num3a + num4a == 10)
		{
			System.out.println("COL-1:GOOD");
		}
		else
		{
			System.out.println("COL-1:BAD");
			valid = 0;
		}

		//COLUMN 2
		if(num1b + num2b + num3b + num4b == 10)
		{
			System.out.println("COL-2:GOOD");
		}
		else
		{
			System.out.println("COL-2:BAD");
			valid = 0;
		}

		//COLUMN 3
		if(num1c + num2c + num3c + num4c == 10)
		{
			System.out.println("COL-3:GOOD");
		}
		else
		{
			System.out.println("COL-3:BAD");
			valid = 0;
		}

		//COLUMN 4
		if(num1d + num2d + num3d + num4d == 10)
		{
			System.out.println("COL-4:GOOD");
		}
		else
		{
			System.out.println("COL-4:BAD");
			valid = 0;
		}

		//Output validity
		if(valid == 1)
		{
			System.out.println("\nSUDO:VALID");
		}
		else
		{
			System.out.println("\nSUDO:INVALID");
		}
	}
}
