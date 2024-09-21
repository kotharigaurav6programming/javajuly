// program showing the concept of interface


interface Drawable{
    int age=18;
    void getAge();
}
class Demo{
    void display(){
        System.out.println("display method called");
    }
}
class GetAge extends Demo implements Drawable{
    @Override
    public void getAge(){
        System.out.println("Age : "+age);
    }
}
class Demo7{
    public static void main(String args[]){
        Drawable obj = new GetAge();
        obj.getAge();
        new GetAge().display();
    }
}