import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
/**
 * Write a description of class BoardLayout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BordLayout
{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        panel1.setPreferredSize(new Dimension(100,100));
        frame.add(panel1,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.setPreferredSize(new Dimension(100,100));
        frame.add(panel2,BorderLayout.SOUTH);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.green);
        panel3.setPreferredSize(new Dimension(100,100));
        frame.add(panel3,BorderLayout.EAST);
        
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.orange);
        panel4.setPreferredSize(new Dimension(100,100));
        frame.add(panel4,BorderLayout.WEST);
        
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.pink);
        panel5.setPreferredSize(new Dimension(100,100));
        frame.add(panel5,BorderLayout.CENTER);
        panel5.setLayout(new BorderLayout(10,10)); // needed for positioning, dont put dimensions if no lines
        
        //subPanels
        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.black);
        panel6.setPreferredSize(new Dimension(50,50));
        panel5.add(panel6,BorderLayout.NORTH); //adding to panel instead of frame (try for xs and os)
        
        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.darkGray);
        panel7.setPreferredSize(new Dimension(50,50));
        panel5.add(panel7,BorderLayout.SOUTH);
        
        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.gray);
        panel8.setPreferredSize(new Dimension(50,50));
        panel5.add(panel8,BorderLayout.EAST);
        
        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.lightGray);
        panel9.setPreferredSize(new Dimension(50,50));
        panel5.add(panel9,BorderLayout.WEST);
        
        JPanel panel10 = new JPanel();
        panel10.setBackground(Color.white);
        panel10.setPreferredSize(new Dimension(50,50));
        panel5.add(panel10,BorderLayout.CENTER);
    }
}
