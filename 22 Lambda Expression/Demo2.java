// Program showing the concept of Lambda Expression

import java.util.Scanner;
@FunctionalInterface
interface Showable{
    void display(int a,int b);
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Showable obj = (int a1,int b1)->System.out.println("Sum : "+(a1+b1));
        obj.display(a,b);
    }
}