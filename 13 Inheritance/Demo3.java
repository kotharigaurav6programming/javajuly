// program showing the concept of super keyword

class Parent{
    void display(){
        System.out.println("display method called of parent");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("display method called of child");
    }
    void show(){
        super.display();
        display();
    }
}
class Demo3{
    public static void main(String args[]){
        Child obj = new Child();
        obj.show();
    }
}