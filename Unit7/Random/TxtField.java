import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Create a GUI textBox component that can add, set, or get text.
 */
public class TxtField extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
    TxtField(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Submit");
        button.addActionListener(this);
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setText("username");
        
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    //@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Welcome" + textField.getText());
            button.setEnabled(false); //this is important
            textField.setEditable(false);
        }
    }
}
