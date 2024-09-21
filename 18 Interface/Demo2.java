// program showing the concept of interface

interface Showable{
    void show();
}
interface Drawable{
    void show();
    void display();
}

class Demo2 implements Showable,Drawable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo2();
        obj.show();
        Drawable obj1 = new Demo2();
        obj1.display();
    }
}