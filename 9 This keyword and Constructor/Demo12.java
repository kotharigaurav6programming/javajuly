// program showing the concept of constructor
// parameterized constructor

import java.util.Scanner;
class Demo12{
    int rno;
    double per;
    String name;
    Demo12(){
        System.out.println("default constructor called");
    }
    Demo12(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;       
        System.out.println("parameterized constructor called");
    }
    void display(){
        System.out.println("RollNumber : "+rno);
        System.out.println("Percentage : "+per+" %");
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno=sc.nextInt();

        System.out.println("Enter percentage : ");
        double per=sc.nextDouble();

        sc.nextLine();
        System.out.println("Enter name : ");
        String name=sc.nextLine();

        Demo12 obj1  = new Demo12();
        Demo12 obj = new Demo12(rno,per,name);
        obj.display();
    }
}