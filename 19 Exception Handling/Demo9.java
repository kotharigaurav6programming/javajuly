// program showing the concept of Exception handling

import java.util.*;
class Demo9{
    static String str; 
    public static void main(String args[]){
        try
        {
            System.out.println("Length : "+str.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e);
        }
    }
}