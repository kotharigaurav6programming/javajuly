// Program showing the concept of Method Reference  | Reference to Constructor
import java.util.Scanner;
@FunctionalInterface
interface Showable{
    void display(int a,int b);
}
class Demo9{
    Demo9(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = Demo9::new;
        obj.display(a,b);
    }
}