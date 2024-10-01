// program showing the concept of Exception handling

import java.util.*;
class Demo13{
    public static void main(String args[]){
        try{
            Object obj = new Integer(100);
            String sobj = (String)obj;
        }catch(ClassCastException e){
            System.out.println("Exception : "+e);
        }
    }
}