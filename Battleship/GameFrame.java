import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame implements ActionListener{
    Battleship1DGUI game;
    JButton resetButton;
    GameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLayout(null);
        
        resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setSize(100,50);
        resetButton.setLocation(0,200);
        resetButton.addActionListener(this);
        //resetButton.isFocusable(false);
        
        game = new Battleship1DGUI();
        
        this.add(resetButton);
        this.add(game);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == resetButton){
            this.remove(game);
            game = new Battleship1DGUI();
            this.add(game);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}