import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class GPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPanel extends JPanel
{
    GPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D=(Graphics2D) g;
        //g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,500,500);
        g2D.drawRect(0,0,200,100);
        g2D.fillRect(25,25,200,100);
    }
}
