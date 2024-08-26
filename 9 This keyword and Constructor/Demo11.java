// program showing the concept of constructor

import java.util.Scanner;
class Demo11{
    int rno;
    double per;
    String name;
    Demo11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        rno=sc.nextInt();

        System.out.println("Enter percentage : ");
        per=sc.nextDouble();

        sc.nextLine();
        System.out.println("Enter name : ");
        name=sc.nextLine();

        System.out.println("default constructor called");
    }
    void display(){
        System.out.println("RollNumber : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        obj.display();
    }
}