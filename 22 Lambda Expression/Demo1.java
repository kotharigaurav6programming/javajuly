// Program showing the concept of Lambda Expression

@FunctionalInterface
interface Showable{
    void display();
}
class Demo1{
    public static void main(String args[]){
        Showable obj = ()->System.out.println("display method called");
        obj.display();
    }
}