package week13; 

import java.util.Scanner;

public class Decorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		float hourlyRate, unitPrice;
		int area, time;
		
		System.out.println("Please enter hourly rate: ");
		hourlyRate = input.nextFloat();
		
		System.out.println("Please enter room's area: ");
		area = input.nextInt();
		
		System.out.println("Please enter room's unit cost: ");
		unitPrice = input.nextFloat();
		
		System.out.println("Please enter room's decorating time: ");
		time = input.nextInt();
		
		//Room myRoom = new Room(area, unitPrice, time);
		Room myRoom = new TiledRoom(area, unitPrice, time, area);
		Job myJob = new Job(hourlyRate, myRoom);
		
		float cost = myJob.calculateCost();
		
		System.out.println("The job will cost: " + cost);
		
		
	}

}
