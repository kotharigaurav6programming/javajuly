// program showing the concept of constructor
// copy constructor

import java.util.Scanner;
class Demo14{
    int rno;
    double per;
    String name;
    Demo14(){}
    Demo14(int rno,double per,String name){
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

        Demo14 obj = new Demo14(rno,per,name);
        obj.display();

        System.out.println("\nAfter Copying : \n");
        Demo14 obj1 = new Demo14();
        obj1.rno = obj.rno; 
        obj1.per = obj.per;
        obj1.name = obj.name;
        obj1.display();
    }
}


