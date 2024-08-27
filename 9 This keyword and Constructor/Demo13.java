// program showing the concept of constructor
// copy constructor

import java.util.Scanner;
class Demo13{
    int rno;
    double per;
    String name;
    Demo13(Demo13 obj){
        rno = obj.rno;
        per = obj.per;
        name = obj.name;
    }
    Demo13(int rno,double per,String name){
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

        Demo13 obj = new Demo13(rno,per,name);
        obj.display();
        System.out.println("\nAfter Copying : \n");
        Demo13 obj1 = new Demo13(obj);
        obj1.display();
    }
}


