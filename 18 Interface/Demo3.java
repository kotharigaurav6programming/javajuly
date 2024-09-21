// program showing the concept of interface

interface Showable extends Drawable{ 
    void show();
}
interface Drawable{
    void show();
    void display();
}

class Demo3 implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo3();
        obj.show();
        obj.display();
    }
}