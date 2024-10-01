// program showing the concept of Exception handling | Creating User defined exception

import java.util.*;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class Bank{
    int bal;
    int getBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        bal = sc.nextInt();
        return bal;
    }
}
class WithDraw{
    int bal;
    WithDraw(int bal){
        this.bal=bal;
    }
    void withDraw() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount : ");
        int wamt = sc.nextInt();
            if(wamt>bal){
                throw new InsufficientBalanceException("Low Balance");
            }
            else{
                System.out.println("Balance : "+bal);
                System.out.println("WithDraw Amount : "+wamt);
                System.out.println("Remaining Balance : "+(bal-wamt));
            }
    }
}
class Demo16{
    public static void main(String args[]){
        Bank obj = new Bank();
        WithDraw wobj = new WithDraw(obj.getBalance());
        try{    
            wobj.withDraw();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}