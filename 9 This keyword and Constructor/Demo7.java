// program showing the concept of call by reference
/*
call by reference : 
a. In call by reference, calling is done by passing object reference.
b. In call by reference, object reference is going to be pass
c. In call by reference, changes made on object reference may reflect on original data.     
*/

import java.util.Scanner;
class Demo7{
    int a,b;
    void swap(Demo7 obj){
        int temp = obj.a;
        obj.a=obj.b;
        obj.b=temp;
      System.out.println("After Swapping in swap : \na : "+obj.a+"\nb : "+obj.b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Demo7 obj = new Demo7();
        System.out.println("Enter two values : ");
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        System.out.println("Before Swapping : \na : "+obj.a+"\nb : "+obj.b);
            obj.swap(obj);
        System.out.println("After Swapping : \na : "+obj.a+"\nb : "+obj.b);
    }
}