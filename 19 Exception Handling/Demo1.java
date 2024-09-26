// program showing the concept of Exception handling

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try{
            int c = num1/num2;
            System.out.println("Result : "+c);
        }catch(Exception e){
            System.out.println("Exception : "+e);
            System.out.println("Exception : "+e.getMessage());
            System.out.println("You are trying to divide a number by zero");
            e.printStackTrace();
        }
    }
}