// program showing the concept of switch control statement

import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Color : ");
      String color = sc.next();

      switch(color.toLowerCase()){
        // case "RED" :
        // case "Red" : 
        case "red" : System.out.println("It's Red Color");
                    break;
        case "blue" : System.out.println("It's Blue Color");
                    break;
        default : System.out.println("default color");
                    break;
      }
    }
}