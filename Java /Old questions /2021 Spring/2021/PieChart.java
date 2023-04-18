import java.awt.*;
import javax.swing.*;

public class PieChart extends JFrame{
    // data will be given in the question or you can assume
    final int [] data = { 100,200,50};
    public PieChart(){
        setSize(400,300);
        setVisible(true);
    }

    public int getTotal (){
        int total = 0;
        for(int i : data ){
            total = total + i;
        }
        return total;
    }
    public int [] getAngles(){
        int [] angles = new int[data.length];
        for(int i =0; i < data.length; i++){
            angles[i] = Math.round(data[i] * 360/getTotal());
        }
        return angles;
    }

    public void paint(Graphics g){
        Color colors[] = {Color.RED, Color.GREEN, Color.BLUE};
        int [] angles = getAngles();
        int startAngle = 0;
        for(int i = 0; i < angles.length; i++){
            g.setColor(colors[i]);
            g.fillArc(200,150,100,100,startAngle, angles[i]);
            startAngle = startAngle + angles[i];
        }
    }
    public static void main(String [] args){
         new PieChart();
    }
}