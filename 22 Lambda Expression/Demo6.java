// Program showing the concept of Method Reference  | Reference to Instance method
import java.util.Scanner;
@FunctionalInterface
interface Showable{
    int display(int a,int b);
}
class Demo6{
    int result(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        Showable obj = new Demo6()::result;
        System.out.println("Sum : "+obj.display(a,b));
    }
}