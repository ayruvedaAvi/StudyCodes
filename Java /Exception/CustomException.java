//Creating a custom exception
import java.util.Scanner;
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
class CustomException{
    static Scanner scan=new Scanner(System.in);
    public static void main(String []args){
        try{
            int num;
            System.out.println("Input an even number: ");
            num = scan.nextInt();
            if(num%2!=0){
                throw new MyException("Please enter an even number!");
            }
            else{
                System.out.println("Thankyou for entering an even number lol");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}