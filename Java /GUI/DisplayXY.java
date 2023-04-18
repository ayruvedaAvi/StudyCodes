import javax.swing.*;
import java.awt.event.*;

public class DisplayXY extends MouseAdapter {
    JFrame f;
    JTextField t1,t2;
    public DisplayXY(){
        f=new JFrame();
        f.setSize(400,400);
        t1=new JTextField();
        t2=new JTextField();
        t1.setBounds(100,40,60,60);
        t2.setBounds(100,150,80,80);
        f.add(t1);
        f.add(t2);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void mouseEntered(MouseEvent e){
        this.t1.setText("IN!!");
    }
    public void mouseExited(MouseEvent e){
        this.t1.setText("OUT!!");
    }
    public void mouseMoved(MouseEvent e){
        String cord="X: "+e.getX()+" Y: "+e.getY();
        this.t2.setText(cord);
    }
    
    public static void main(String []args){
        new DisplayXY();
    }
}
