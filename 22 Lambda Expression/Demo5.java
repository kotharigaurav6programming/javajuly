// Program showing the concept of Lambda Expression

import java.util.Scanner;
@FunctionalInterface
interface Showable{
    int display(int a,int b);
}
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = (a1,b1)->(a1+b1);
        System.out.println("Sum : "+obj.display(a,b));

        Showable obj1 = (a1,b1)->(a1-b1);
        System.out.println("Sub : "+obj1.display(a,b));
    }
}