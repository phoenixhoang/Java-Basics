package week10;

import java.util.Scanner;

public class SumOfProductDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int sum;
		int product;
		int difference;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		num1 = in.nextInt();
		
		System.out.print("Enter a Number: ");
		num2 = in.nextInt();
		
		sum = num1 + num2;
		product = num1 * num2;
		
		if (sum > product)
		{
			difference = sum - product;
		}
		else
		{
			difference = product - sum;
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Difference of Sum and Product: " + difference);
	}

}
