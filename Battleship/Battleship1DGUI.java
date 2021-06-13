import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * Write a description of class Battleship1DGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship1DGUI implements ActionListener{
    Battleship1DBoard board = new Battleship1DBoard(7);
    JFrame frame = new JFrame();
    JButton[] buttons = new JButton[7];
    JPanel panel = new JPanel();
    JLabel textfield = new JLabel();
    JPanel title_panel = new JPanel();
    int guessCount = 0;
    int killCount = 0;
    Battleship1DGUI(){
        board.randomPlaceShip(2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,300);
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.blue);
        panel.setLayout(new GridLayout(1,7,0,0));//row coll spacing spacing
        frame.add(panel);
        for(int i=0;i<7;i++) {
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.blue);
            panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        textfield.setBackground(Color.blue);
        textfield.setForeground(Color.white);
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Battleship");
        textfield.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,300);
        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {    
        for(int i=0;i<7;i++) {
            if(e.getSource()==buttons[i]) {
                buttons[i].setEnabled(false);
                buttons[i].setForeground(Color.blue);
                guessCount++;
                int success = board.shoot(i);
                if (success == 0){
                    buttons[i].setText("O");
                } else if (success == 1){
                    buttons[i].setText("X");
                } else if (success == 2){
                    buttons[i].setText("+");
                    killCount++;
                } else {
                    buttons[i].setText("NA");
                }
                check();
            }
        }            
    }
    public void check(){
        if (killCount == 1){
            win();
        }
    }
    public void win(){
        String returnS = "You win!! Score = ";
        returnS += (int)(100*(2/(double)guessCount));
        returnS += " points.";
        for(int i=0;i<7;i++) {
            buttons[i].setBackground(Color.gray);
            buttons[i].setEnabled(false);
        }
        panel.setBackground(Color.gray);
        textfield.setBackground(Color.gray);
        textfield.setForeground(Color.red);
        textfield.setText(returnS);
    }
}

