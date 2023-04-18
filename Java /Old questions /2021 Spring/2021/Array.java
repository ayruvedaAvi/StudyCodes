
// a. Write program to get 10 array elements from user 
// and put even and odd elements in separate array.

import java.util.Scanner;
class Array {
    public static void main(String [] args ){

        Scanner scan = new Scanner(System.in);
        // declare the array size 10; the size it is given in the question
         int [] array = new int[10];
        System.out.println("Enter 10 array elements");
        for(int i = 0; i < 10; i++){
            System.out.println("Enter " + (i +1 )+ " element");
            // initialize the array 
            array[i] = scan.nextInt();
        }
        // Check how  many elements are even in the array 
            int evenCount = 0;
            for(int i: array){
                if(i % 2 == 0 ){
                    evenCount++;
                }
            }
            // Since there are 10 elments; number of odd elements must be (10-evenCount)
            int oddCount = 10 - evenCount;
         // Now declare two more arrays;
         // one to hold even values and another to hold odd values;

         int [] even = new int[evenCount] ;
         int [] odd = new int[oddCount] ;
        

         int x =0; // to hold indexing of the even array
         int y = 0; // to hold indexing of the odd array 
         // check whether the elements in first array is odd or even 
         for(int i =0; i < array.length; i++){
            if(array[i] % 2 == 0 ){
                // since its even put the value in even array
                even[x] = array[i];
                x++;
            }else{
                odd[y] = array[i];
                y++;
            }
         }

         // Print the number of even elements
         System.out.println("Number of even elements = " + even.length);
         // Print the number of odd elements 
         System.out.println("Number of odd elemenst = " + odd.length);

         // Print all elements of even array 
         System.out.println("The array with even elements: ");
         for(int i : even ){
            System.out.print(" " + i + " ");
         }
         System.out.println("");  //just for spacing

         // Print all elements of odd array 
        System.out.println("The array with even elements: ");
        for(int i : odd ){
            System.out.print(" " + i + " ");
        }

        scan.close();

    }
}