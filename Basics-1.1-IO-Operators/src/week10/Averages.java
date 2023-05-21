package week10;

import java.util.Scanner;

public class Averages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int total = 0;
		float average = 0;
		
		Scanner in = new Scanner(System.in);
		
		for (int counter = 0; counter < 5; counter ++)
		{
			System.out.print("Enter a Number: ");
			if (in.hasNextInt())
			{
				number = in.nextInt();
				total = total + number;
			}
		in.nextLine();
		}
		average = (float)total/5f;
		System.out.print("Average: " + average);
	}

}
