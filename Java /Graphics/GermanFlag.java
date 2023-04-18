import java.awt.*;
import javax.swing.*;

public class GermanFlag extends JFrame{
    public GermanFlag(){
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(30,30,50,20);
        g.setColor(Color.red);
        g.fillRect(30,50,50,20);
        g.setColor(Color.YELLOW);
        g.fillRect(30,70,50,20);
    }
    public static void main(String [] arg){
        new GermanFlag();
    }
}
 
