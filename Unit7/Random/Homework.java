import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Homework here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Homework
{
    public static void main(String[] args){
        ImageIcon icon = new ImageIcon("cowBoy.png");
        
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel tlPanel = new JPanel();
        tlPanel.setBackground(new Color(70, 75, 215));
        tlPanel.setBounds(0,0,750,300); //x,y,width,height
        tlPanel.setLayout(new BorderLayout());
        
        JPanel trPanel = new JPanel();
        trPanel.setBackground(Color.green);
        trPanel.setBounds(750,0,750,300);
        trPanel.setLayout(new BorderLayout());
        
        JPanel mlPanel = new JPanel();
        mlPanel.setBackground(Color.green);
        mlPanel.setBounds(0,300,750,300); //x,y,width,height
        mlPanel.setLayout(new BorderLayout());
        
        JPanel mrPanel = new JPanel();
        mrPanel.setBackground(new Color(70, 75, 215));
        mrPanel.setBounds(750,300,750,300);
        mrPanel.setLayout(new BorderLayout());
        
        JPanel blPanel = new JPanel();
        blPanel.setBackground(Color.red);
        blPanel.setBounds(0,600,500,300); //x,y,width,height
        blPanel.setLayout(new BorderLayout());
        
        JPanel bmPanel = new JPanel();
        bmPanel.setBackground(Color.pink);
        bmPanel.setBounds(500,600,500,300);
        bmPanel.setLayout(new BorderLayout());
        bmPanel.add(label);
        
        JPanel brPanel = new JPanel();
        brPanel.setBackground(Color.yellow);
        brPanel.setBounds(1000,600,500,300);
        brPanel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setTitle("Big Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1500,900);
        frame.setVisible(true);
        
        frame.add(tlPanel);
        frame.add(trPanel);
        frame.add(mlPanel);
        frame.add(mrPanel);
        frame.add(blPanel);
        frame.add(bmPanel);
        frame.add(brPanel);
    }
}
