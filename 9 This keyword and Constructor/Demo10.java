// program showing the concept of constructor

import java.util.Scanner;
class Demo10{
    Demo10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno=sc.nextInt();

        System.out.println("Enter percentage : ");
        double per=sc.nextDouble();

        sc.nextLine();
        System.out.println("Enter name : ");
        String name=sc.nextLine();

        System.out.println("default constructor called");
        
        System.out.println("RollNumber : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo10 obj = new Demo10();
    }
}