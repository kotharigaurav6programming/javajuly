// program showing the concept of switch control statement

import java.util.Scanner;
class Example{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers : ");
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.println("\n----Select Option----");
         System.out.println("Press + For Addition");
         System.out.println("Press - For Subtraction");
         System.out.println("Press * For Multiplication");
         System.out.println("Press e For Exit");

         System.out.println("\nSelect Choice : ");
         char choice = sc.next().charAt(0);

         switch(choice){
            case '+' : System.out.println("Addition "+(a+b));
                     break;
            case '-' : System.out.println("Subtraction : "+(a-b));
                     break;
            case '*' : System.out.println("Multiplication : "+(a*b));
                     break;
            case 'e' : System.out.println("User Exited");
                     break;
            default : System.out.println("Invalid selection");
                     break;
         }
    }
}