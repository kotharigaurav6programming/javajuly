// program showing the concept of Upcasting and downcasting & achieving run time polymorphism

class Parent{
    String name = "Andrew Anderson";
    void demo(){
        System.out.println("demo method called of parent");
    }
}
class Child extends Parent{
    String name = "Mathew Math";
    void demo(){
        System.out.println("demo method called of child");
    }
    void show(){
        System.out.println("show method called of child");
    }
}
class Demo2{
  public static void main(String args[]){
    Parent cobj = new Child(); // upcasting
    cobj.demo();
    System.out.println("Parent Name : "+cobj.name);
    Child cobj1 = (Child)cobj;// downcasting
    cobj1.show();
    System.out.println("Child Name : "+cobj1.name);
  }   
}