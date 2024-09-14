// Program showing the concept of abstraction
// example of abstract class

abstract class MyClass{
    abstract void display(); // abstract method
}
class Demo1 extends MyClass{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        // Demo1 obj = new Demo1();
        // obj.display();

        MyClass obj = new Demo1();
        obj.display();
    }
}