// program showing the concept of Thread Synchronization | Synchronized block

class First{
    // shared resources
    void display(String name){
        System.out.print(" [ ");
        try{ Thread.sleep(1000);}catch(InterruptedException e){}
        System.out.print(name);
        try{ Thread.sleep(1000);}catch(InterruptedException e){}
        System.out.println(" ] ");
    }
}
class Second extends Thread{
    First fobj;
    String name;
    Second(First fobj,String name){
        this.fobj=fobj;
        this.name=name;
        start();
    }
    @Override
    public void run(){
        // synchronized block
        synchronized(fobj){
            fobj.display(name);
        }
    }
}
class Demo7 {
    public static void main(String args[]){
        First fobj = new First();
        // creating Threads
        Second s1 = new Second(fobj,"Andrew");        
        Second s2 = new Second(fobj,"Mathew");        
        Second s3 = new Second(fobj,"Jackson");        
    }
}