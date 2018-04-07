
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample implements ActionListener
{
    int count = 0;
    JFrame f;
    JTextField tf;
    JButton b;
    
    void test()
    {
        f = new JFrame("Button Example");
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        
        b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

       public void actionPerformed(ActionEvent e) 
    {
        tf.setText(Integer.toString(count));
        count++;
    }
    
    public static void main(String[] args) 
    {
        ButtonExample o1 = new ButtonExample();
        o1.test();
    }
}
