// program showing the concept of Threading

/*
class Demo1{
    public static void main(String args[]){
        System.out.println("Thread : "+Thread.currentThread());
        System.out.println("Thread name : "+Thread.currentThread().getName());
    }
}
*/

class Demo1 extends Thread{
    public void run(){
        System.out.println("Thread : "+Thread.currentThread());
        System.out.println("Thread name : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.start();
    }
}
