// program showing the concept of Threading

class Demo5 implements Runnable{
    public void run(){
        System.out.println("run method executes");
    }
    public static void main(String args[]){
        /*
            Demo5 obj = new Demo5();
            Thread th = new Thread(obj);
            th.start();
        */
        /*
            Thread th = new Thread(new Demo5());
            th.start();
        */
            new Thread(new Demo5()).start();
    }
}