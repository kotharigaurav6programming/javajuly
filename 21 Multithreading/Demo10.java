// program showing the concept of InterThread Communication (Cooperation of thread)


class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    synchronized void withDraw(int wamt){
        if(wamt>bal){
            try{
                System.out.println("Withdraw amount is greater..Please Wait..");
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
        System.out.println("Balance : "+bal);
        System.out.println("WithDraw Amount : "+wamt);
        System.out.println("Remaining Balance : "+(bal-wamt));
    }
    synchronized void deposit(int damt){
        bal+=damt;
                System.out.println("Going to deposit..Please Wait..");
                System.out.println("Deposit Completed..!!");
                notify();
    }
}

class Demo10{
    public static void main(String args[]){
        int wamt = 1200;
        int bal = 1000;
        Customer cobj = new Customer(bal);
        new Thread(){
            @Override
            public void run(){
                cobj.withDraw(wamt);
            }
        }.start();
        if(wamt>bal){
            new Thread(){
                @Override
                public void run(){
                    cobj.deposit(2000);
                }
            }.start();
        }
    }
}