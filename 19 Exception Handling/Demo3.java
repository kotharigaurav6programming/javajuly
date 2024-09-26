// program showing the concept of Exception handling

import java.util.*;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            int c = num1/num2;
            System.out.println("Result : "+c);
        }
        // catch(InputMismatchException e){
        //     //e.printStackTrace();
        //     System.out.println("You are trying to insert different datatype value");
        // }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
         System.out.println("End of program");
        // finally{
        //     System.out.println("End of Program");
        // }

    }
}