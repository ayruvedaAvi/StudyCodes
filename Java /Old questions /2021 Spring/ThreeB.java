//A program to write data to a file and read from it until the end is achieved.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class ThreeB{
    public static void main(String args[]) throws IOException{
        FileOutputStream fos= new FileOutputStream("Java_Exam.jsp");
        FileInputStream fis= new FileInputStream("Java_Exam.jsp");
        System.out.println("Enter the data to be written.");
        Scanner scan= new Scanner(System.in);
        String data=scan.nextLine();

    }
}