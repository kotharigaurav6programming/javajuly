// program showing the concept of method overriding

class Parent{
    void show(){
        System.out.println("It's shape");
    }
}
class Circle extends Parent{
    @Override
    void show(){
        System.out.println("It's circle shape");
    }
}
class Rectangle extends Parent{
    @Override
    void show(){
        System.out.println("It's rectangle shape");
    }
}
class Square extends Parent{}

class Demo2{
    public static void main(String args[]){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
            c.show();
            r.show();
            s.show();
    }
}