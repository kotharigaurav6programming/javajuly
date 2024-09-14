// Program showing the concept of abstraction
// example of abstract class

import java.util.Scanner;

abstract class Series{
    abstract void series(int start,int end);
}
class EvenSeries extends Series{
    @Override
    void series(int start,int end){
        System.out.println("--Even Number Series--");
        for(int i=start;i<=end;i++){
            if(i%2==0)
                System.out.print("\t"+i);
        }
    }
}
class OddSeries extends Series{
    @Override
    void series(int start,int end){
        System.out.println("\n--Odd Number Series--");
        for(int i=start;i<=end;i++){
            if(i%2!=0)
                System.out.print("\t"+i);
        }
    }
}

class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final limit : ");
        int initial = sc.nextInt();
        int finalVal = sc.nextInt();
        
        Series obj;
        obj = new EvenSeries();
        obj.series(initial,finalVal);

        obj = new OddSeries();
        obj.series(initial,finalVal);
        
    }
}