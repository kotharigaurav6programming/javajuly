// program showing the concept of this keyword

import java.util.Scanner;
class Demo3{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a = a;
        this.b = b;
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

        Demo3 obj = new Demo3();
        obj.setData(c,d);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();       
    }
}