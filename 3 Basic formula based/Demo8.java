// program showing the concept of implicit and explicit type casting

class Demo8{
    public static void main(String args[]){
        byte a = 100;
        byte b = 30;
        byte c = (byte)(a+b);
        System.out.println("c : "+c);
        int d = a+b;
        System.out.println("d : "+d);
    }
}

