import java.io.*;

public class Read_write {
    public static void main(String[]args){
        try{
            FileInputStream fis =new FileInputStream("student.txt");
            FileOutputStream fos=new FileOutputStream("copy.txt");

            //String str="";
            int i;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
            //System.out.println(str);
            //byte[]b=str.getBytes();
            //fos.write(b);
            fis.close();
            fos.close(); 

        }catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}