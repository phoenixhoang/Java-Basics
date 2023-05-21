package week11;

import java.util.Scanner;

public class ValidDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int monthDays;
		String monthName;
		
		System.out.println("Enter the Month as a Number: ");
		int userInputMonths = input.nextInt();
		
		System.out.println("Enter the day: ");
		int userInputDays = input.nextInt();
		
		switch (userInputMonths) {
			case 1:
				monthName = "January";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 0) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 2:
				monthName = "February";
				monthDays = 28;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 3:
				monthName = "March";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 4:
				monthName = "April";
				monthDays = 30;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 5:
				monthName = "May";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;		
				
			case 6:
				monthName = "June";
				monthDays = 30;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}	
			break;	
				
			case 7:
				monthName = "July";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
			
			case 8:
				monthName = "August";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
			
			case 9:
				monthName = "September";
				monthDays = 30;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 10:
				monthName = "October";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 11:
				monthName = "November";
				monthDays = 30;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
				
			case 12:
				monthName = "December";
				monthDays = 31;
				
				if (userInputDays > monthDays || userInputDays < 1) 
				{
					System.out.println(userInputDays + " is not valid for " + monthName + ".");
				}
				else
				{
					System.out.println(userInputDays + " is valid for " + monthName + ".");
				}
			break;
			
			default:
				System.out.println("This is not a valid month.");
		}
		
	}

}
