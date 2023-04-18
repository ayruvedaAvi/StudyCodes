import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
public class DigitalWatch extends JFrame{
    JLabel label; // we will use label to display the time 
    
    public DigitalWatch(){
        setSize(200,100);
        label = new JLabel();
        // set the background of the frame to Black 
        label.setBackground(Color.BLACK);
        // set opaque must be true or else the label background wont change
        label.setOpaque(true);
        // set the font of the time to your choice 
        Font font = new Font("Arial",Font.PLAIN, 28);
        label.setFont(font);
        // Set the color of the text to green
        label.setForeground(Color.GREEN);
        add(label);
        setVisible(true);
        showTime();

    }

    public void showTime(){
        // infinite loop is necessary so that we can get the real time
        while(true){

            // This method will set the time to the label
            Calendar cal = Calendar.getInstance();
            // SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
            // For 24 hr time 
            SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
            // to show AM/PM
            // SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss a");
            String time = fmt.format(cal.getTime()); 
            System.out.println(time);
            // set the time to the label
            label.setText(time);
            try{
                // this is done so that the loop is executed just once a sec
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String [] args ){
        new DigitalWatch();
    }
    
}
