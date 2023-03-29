
import java.io.*;
class Student implements Serializable{
    String name;
    int roll;
    public Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    public void display(){
        System.out.println("Name= "+this.name+"  Roll= "+this.roll);
    }
}

public class Serialize {
    void serialize() throws IOException, ClassNotFoundException{
        Student s =new Student("Ram",20);
        FileOutputStream fos =new FileOutputStream("example.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();

    }
    void deserialize() throws IOException, ClassNotFoundException{
        FileInputStream fis=new FileInputStream("example.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student st=(Student)ois.readObject();
        st.display();
        ois.close();
        fis.close();
    }
    public static void main(String []args) throws IOException, ClassNotFoundException{
            Serialize s= new Serialize();
            s.serialize();
            s.deserialize();
    }
}
