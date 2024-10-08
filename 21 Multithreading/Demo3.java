// program showing the concept of Threading

class Demo3 extends Thread{
    public void run(){
       for(int i=0;i<=10;i++){
            System.out.println("i : "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
       }         
    }
    public static void main(String args[]){
        Demo3 obj1 = new Demo3();
        obj1.start();
    }
}
