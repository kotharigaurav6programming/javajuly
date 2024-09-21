// program showing the concept of interface

@FunctionalInterface
interface Drawable{
    void show();
}

class Demo4 implements Drawable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Drawable obj = new Demo4();
        obj.show();
    }
}