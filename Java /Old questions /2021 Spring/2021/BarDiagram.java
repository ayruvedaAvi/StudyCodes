import java.awt.*;
import javax.swing.*;

public class BarDiagram extends JFrame{
    //data is given in question
    final int [] data = {20,35,30,15};
    // total is also given in question; or else you could write a method to calculate the total
    final int total = 100;

    public BarDiagram(){
        setTitle("Bar Diagram");
        setSize(400, 500);
        setVisible(true);
    }
    public int getMax(){
        int max = 0;
        for(int d : data ){
            if(d > max){
                max = d;
            }
        }
        return max;
    }
    public int [] transformData(){
        int [] transformedData = new int[data.length];
        for(int i = 0; i < data.length; i++){
            transformedData[i] = Math.round(data[i] * 400/getMax());
        }
        return transformedData;
    }
    
    public void paint(Graphics g ){
        int barWidth = 30;
        Color [] colors = {Color.PINK, Color.RED, Color.BLACK, Color.BLUE};
        int [] dataToPlot = transformData();
        for(int i=0; i < dataToPlot.length; i++){
            g.setColor(colors[i]);
            g.fillRect(i * barWidth, 500 - dataToPlot[i], barWidth, dataToPlot[i]);
        }
    }

    public static void main(String [] args ){
        new BarDiagram();
    }
}
