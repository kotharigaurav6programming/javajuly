// program showing the concept of static block

public class Demo{
    static{
        System.out.println("class loads");
    }
}
class Demo5{
    static{
       // Demo obj1 = new Demo();
        System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("main method");
       // Demo obj1 = new Demo();
    }
    static{
        System.out.println("statement 2");
    }
}
