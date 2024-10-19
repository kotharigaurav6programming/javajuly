// Program showing the concept of Method Reference  | Reference to static method
import java.util.Scanner;
@FunctionalInterface
interface Showable{
    int display(int a,int b);
}
class Demo7{
    static int result(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = Demo7::result;
        System.out.println("Sum : "+obj.display(a,b));
    }
}