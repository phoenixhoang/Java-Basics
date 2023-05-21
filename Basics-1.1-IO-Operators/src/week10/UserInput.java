package week10;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int age = -99;
		float height = -99.9f;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name = in.nextLine(); //read next string
		
		while (age == -99)
		{
			System.out.print("Enter your Age: ");
			if (in.hasNextInt())
				age = in.nextInt();
			in.nextLine(); //clears scanner
		}
		
		while (height == -99.9f)
		{
			System.out.print("Enter your Height: ");
			if (in.hasNextFloat())
				height = in.nextFloat();
			in.nextLine(); //clears scanner
		}
		
		in.close();
		
		System.out.print("Name: " + name + " Age: " + age + " Height: " + height);
	}

}
