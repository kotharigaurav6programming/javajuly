// Program showing the concept of abstraction
// example of abstract class

import java.util.Scanner;
abstract class RBI{ // abstract class
    RBI() { // constructor
        System.out.println("----Welcome to Bank----");
    }

    abstract double rate(); // abstract method
    
    double finalSum(int balance,double rate){ // concrete method
        return balance+balance*rate/100;
    }
}

class SBI extends RBI{
    @Override
    double rate(){
        return 1.23;
    }
}
class BOI extends RBI{
    double rate(){
        return 2.37;
    }
}
class PNB extends RBI{
    double rate(){
        return 1.22;
    }
}
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int balance = sc.nextInt();

        RBI obj;
        obj = new SBI();
        System.out.println("Rate by SBI : "+obj.rate());
        System.out.println("Final amount by SBI : "+obj.finalSum(balance,obj.rate()));

        obj = new BOI();
        System.out.println("Rate by BOI : "+obj.rate());
        System.out.println("Final amount by BOI : "+obj.finalSum(balance,obj.rate()));

        obj = new PNB();
        System.out.println("Rate by PNB : "+obj.rate());
        System.out.println("Final amount by PNB : "+obj.finalSum(balance,obj.rate()));
    }
}