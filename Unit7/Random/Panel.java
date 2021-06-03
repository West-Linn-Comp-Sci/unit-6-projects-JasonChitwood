import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Panel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panel
{
    public static void main(String[] args){
        //JPanel == a Gui component that functions as a container to hold other components
        
        ImageIcon icon = new ImageIcon("cowBoy.png");
        
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.LEFT);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(70, 75, 215));
        bluePanel.setBounds(0,0,250,250); //x,y,width,height
        bluePanel.setLayout(new BorderLayout());
        
        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(Color.pink);
        pinkPanel.setBounds(250,0,250,250);
        pinkPanel.setLayout(new BorderLayout());
        pinkPanel.add(label);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setTitle("Big Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        
        frame.add(bluePanel);
        frame.add(pinkPanel);
        frame.add(greenPanel);
    }
}
