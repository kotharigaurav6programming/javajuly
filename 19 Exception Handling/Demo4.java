// program showing the concept of Exception handling

import java.util.Scanner;
class Demo4{
    void divide(int a,int b){
        int c = a/b;
            System.out.println("Result : "+c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Demo4 obj = new Demo4();
        try{
            obj.divide(num1,num2);
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("End of Program");
        }
    }
}