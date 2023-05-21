package week19;

import javax.swing.*;
import java.awt.event.*; //event - e.g. button click

class GreeterPanel extends JPanel implements ActionListener //inheritance and listens for events
{
	//members - controls that will appear on the GUI
    JLabel outLabel;  //label for text
    JTextField inField; //text box for text entry
    JLabel inFieldLabel; 
    JButton greetButton; //button to click
    JButton byeButton; //

    GreeterPanel() //constructor
    {
        outLabel = new JLabel(""); //create memory for the control
        inFieldLabel = new JLabel("Name:");
        inField = new JTextField(20);

        greetButton = new JButton("Greet!");
        greetButton.addActionListener(this); //associate event with the control
        byeButton = new JButton("Bye!");
        byeButton.addActionListener(this);
        
        //add to panel so they appear
        add(inFieldLabel);
        add(inField);
        add(greetButton);
        add(byeButton);
        add(outLabel);
    }

    //
    boolean isAlphabetical( String name )
    {
        boolean allAlphabet = true;
        for ( int i = 0; i < name.length(); i++  )
        {
            char c = name.charAt(i);
            if ( !( (c == ' ') || (c >= 'a' && c <= 'z') || (c >='A' && c <= 'Z')) )
            {
                allAlphabet = false;
                break; //quit the loop early – we’ve seen enough
            }
        }
        return allAlphabet;
    }

    public void actionPerformed(ActionEvent event) //event handler
    {
        if (event.getSource() == greetButton)
        {
            String name = inField.getText();

            if (isAlphabetical(name))
                outLabel.setText("Hello, " + name);
            else
                outLabel.setText("Hello, " + name + ", that's an interesting name");
        }
        else if ( event.getSource() == byeButton )
        {
            String name = inField.getText();

            outLabel.setText("Bye, "+name);
        }
    }
}

public class Greeter
{
    public static void main( String args[] )
    {
    	//create an instance of JFrame - a swing window
        // create an instance of JFrame - a swing window
        JFrame f = new JFrame("Greeter");
        f.setSize( 300, 200 );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // add an instance of MyPanel
        f.add( new GreeterPanel() ); //add out panel to this frame

        f.setVisible( true );
    }
}