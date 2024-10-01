// program showing the concept of Exception handling

import java.util.*;
class Demo10{
    public static void main(String args[]){
        int arr[]={11,22,33,44,55};
        String str = "Hello";
        try
        {
            System.out.println("arr[22] : "+arr[22]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
        try
        {
            System.out.println("str.charAt(30) : "+str.charAt(30));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }

    }
}