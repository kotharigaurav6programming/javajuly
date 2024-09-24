// program showing the concept of interface | private method in interface (jdk-9)

interface Drawable{
    private static void printData(){
        System.out.println("statement 1");
        System.out.println("statement 2");
    }
    static void display1(){
        printData();
        System.out.println("display1 method called");
    }
    static void display2(){
        printData();
        System.out.println("display2 method called");
    }

    default void draw(){
        System.out.println("draw method called");
        display1();
        display2();
    }
}
class Demo11 implements Drawable{
    public static void main(String args[]){
        Drawable obj = new Demo11();
        obj.draw();
    }
}