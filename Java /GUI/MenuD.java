import java.awt.*;

public class MenuD extends Frame {
    Menu file, sub;
    MenuItem save,copy,paste,exit,java,c;
    MenuBar bar;
    public MenuD(){
        setSize(600,600);
        Menu file=new Menu("File");
        Menu sub=new Menu("Subjects");
        bar= new MenuBar();
        setMenuBar(bar);
        save=new MenuItem("Save");
        file.add(save);
        copy=new MenuItem("Copy");
        file.add(copy);
        paste=new MenuItem("Paste");
        file.add(paste);
        file.addSeparator();
        exit= new MenuItem("Exit");
        file.add(exit);
        java=new MenuItem("JAVA");
        c=new MenuItem("C++");
        sub.add(java);
        sub.add(c);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String [] args){
        new MenuD();
    }
}
