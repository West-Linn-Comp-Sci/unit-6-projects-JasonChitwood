
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
public class Main
{
    public static void main(String[] args){
        JLayeredPane layPane = new JLayeredPane();
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JPanel panel = new JPanel();
        
        label.setText("Its a big Square ");
        label.setBounds(10, 50, 80, 25);
        panel.add(label);
        panel.setSize(new Dimension(80, 25));
        
        frame.setTitle("Big Square");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        //frame.getContentPane().setBackground(Color.pink);
        //new discord blue 70 75 215,
        frame.getContentPane().setBackground(new Color(70, 75, 215));
        //frame.getContentPane().setBackground(new Color(0x0FF0F0));
    }
}
