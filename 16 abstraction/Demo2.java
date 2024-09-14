// Program showing the concept of abstraction
// example of abstract class

abstract class Parent{
    abstract void shape(); // abstract method
}
class Circle extends Parent{
    void shape(){
        System.out.println("Circle Shape");
    }
}
class Square extends Parent{
    void shape(){
        System.out.println("Square Shape");
    }
}
class Rectangle extends Parent{
    void shape(){
        System.out.println("Rectangle Shape");
    }
}

class Demo2{
    public static void main(String args[]){
        Parent obj1 = new Circle();
        obj1.shape();
        Parent obj2 = new Rectangle();
        obj2.shape();
        Parent obj3 = new Square();
        obj3.shape();
    }
}