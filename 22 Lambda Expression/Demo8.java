// Program showing the concept of Method Reference  | Reference to static method
import java.util.Scanner;
@FunctionalInterface
interface Showable{
    int display(int a,int b);
}
class Demo8{
    static int result(int a,int b){
        return a+b;
    }
    static int result1(double a,double b){
        return a-b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = Demo8::result;
        System.out.println("Sum : "+obj.display(a,b));

        Showable obj1 = Demo8::result1;
        System.out.println("Sum : "+obj1.display(a,b));
    }
}