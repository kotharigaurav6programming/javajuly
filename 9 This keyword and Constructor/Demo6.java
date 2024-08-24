// program showing the concept of call by value
/*
call by value : 
a. In call by value calling is done by passing value.
b. In call by value, copy of original data is going to be pass
c. In call by value, changes made on copied data does not reflect on original data.     
*/

import java.util.Scanner;
class Demo6{
    void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
      System.out.println("After Swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo6 obj = new Demo6();
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
            obj.swap(a,b);
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
}