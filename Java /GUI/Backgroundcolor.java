import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

class Backgroundcolor {
    JFrame f;
    JButton red,green;
    public Backgroundcolor(){
        f=new JFrame();
        f.setSize(400,500);
        red=new JButton("RED");
        red.setBounds(100,120,80,30);
        green=new JButton("GREEN");
        green.setBounds(300,120,80,30);
        Rang r=new Rang(this);
        f.setVisible(true);
        f.setLayout(null);
        red.addActionListener(r);
        green.addActionListener(r);
        f.add(red,BorderLayout.WEST);f.add(green,BorderLayout.EAST);
    }
    public static void main(String[]args){
        new Backgroundcolor();

}
}
class Rang implements ActionListener{
    Backgroundcolor et ;

    public Rang(Backgroundcolor et){
        this.et=et;
    }
    public void actionPerformed(ActionEvent e){
//        System.out.println("on dashboard");
//        e.getSource()
        if (e.getSource() == et.red) {
            this.et.f.setBackground(Color.RED);
        }
//        this.et.green.setBackground(Color.GREEN);
        this.et.f.setBackground(Color.GREEN);
    }
}