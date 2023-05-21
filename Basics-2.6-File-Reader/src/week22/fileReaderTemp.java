package week22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReaderTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = null;
		
		try 
		{
			in = new Scanner(new File(args[0])); //open the first arg passed to application as file
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Cannot open input file");
		}
		
		if (in != null) 
		{
			// read file...
			System.out.println("Worked!!");
			float minSensor1 = 99999.99f;
			float maxSensor1 = -99999.99f;
			float nextReading;
			//read first line to "sensor1"
			
			for (int i = 0; i < 3; i++)
			{
				in.next(); //read and forget next word
				nextReading = in.nextFloat(); //read in sensor1 reading
				if (nextReading < minSensor1)
				{
					minSensor1 = nextReading;
				}
				if (nextReading > maxSensor1)
				{
					maxSensor1 = nextReading;
				}
					
				System.out.println(in.next());
				
			}
			
			in.close();
		}

	}
}
