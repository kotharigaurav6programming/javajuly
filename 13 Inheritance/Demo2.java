// program showing the concept of inheritance

class GrandParent{
    String fname = "John";
}

class Parent extends GrandParent{
    String fname = "Mathew";
    void showParent(){
        System.out.println("GrandParent name : "+super.fname);
    }
}

class Child extends Parent{
    String fname = "Andrew";
    void show(){
        System.out.println("Parent name : "+super.fname);
        System.out.println("Child name : "+fname);
        showParent();
    }
}
class Demo2{
    public static void main(String args[]){
        Child obj = new Child();
        obj.show();
    }
}