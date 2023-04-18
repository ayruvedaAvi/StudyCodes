import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.awt.event.*;
public class DrawImage extends JFrame implements MouseMotionListener, ActionListener{
    BufferedImage image; 
    JButton save; 
    Graphics g ;
    public DrawImage(){
        setSize(400,500);
        save = new JButton("Save");
        add(save, BorderLayout.SOUTH);
        setVisible(true);
        addMouseMotionListener(this);
        save.addActionListener(this);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e ){
        image = new BufferedImage(300,200, BufferedImage.TYPE_INT_RGB);
        g = image.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 10,10);

    }
    public void mouseMoved(MouseEvent e){}


    // public void paint(Graphics g){
    //     g.drawImage(image, 0, 0, null);
    // }
    public void actionPerformed(ActionEvent e){
        try{
            ImageIO.write(image, "png",new File("myimage.png"));
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String [] args ){
        new DrawImage();
    }
}
