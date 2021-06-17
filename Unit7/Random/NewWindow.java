import java.awt.event.*;//unnecesary
import javax.swing.*;
import java.awt.*;
public class NewWindow
{
    JFrame frame1 = new JFrame();
    JLabel label = new JLabel();
    NewWindow(){
        label.setBounds(0,0,100,50);
        
        
        frame1.add(label);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBackground(new Color(100,25,50));
        frame1.setSize(400,400);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
}
