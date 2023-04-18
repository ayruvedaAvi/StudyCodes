import java.awt.*;
import java.awt.event.*;

class DisplayPU implements ActionListener{
    TextField t;
    Button b;
    Frame f;
    public DisplayPU(){
        f=new Frame("Example");
        f.setSize(400,400);
        t = new TextField("Pokhara University");
        t.setBounds(100,100,90,90);
        b=new Button("Click me");
        b.setBounds(100,300,90,90);
        f.add(t);
        f.add(b);
        b.addActionListener(this);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        Font font= new Font("Arial",Font.BOLD,24);
        t.setFont(font);
        t.setText(t.getText());
        f.setBackground(Color.CYAN);
    }
    public static void main(String [] args){
        new DisplayPU();
    }
}