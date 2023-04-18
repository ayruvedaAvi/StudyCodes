import javax.swing.*;
import java.awt.event.*;

public class OptionExit extends WindowAdapter {
    JFrame f;
    public OptionExit(){
        f=new JFrame("example");
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(this);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e){
        int a=JOptionPane.showConfirmDialog(f, "Are you sure?");
        if(a==JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String [] args){
        new OptionExit();
    }
}
