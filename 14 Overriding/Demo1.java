// program showing the concept of method overriding

class Parent
{   
    void display(){
        System.out.println("display method of parent called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        // super.display();
        System.out.println("display method of child called");
    }
}
class Demo1{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}