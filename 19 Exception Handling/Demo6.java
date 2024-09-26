// program showing the concept of Exception handling

import java.util.*;
class Demo6{
    void divide(int a,int b){
        try{
             int c = a/b;
             if(c>=5)
                throw new NullPointerException("Result greater than or equals to 5");
             System.out.println("Result : "+c);   
        }catch(ArithmeticException e){
            //e.printStackTrace();
        System.out.println("Exception : "+e.getMessage());
        }
        catch(NullPointerException e){
            //e.printStackTrace();
        System.out.println("Exception : "+e.getMessage());
        }
        finally{
            System.out.println("End of Program");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1=0,num2=0;
        Demo6 obj = new Demo6();
        try{
            num1 = sc.nextInt();
            num2 = sc.nextInt();
                    obj.divide(num1,num2);
        }catch(InputMismatchException e){
            System.out.println("Input Mismatch");
        }
        
    }
}