// program showing the concept of switch control statement

import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers : ");
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.println("\n----Select Option----");
         System.out.println("Press 1 For Addition");
         System.out.println("Press 2 For Subtraction");
         System.out.println("Press 3 For Multiplication");
         System.out.println("Press 4 For Exit");

         System.out.println("\nSelect Choice : ");
         int choice = sc.nextInt();

         switch(choice){
            case 1 : System.out.println("Addition "+(a+b));
                     break;
            case 2 : System.out.println("Subtraction : "+(a-b));
                     break;
            case 3 : System.out.println("Multiplication : "+(a*b));
                     break;
            case 4 : System.out.println("User Exited");
                     break;
            default : System.out.println("Invalid selection");
                     break;
         }
    }
}