package week10;

import java.util.Scanner;

public class Averagesb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int total = 0;
		int counter = 0;
		float average = 0;
		
		Scanner in = new Scanner(System.in);
		
		while (number != -99)
		{
			System.out.print("Enter a Number: ");
			if (in.hasNextInt())
			{
				number = in.nextInt();
				total = total + number;
				counter = counter + 1;
			}
		in.nextLine();
		}
		average = (float)total/(int)counter;
		System.out.print("Average: " + average);
	}

}
