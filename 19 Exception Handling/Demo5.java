// program showing the concept of Exception handling

import java.util.*;
class Demo5{
    void divide(int a,int b){
        try{
             int c = a/b;
             System.out.println("Result : "+c);   
        }catch(Exception e){
            //e.printStackTrace();
        System.out.println("Exception : "+e);
        }
        finally{
            System.out.println("End of Program");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1=0,num2=0;
        Demo5 obj = new Demo5();
        try{
            num1 = sc.nextInt();
            num2 = sc.nextInt();
                    obj.divide(num1,num2);
        }catch(InputMismatchException e){
            System.out.println("Input Mismatch");
        }
        
    }
}