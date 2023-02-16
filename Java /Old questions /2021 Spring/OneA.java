//A program to input array from user and distinguish odd and even numbers.
import java.util.Scanner;

class OneA {
    public static void main(String args[]){
        int num[], odd[], even[];
        int temp;
        num= new int[10];
        odd=new int[10];
        even=new int[10];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter a number.");
            temp=scan.nextInt();
            num[i]=temp;
            if(temp%2==0){
                even[i]=temp;
            }else{
                odd[i]=temp;
            }
        }
        System.out.println(odd[0]);//Just checking if the program works
        scan.close();
    }

}
