// program showing the concept of Deadlock

class Pen{}
class Paper{}

class Demo11{
    public static void main(String args[]){
        Pen pn = new Pen();
        Paper pr = new Paper();

        new Thread(){
            @Override
            public void run(){
                synchronized(pn){
                    System.out.println("Thread 1 uses pen and needs paper");
                try{Thread.sleep(1000);}catch(InterruptedException e){}                
                synchronized(pr){
                    System.out.println("Thread 1 uses paper and needs pen");
                }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                synchronized(pr){
                    System.out.println("Thread 2 uses paper and needs pen");
                try{Thread.sleep(1000);}catch(InterruptedException e){}                
                synchronized(pn){
                    System.out.println("Thread 2 uses pen and needs paper");
                }
                }
            }
        }.start();

    }
}