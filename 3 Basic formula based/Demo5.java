// program to swap two numbers using third variable

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt(); 

        System.out.println("Before swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b); 

            int temp = a;
            a=b;
            b=temp; 
            
        System.out.println("After swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b); 

    }
}

