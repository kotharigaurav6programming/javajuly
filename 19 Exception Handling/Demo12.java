// program showing the concept of Exception handling

import java.util.*;
class Demo12{
    public static void main(String args[]){
      int invalid=0,valid=0;
      for(int i=0;i<args.length;i++){
        try{
            Integer.parseInt(args[i]);
            valid++;
        }catch(NumberFormatException e){
            invalid++;
        }
      }
      System.out.println("Valid : "+valid);
      System.out.println("Invalid : "+invalid);
    }
}