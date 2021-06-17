import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * Write a description of class Play2DBattleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship2DGUI implements ActionListener{
    Battleship2DBoard board = new Battleship2DBoard();
    JFrame frame = new JFrame();
    JButton[] buttons = new JButton[49];
    JButton resetButton = new JButton();
    JPanel panel = new JPanel();
    JLabel textfield = new JLabel();
    JPanel title_panel = new JPanel();
    int guessCount = 0;
    int guessPosible = 49;
    int killCount = 0;
    int killPosible = 5;
    int hitsPosible = 19;
    Battleship2DGUI(){
        board.randomPlaceAllShip();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        panel.setPreferredSize(new Dimension(1000,1000));
        panel.setBackground(Color.blue);
        panel.setLayout(new GridLayout(7,7,0,0));
        for(int i=0;i<49;i++) {
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.blue);
            panel.add(buttons[i]);
            buttons[i].setFont(new Font("Roboto",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        frame.add(panel);
        resetButton.setBackground(Color.gray);
        resetButton.setFont(new Font("Roboto",Font.BOLD,60));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setEnabled(false);
        resetButton.setText("Reset");
        textfield.setBackground(Color.blue);
        textfield.setForeground(Color.white);
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setFont(new Font("Roboto",Font.BOLD,80));
        textfield.setText("  Battleship Game  ");
        textfield.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,900,300);
        title_panel.add(textfield,BorderLayout.WEST);
        title_panel.add(resetButton);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int success;
        if(e.getSource()==resetButton){
            Battleship2DGUI game = new Battleship2DGUI();
            frame.dispose();
        }
        for(int i=0;i<49;i++){
            if(i<7){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(0,i);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else if(7 <= i && i < 14){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(1,i-7);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else if(14 <= i && i < 21){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(2,i-14);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else if(21 <= i && i < 28){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(3,i-21);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else if(28 <= i && i < 35){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(4,i-28);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else if(35 <= i && i < 42){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(5,i-35);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else if(42 <= i && i < 49){
                if(e.getSource()==buttons[i]){
                    success = board.shoot(6,i-42);
                    buttons[i].setEnabled(false);
                    guessCount++;
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
            }else{
                check();
            }
        }
    }
    public void check(){
        if (killCount == killPosible){
            win();
        }
        if(guessCount == guessPosible){
            win();
        }
    }
    public void win(){
        resetButton.setEnabled(true);
        resetButton.setBackground(Color.red);
        String returnS = "  You win!! Score = ";
        returnS += (int)((hitsPosible / (double)guessCount)*10);
        returnS += " points  ";
        for(int i=0;i<49;i++) {
            buttons[i].setBackground(Color.gray);
            buttons[i].setEnabled(false);
        }
        panel.setBackground(Color.gray);
        textfield.setBackground(Color.gray);
        textfield.setForeground(Color.red);
        textfield.setFont(new Font("Roboto",Font.BOLD,40));
        textfield.setText(returnS);
    }
}
