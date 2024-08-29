// program showing the concept of Singleton class // Lazy initialization

class Singleton{
    static private Singleton sobj;

    // private constructor
    private Singleton(){}

    // static method
    static Singleton getInstance(){ // userdefined method
        if(sobj==null)
        {
            System.out.println("Before object creation : "+sobj);
                sobj = new Singleton();
            System.out.println("After object creation : "+sobj);
        }
        return sobj;
    }

    // data member
    int a = 100;

    // static member function 
    static void display(){
        System.out.println("display method called : "+sobj);
    }
}
class Demo8{
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