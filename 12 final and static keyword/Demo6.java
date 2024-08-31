// program showing the concept of static data member and static member function

class MyClass{
    static int b=200;
    static void set(){
        System.out.println("statement 2");
    }
}
class Demo6{
    static int a = 100; 
    int b=400;
    static void get(){
        System.out.println("statement 1");
        Demo6 obj = new Demo6();
          System.out.println("b : "+obj.b);
    }
    public static void main(String args[]){
        System.out.println("value of a : "+Demo6.a);
        System.out.println("value of a : "+a);
        Demo6.get();
        get();

        System.out.println("value of b : "+MyClass.b);
        MyClass.set();
    }
}
