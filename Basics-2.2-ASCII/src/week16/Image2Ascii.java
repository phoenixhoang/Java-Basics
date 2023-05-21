package week16;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Image2Ascii
{
	BufferedImage bImage = null;
	int imageWidth = 0;
	int imageHeight = 0;
	int [] [] array;
	
	void LoadImage(String fileName)
	{
		try //error handling
		{
			bImage = ImageIO.read(new File(fileName));
			imageWidth = bImage.getWidth();
			imageHeight = bImage.getHeight();
			array = new int[imageWidth][imageHeight]; //declare array, columns, rows
			fillArray();
		}
		
		catch (Exception e)
		{
			System.out.println("Could not open image file "+ fileName);
		}
	}
	
	private void fillArray() //accessed from inside this class only
	{
		for (int i = 0; i < imageHeight; i++)
		{
			for(int j = 0; j < imageWidth; j++)
			{
				Color pixel = new Color(bImage.getRGB(j, i));
				int red = pixel.getRed();
				int green = pixel.getGreen();
				int blue = pixel.getBlue();
				int grey = ( red + 2*green + blue ) / 4;
				array[j][i] = grey;
			}
		}
	}
	
	public void Print()
	{
		String ramp = "@%#*+=-:. ";
		int rampIndex;
		char ascii;
		
		for (int i = 0; i < imageHeight; i+=2) //draw every other row
		{
			for(int j = 0; j < imageWidth; j++)
			{
				rampIndex = 10 * array[j][i] / 256;
				ascii = ramp.charAt(rampIndex);	
				System.out.print(ascii);
			} //complete current row
			System.out.println(); //move to new row down and left
		}
	}
	
} //end class