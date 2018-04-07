package javatest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Rahul Ramkumar
 */
public class Action implements ActionListener
{
    JTextField tf;
    
    public Action(JTextField tf)
    {
        this.tf = tf;        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        tf.setText("Welcome to Javatpoint.");
    }
    
    
}
