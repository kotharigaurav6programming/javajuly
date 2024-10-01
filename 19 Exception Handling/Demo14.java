// program showing the concept of Exception handling

import java.util.*;
class Demo14{
    public static void main(String args[]){
       try{
           Class.forName("Demo19");
           System.out.println("Class found");
       }catch(ClassNotFoundException e){
        System.out.println("Class Not Found");
        System.out.println("Exception : "+e);
       }
    }
}