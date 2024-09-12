// program showing the concept of method overriding

class RBI{
    double rate(){
        return 1.0;
    }
}
class BOI extends RBI{
    double rate(){
        return 2.34;
    }
}
class SBI extends RBI{
    double rate(){
        return 6.67;
    }
}
class PNB extends RBI{}

class Demo4{
    public static void main(String args[]){
       BOI b = new BOI();
       SBI s = new SBI();
       PNB p = new PNB();

        System.out.println("rate by boi : "+b.rate());
        System.out.println("rate by sbi : "+s.rate());
        System.out.println("rate by pnb : "+p.rate());
    }
}