// program showing the concept of instanceof operator

class Parent{}
class Test extends Parent{
    void display(){
        System.out.println("Hello user");
    }
}
class Demo3{
  public static void main(String args[]){
    Test obj = new Test();
    if(obj instanceof Test)
        System.out.println("Yes , It's an Instance");
    else
        System.out.println("No , It's not an Instance");

    if(obj instanceof Parent)
        System.out.println("Yes , It's an Instance");
    else
        System.out.println("No , It's not an Instance");

    Parent obj1 = new Parent();
    
    if(obj1 instanceof Parent)
        System.out.println("Yes , It's an Instance");
    else
        System.out.println("No , It's not an Instance");
    
    if(obj1 instanceof Child)
        System.out.println("Yes , It's an Instance");
    else
        System.out.println("No , It's not an Instance");

    Parent obj2 = new Test();
    
    if(obj2 instanceof Parent)
        System.out.println("Yes , It's an Instance");
    else
        System.out.println("No , It's not an Instance");

    Test obj3 = null;
    
    if(obj3 instanceof Test)
        System.out.println("Yes , It's an Instance");
    else
        System.out.println("No , It's not an Instance");

  }   
}