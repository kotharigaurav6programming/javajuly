// Basic Program on operator

class Demo6{
    public static void main(String args[]){
       int a = 5, b = 10;
       String res1 = ( a > 5 && b <= 10 ) ? "statement 1" : "statement 2"; 
       System.out.println("Result : "+res1);
       String res2 = ( a > 5 || b <= 10 ) ? "statement 1" : "statement 2"; 
       System.out.println("Result : "+res2);
       System.out.println("!true : "+!true);
       System.out.println("!false : "+!false);
    }
}