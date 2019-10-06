// Name		: Matthew Wright
// Class	: 1400-005
// Program #	: 12
// Due Date	: Thursday, March 26th, 2009 @ 11:59 PM
//
// Honor Pledge	:	On my honor as a student of the University
//			of Nebraska at Omaha, I have neither given nor received
//			unauthorized help on this homework assignment.
//
// NAME: Matthew Wright
// NUID: 832
// EMAIL: mgwright@mail.unomaha.edu

// Partners: NONE

// Description: This program accepts, validates and adds together the birthdate of a person to generate a single number for a numerology report.

import java.util.Scanner;

public class mgwright_Numerology
{
	public static void main( String args[] )
	{
		//Instantiate variables and scanner
		Scanner in = new Scanner( System.in );
		int month, day, year, numReportResult;
		char slashChar1, slashChar2;	
		boolean leapYear = false;
		boolean isValid = false;	

		//Output instructions to user
		System.out.println("NUMEROLOGY MACHINE By Matthew Wright\nWhen prompted, enter your birthday in the following format (a single space between the numbers and slashes):\nmm / dd / yyyy\n");

		do
		{
			isValid = true;

			//Get and validate birthdate
			System.out.print("Enter your birth date (mm / dd / yyyy): ");
			month = in.nextInt();
			slashChar1 = in.next().charAt(0);
			day = in.nextInt();
			slashChar2 = in.next().charAt(0);
			year = in.nextInt();
			
			//Check for slashes in between day and month - and month and year
			if(slashChar1 != '/' || slashChar2 != '/')
			{
				isValid = false;
				System.out.println("Use forward slashes between mm / dd / yyyy!");
				continue;
			}
			else
			{
				//Check year range
				if(!(year <= 2280 && year >= 1880))
				{
					System.out.printf("Bad year: %d\n", year);
					isValid = false;
					continue;
				}
				else
				{
					//Check for leap year
					if((year%100 == 0 && year%400 == 0) || year%4 == 0)
					{
						leapYear = true;
					}
					
					//Check month
					if(!(month >= 1 && month <= 12))
					{
						System.out.printf("Bad month: %d\n", month);
						isValid = false;
						continue;
					}
					else
					{
						//Check day
						if(!(day <= 31 && day >= 1))
						{
							System.out.printf("Bad day: %d\n", day);
							isValid = false;
							continue;
						}
						else
						{
							//Check each month for allowable day ranges
							switch(month)
							{
								case 1: case 3: case 5: case 7: case 8: case 10: case 12:
									if(!(day <= 31 && day >= 1))
									{
										System.out.printf("Bad day for %d/%d : %d\n", month, year, day);
										isValid = false;
									}
									break;
								case 2:
									if(leapYear)
									{
										if(!(day >= 1 && day <= 29))
										{
											System.out.printf("Bad day for %d/%d : %d\n", month, year, day);
											isValid = false;
										}	
									}
									else
									{
										if(!(day >= 1 && day <= 28))
										{
											System.out.printf("Bad day for %d/%d : %d\n", month, year, day);
											isValid = false;
										}
									}
									break;
								case 4: case 6: case 9: case 11:
									if(!(day >= 1 && day <= 30))
									{										
										System.out.printf("Bad day for %d/%d : %d\n", month, year, day);
										isValid = false;
									}
									break;
								default:
									System.out.println("Your month doesn't exist!");
									isValid = false;	
							}	
						}
					}
				}	
			}	
		}while(isValid == false);

		//Calculate numerology number from valid birthdate
		int thousands = 0;
		int hundreds = 0;
		int tens = 0;
		int ones = 0;		
		
		//Add initial day, month and year
		numReportResult = month + day + year;
		
		//Calculate individual integers within the 4 digit integer numReportResult
		thousands = numReportResult / 1000;
		hundreds = numReportResult % 1000 / 100;
		tens = numReportResult % 1000 % 100 / 10;
		ones = numReportResult % 1000 % 100 % 10;

		//initialize numerology number for reuse
		numReportResult = 0;
			
		numReportResult = thousands + hundreds + tens + ones;
		
		//Ensure numReportResult is less than 10 (1-9)
		while(numReportResult > 9)
		{
			tens = numReportResult / 10;
			ones = numReportResult % 10;
			
			numReportResult = tens + ones;
		}	 

		//Output results
		System.out.printf("Here is your personal numerology report for %d/%d/%d :\n:%d: ", month, day, year, numReportResult);

		//Output fortune based on results of numerology addition
		switch(numReportResult)
		{
			case 9:
				System.out.print("You will win the lotto!\n");
				break;
			case 8:
				System.out.print("There is a successful relationship in your future.\n");
				break;
			case 7:
				System.out.print("Things are not what they seem...\n");
				break;		
			case 6:
				System.out.print("A mistake from the past will be forgiven.\n");
				break;
			case 5:
				System.out.print("Drop a bad habit today, you'll feel better about yourself.\n");
				break;
			case 4:
				System.out.print("Never cut what you can untie.\n");
				break;
			case 3:
				System.out.print("A good deed from the past will soon be returned.\n");
				break;
			case 2:
				System.out.print("No injustice is justice without just justification.\n");
				break;
			case 1:
				System.out.print("Tu estas muy bien en la Java en los computos comprehende.\n");
				break;
			default:
				System.out.print("I see good things in your life. I just can't tell you what they are...\n");
		}
	}
}
