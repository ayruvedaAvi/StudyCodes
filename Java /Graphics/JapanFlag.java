import java.awt.*;
import javax.swing.JFrame;
class JapanFlag extends JFrame{
    public JapanFlag(){
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g){
        
        g.setColor(Color.WHITE);
        g.fillRect(30,30,80,60);
        g.setColor(Color.red);
        g.fillOval(55,45,30,30);
    }
    public static void main(String []args){
        new JapanFlag();
    }
}
