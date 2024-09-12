// program showing the concept of Upcasting and downcasting

class Parent{
    void demo(){
        System.out.println("demo method called of parent");
    }
}
class Child extends Parent{
    void demo(){
        System.out.println("demo method called of child");
    }
}
class Demo1{
  public static void main(String args[]){
    Parent cobj = new Child(); // upcasting
    cobj.demo();
  }   
}