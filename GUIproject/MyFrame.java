import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyFrame extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon grenade;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        
        label = new JLabel();
        //grenade = new ImageIcon("Shockwave_Grenade.png");
        
        label.setBounds(0,0,100,100);
        label.setIcon(grenade);
        label.setBackground(Color.green);
        label.setOpaque(true);
        
        //this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e){
        //invoked when key is typed, uses KeyChar, char output
        switch(e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-10,label.getY());
            break;
            case 'd':label.setLocation(label.getX()+10,label.getY());
            break;
            case 's':label.setLocation(label.getX(),label.getY()+10);
            break;
            case 'w':label.setLocation(label.getX(),label.getY()-10);
            break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        //when physical key is pressed down. Use keyCode int output
        switch(e.getKeyCode()){
            case 37:label.setLocation(label.getX()-10,label.getY());
            break;
            case 39:label.setLocation(label.getX()+10,label.getY());
            break;
            case 40:label.setLocation(label.getX(),label.getY()+10);
            break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
            break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        ///keyReleased called whenever a button(key?) is released
        /*System.out.println("You pressed the key char: " + e.getKeyChar());
        System.out.println("You pressed the key char: " + e.getKeyCode());*/
    }
}
