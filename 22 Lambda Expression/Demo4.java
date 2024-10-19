// Program showing the concept of Lambda Expression

import java.util.Scanner;
@FunctionalInterface
interface Showable{
    int display(int a,int b);
}
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = (int a1,int b1)->{
            return a1+b1;
        };
        System.out.println("Sum : "+obj.display(a,b));
    }
}