package week14;

import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("How many Data Points?"); //read from keyboard
		int number = in.nextInt();
		
		double [] numbers = new double[number]; //declares array of number element
		
		//read doubles into each drawer (element) of the array
		//		  0 1 2 3 4 5..
		//numbers [][][][][][]..
		for (int i = 0; i < number; i++)
		{
			System.out.println("Input value number " + i + ": ");
			numbers[i] = in.nextDouble();
		}
		
		printArray(numbers); //pass array to procedure
		printStatistics(numbers);
		
	}
	
	static void printArray(double data[])
	{
		//data.length 
		for (int i = 0; i < data.length; i++)
		{
			System.out.println("[" + i + "]: " + data[i]);
		}
	}
	
	static void printStatistics(double data[])
	{
		//calculate mean average
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++)
		{
			total += data[i];
		}
		
		double meanValue = total / data.length;
		
		total = 0.0;
		
		for (int i = 0; i < data.length; i++)
		{
			 total = total + (data[i] - meanValue) * (data[i] - meanValue);
		}
		
		double variance = total / data.length;
		double standardDeviation = Math.sqrt(variance);
		
		System.out.println("Average: " + meanValue);
		System.out.println("Variance: " + variance);
		System.out.println("Standard Deviation: " + standardDeviation);
	}

}
