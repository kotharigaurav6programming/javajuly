// program showing the conncept of final keyword

class Demo1{
    final int a;
    Demo1(){
        a = 100;
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println("Value of a : "+obj.a);
    }
}