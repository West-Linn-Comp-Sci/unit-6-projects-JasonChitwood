import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class Maze here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maze extends JFrame implements KeyListener{
    JLabel label;
    JLabel labelMaze;
    ImageIcon maze;
    Maze(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(869,406);
        this.setLayout(null);
        this.addKeyListener(this);
        
        labelMaze = new JLabel();
        label = new JLabel();
        maze = new ImageIcon("Maze.jpg");
        
        labelMaze.setBounds(3,-5,879,380);
        labelMaze.setIcon(maze);
        labelMaze.setOpaque(true);
        
        label.setBounds(0,0,10,10);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setLocation(0,300);

        this.add(label);
        this.add(labelMaze);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e){
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
    public void keyReleased(KeyEvent e){//debug
        /*System.out.println("You pressed the key char: " + e.getKeyChar());
        System.out.println("You pressed the key char: " + e.getKeyCode());*/
    }
}
