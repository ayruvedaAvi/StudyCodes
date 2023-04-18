// WAP to write bytes of data to a file ‘Java_Exam.jsp’
// and reading it until the end of the file is obtained, using proper exception handling. 

import java.io.*;

public class WriteRead {
    public static void main(String [] args ){
        try{
            File file = new File("Java_Exam.jsp");
            FileOutputStream fos = new FileOutputStream(file);
            String msg = "This is boring as F ! ";
            // convert the string to array of bytes 
            byte [] byteMsg = msg.getBytes();
            fos.write(byteMsg);
            // close the stream 
            fos.close();
        
        System.out.println("Message written successfully in the file");
        // Now read the same file 
            FileInputStream fis = new FileInputStream("Java_Exam.jsp");
            int content;
            System.out.println("The content of the file is : ");
            while((content = fis.read()) != -1 ){
                System.out.print((char) content);
            }
            fis.close();

        }catch(FileNotFoundException e){
            System.out.println("The specified file in not found");
        }catch(SecurityException e ){
            // this exception is thrown if the file we are trying to read is denied due to security
            System.out.println("Not allowed to read");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
