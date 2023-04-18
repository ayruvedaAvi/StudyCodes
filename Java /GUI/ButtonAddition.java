
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class ButtonAddition extends JFrame implements ActionListener{
    JButton sum,sub;
    JTextField d1,d2,result;
    public ButtonAddition(){
        setSize(500,500);
        sum=new JButton("+");
        sub=new JButton("-");
        d1=new JTextField();;
        d2= new JTextField();
        result=new JTextField();
        d1.setBounds(10,30,90,90);
        d2.setBounds(100,30,90,90);
        sum.setBounds(10,130,50,50);
        sub.setBounds(100,130,50,50);
        result.setBounds(50,200,70,70);
        add(d1);
        add(d2);
        add(sum);
        add(sub);
        add(result);
        sum.addActionListener(this);
        sub.addActionListener(this);
        setVisible(true);
        result.setEditable(false);
    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(d1.getText());
        int b=Integer.parseInt(d2.getText());
        int result;
        this.result.setBackground(Color.CYAN);
        if(e.getSource()==sum){
            result=a+b;    
        }else{
            result=a-b;
        }
        this.result.setText(" "+result);
    }
    public static void main(String []args ){
        new ButtonAddition();
    }
}
