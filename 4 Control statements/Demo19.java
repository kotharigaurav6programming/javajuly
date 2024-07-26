// program showing the concept of switch control statement

import java.util.Scanner;
class Demo19{
    public static void main(String args[]){
        System.out.println("----Select Option----");
        System.out.println("R/r for area of rectangle");
        System.out.println("C/c for area of circle");
        System.out.println("E/e for exit");

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Option : ");
        char choice = sc.next().charAt(0);
                 
        switch(choice){
            case 'R' : 
            case 'r' : System.out.println("Enter length and breadth : ");
                       int l = sc.nextInt();
                       int b = sc.nextInt();
                       System.out.println("Area of rectangle : "+(l*b));
                       break; 

            case 'C' : 
            case 'c' : System.out.println("Enter radius : ");
                       double r = sc.nextDouble();
                       System.out.println("Area of Circle : "+(3.14*r*r));
                       break; 
            
            case 'E' : 
            case 'e' : System.out.println("Thanks for visit");
                       break; 

            default : System.out.println("Invalid selection");
                       break;
        }         
    }
}