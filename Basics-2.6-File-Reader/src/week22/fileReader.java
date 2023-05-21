package week22;

import java.io.*;
import java.util.Scanner;

public class fileReader {

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
			int numberOfWords = 0;
			int totalLetters = 0;
			String word;
			
			//repeat while words in file to read
			while (in.hasNext())
			{
				//read next word in
				// update word counter
				//get number of letters - update counter
				word = in.next();
				numberOfWords = numberOfWords + 1;
				totalLetters += word.length();
			}
			
			float aveWordLength = (float)totalLetters / (float)numberOfWords;
			System.out.println("Number Words: " + numberOfWords);
			System.out.println("Average Word Length: " + aveWordLength);
			in.close();
		}
		

		
	}

}
