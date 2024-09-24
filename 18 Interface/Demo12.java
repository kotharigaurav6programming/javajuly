// program showing the concept of interface

interface Drawable{
    default void display(){
        System.out.println("display method called of drawable");
    }
}
interface Showable extends Drawable{
    default void display(){
        System.out.println("display method called of showable");
    }
}
class Demo12 implements Showable{
    // public void display(){
    //     System.out.println("display method called");
    // }
    public static void main(String args[]){
        Showable obj = new Demo12();
        obj.display();
    }
}