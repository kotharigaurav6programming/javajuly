// Program showing the concept of abstraction
// example of abstract class

abstract class RBI{ // abstract class
    abstract double rate(); // abstract method
}

class SBI extends RBI{
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
class Demo3{
    public static void main(String args[]){
        RBI obj;
        obj = new SBI();
        System.out.println("Rate by SBI : "+obj.rate());

        obj = new BOI();
        System.out.println("Rate by BOI : "+obj.rate());

        obj = new PNB();
        System.out.println("Rate by PNB : "+obj.rate());
    }
}