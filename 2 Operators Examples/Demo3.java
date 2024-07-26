// Basic Program on operator

class Demo3{
    public static void main(String args[]){
       int  a = 9, b  = 10,c;
       c = a & b;
       System.out.println(a+" & "+b+" = "+c); 
       c = a | b;
       System.out.println(a+" | "+b+" = "+c); 
       c = a ^ b;
       System.out.println(a+" ^ "+b+" = "+c); 
       c = a << b;
       System.out.println(a+" << "+b+" = "+c); 
       c = a >> b;
       System.out.println(a+" >> "+b+" = "+c); 
       c = ~a;
       System.out.println("~"+a+" = "+c); 
    }
}