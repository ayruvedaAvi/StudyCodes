import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton b;
    JTextField t;
    JPasswordField p;
    JLabel l;
    public Login(){
        setSize(1500,900);
        t = new JTextField();
        
        p = new JPasswordField();
        
        b = new JButton("LOGIN");
        
        add(t);
        add(p);
        add(b);

        setVisible(true);
        setLayout(new GridLayout());
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String username=t.getText();
        String password=String.valueOf(p.getPassword());
        System.out.println(username);
        if(username.equals("ncit")&& password.equals("123")){
//            showDashBoard(username);
            System.out.println("on dashboard");
        }
        else{
            JOptionPane.showMessageDialog(null, "invalid", "login",JOptionPane.ERROR_MESSAGE);
        }
    }
//    public void showDashBoard(String name){
//        ff=new JFrame();
//        f.setSize(200,300);
//        l=new JLabel(name);
//        f.add(l);
//        f.dispose();
//
//    }
    public static void main(String[]args){
        new Login();
    }
}