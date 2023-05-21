package week19;

import javax.swing.*;
import java.awt.event.*; //event - e.g. button click
import java.util.ArrayList;
import java.util.Scanner;

class doomsdayPanel extends JPanel implements ActionListener //inheritance and listens for events
{
	//members - controls that will appear on the GUI
	static int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int centuryDays[] = {5, 3, 2, 0};
	static int doomsdays[] = {3, 28, 7, 4, 9, 6, 11, 8, 5, 10, 7, 12};

	JLabel resultLabel, dayLabel, monthLabel, yearLabel;
	JTextField dayField, monthField, yearField;
	JButton getDayButton;

    doomsdayPanel() //constructor
    {
   	 resultLabel = new JLabel ("");
   	 dayLabel = new JLabel ("Day");
   	 monthLabel = new JLabel ("Month");
   	 yearLabel = new JLabel ("Year");
   	 dayField = new JTextField(2);
   	 monthField = new JTextField(2);
   	 yearField = new JTextField(4);
   	 getDayButton = new JButton("Get Day");
     getDayButton.addActionListener(this); //associate event with the control
     
    //add to panel so they appear
     add(dayLabel);
     add(dayField);
     add(monthLabel);
     add(monthField);
     add(yearLabel);
     add(yearField);
     add(getDayButton);
   	 add(resultLabel);
    }

    public void actionPerformed(ActionEvent event) //event handler
    {	    	
    	try 
    	{
    		int day = Integer.parseInt(dayField.getText());
        	int month = Integer.parseInt(monthField.getText());
        	int year = Integer.parseInt(yearField.getText());
        	
        	int dayOfWeek = getDayOfWeek(day, month, year);
        	
        	ArrayList<String> daysOfTheWeek = new ArrayList<String>();
        	daysOfTheWeek.add("Sunday");
        	daysOfTheWeek.add("Monday");
        	daysOfTheWeek.add("Tuesday");
        	daysOfTheWeek.add("Wednesday");
        	daysOfTheWeek.add("Thursday");
        	daysOfTheWeek.add("Friday");
        	daysOfTheWeek.add("Saturday");
        	
        	if (dayOfWeek == -1)
    		{
    			resultLabel.setText(day + "/" + month + "/" + year + " is not a Valid Date.");
    		}
        	
        	for (int i = 0; i <= dayOfWeek; i++)
        	{
        		if (i == dayOfWeek)
        		{
        			resultLabel.setText(day + "/" + month + "/" + year + " is a " + daysOfTheWeek.get(i));
        		}
        		else
        		{
        			System.out.print("");
        		}
        	}
    	} 
    	catch (NumberFormatException e) 
    	{
    		resultLabel.setText("Invalid Input");
    	}
    	
       }

    static boolean LeapYear(int year)
    {
       return ((year % 400) != 0) && ((year % 4) == 0);
    }

    static boolean ValidDate(int day, int month, int year)
    {
       if (year < 1583)
           return false; // Gregorian calendar started in 1582
       if (month < 1 || month > 12)
           return false;
       if (day < 1)
           return false;
       if (month == 2)
       {
           if (LeapYear(year))
           {
               if (day > 29)
                   return false;
           } else
           {
               if (day > 28)
                   return false;
           }
       }
       else
       {
           if (day > monthDays[month - 1])
               return false;
       }
       return true;
    }

    public static int getDayOfWeek(int day, int month, int year)
    {
       // Get the day of the week for any Gregorian date using Conway's doomsday algorithm
       // input - calendar day, calendar month (Jan = 1, Feb = 2...), calendar year.
       // return: day of week as 0 (Sun), 1 (Mon) ... 6 (Sat), -1 (invalid date)

       if (!ValidDate(day, month, year))
           return -1;
       // valid date, we are good to go.
       int centuryDay = centuryDays[((year / 100) - 14) % 4];
       boolean isLeapYear = LeapYear(year);

       year = year % 100; // from now on we use year in the century.
       int anchorDay = year / 12 + (year % 12) + (year % 12) / 4;

       int doomsday = doomsdays[month - 1];
       if (isLeapYear && month < 3)
           doomsday++;

       // the +35 ensures a positive number before taking the modulus (and 35%7 = 0)
       return (centuryDay + anchorDay + day - doomsday + 35) % 7;
    }
}

public class Doomsday
{
    public static void main( String args[] )
    {
    	//create an instance of JFrame - a swing window
        JFrame f = new JFrame("Doomsday");
        f.setSize( 300, 200 );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // add an instance of MyPanel
        f.add( new doomsdayPanel() ); //add out panel to this frame

        f.setVisible( true );
    }
}