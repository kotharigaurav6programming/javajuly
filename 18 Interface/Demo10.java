// program showing the concept of interface

interface Drawable{
    default void display(){
        System.out.println("display method called");
    }
    static void draw(){
        System.out.println("draw method called");
    }
}
class Demo10 implements Drawable{
    public static void main(String args[]){
        Drawable obj = new Demo10();
        obj.display();
        Drawable.draw();
    }
}