// program showing the concept of Singleton class // Eager initialization

class Singleton{
    static private Singleton sobj = new Singleton();

    // private constructor
    private Singleton(){}

    // static method
    static Singleton getInstance(){ // userdefined method
        return sobj;
    }

    // data member
    int a = 100;

    // static member function 
    static void display(){
        System.out.println("display method called : "+sobj);
    }
}
class Demo7{
    public static void main(String args[]){
       Singleton.display();

       Singleton instance1 = Singleton.getInstance();
       System.out.println("value of a : "+instance1.a);
       instance1.a+=100;
       System.out.println("value of a : "+instance1.a);
       
       Singleton instance2 = Singleton.getInstance();
       System.out.println("value of a : "+instance2.a);
       
    }
}