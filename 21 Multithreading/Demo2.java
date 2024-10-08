// program showing the concept of Threading

class Demo2 extends Thread{
    public void run(){
       
        System.out.println("Thread name : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority()+" isAlive Status : "+Thread.currentThread().isAlive());
         
    }
    public static void main(String args[]){
        Demo2 obj1 = new Demo2();
        Demo2 obj2 = new Demo2();
        Demo2 obj3 = new Demo2();

        obj1.setName("Andrew");
        obj2.setName("Mathew");
        obj3.setName("Jackson");

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj3.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        obj2.start();
         try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        obj3.start();

        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        System.out.println("obj1 : "+obj1.isAlive());
        System.out.println("obj2 : "+obj2.isAlive());
        System.out.println("obj3 : "+obj3.isAlive());
    }
}
