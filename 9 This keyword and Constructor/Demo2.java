// program showing the concept of class and object

import java.util.Scanner;
class Demo2{
    int a,b; // instance variable
    void setData(int a1,int b1){
        a = a1;
        b = b1;
    }
    void add(){
        System.out.println("Add : "+(a+b));
    }
    void sub(){
        System.out.println("Sub : "+(a-b));
    }
    void mul(){
        System.out.println("Mul : "+(a*b));
    }
    void div(){
        System.out.println("Div : "+(a/b));
    }
    void mod(){
        System.out.println("Mod : "+(a%b));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        Demo2 obj = new Demo2();
        obj.setData(c,d);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();       
    }
}