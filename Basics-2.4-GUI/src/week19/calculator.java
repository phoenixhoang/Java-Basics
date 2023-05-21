package week19;

import javax.swing.*;
import java.awt.event.*; //event - e.g. button click

class calcPanel extends JPanel implements ActionListener //inheritance and listens for events
{
	//members - controls that will appear on the GUI
    JLabel resultLabel;  //label for text
    JTextField num1Field, num2Field; //text box for text entry

    JButton multiplyButton; //button to click
    JButton plusButton;
    JButton divideButton;
    JButton minusButton;

    calcPanel() //constructor
    {
        resultLabel = new JLabel(""); //create memory for the control
        
        num1Field = new JTextField(5);
        num2Field = new JTextField(5);

        multiplyButton = new JButton("x");
        multiplyButton.addActionListener(this); //associate event with the control
        
        plusButton = new JButton("+");
        plusButton.addActionListener(this);
        
        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        
        minusButton = new JButton("-");
        minusButton.addActionListener(this);
        
        //add to panel so they appear
        add(num1Field);
        add(num2Field);
        add(multiplyButton);
        add(plusButton);
        add(divideButton);
        add(minusButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent event) //event handler
    {
    	float num1 = Integer.parseInt(num1Field.getText());
        float num2 = Integer.parseInt(num2Field.getText());
        float result = 0;
        
        if (event.getSource() == multiplyButton)
        {
            result = (num1 * num2);
            
            resultLabel.setText("Result: "+ result);
        }
        else if ( event.getSource() == plusButton )
        {
            result = (num1 + num2);
            		
            resultLabel.setText("Result: "+ result);
        }
        else if ( event.getSource() == divideButton )
        {
            result = (num1 / num2);
            		
            resultLabel.setText("Result: "+ result);
        }
        else if ( event.getSource() == minusButton )
        {
            result = (num1 - num2);
            		
            resultLabel.setText("Result: "+ result);
        }
    }
}

public class calculator
{
    public static void main( String args[] )
    {
    	//create an instance of JFrame - a swing window
        JFrame f = new JFrame("calculator");
        f.setSize( 300, 200 );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // add an instance of MyPanel
        f.add( new calcPanel() ); //add out panel to this frame

        f.setVisible( true );
    }
}