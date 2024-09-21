// program showing the concept of interface

interface Drawable{
    int age=18;
}
interface Showable{
    int age=28;
}

class Demo6 implements Drawable,Showable{
    public static void main(String args[]){
        System.out.println("Drawable age : "+Drawable.age);
        System.out.println("Showable age : "+Showable.age);
    }
}