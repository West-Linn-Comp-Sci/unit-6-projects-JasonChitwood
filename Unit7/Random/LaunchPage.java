import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton myButton = new JButton();
    LaunchPage(){
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myButton.setText("press");
        
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);//dosent let resize of window
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==myButton){
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
