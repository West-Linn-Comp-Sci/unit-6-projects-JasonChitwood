import javax.swing.*;
/**
 * Write a description of class GFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GFrame extends JFrame
{
    GPanel panel;
    GFrame(){
        panel = new GPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);//where frame pops up (Middle)
        this.setVisible(true);
    }
}
