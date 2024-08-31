// program showing the concept of static block

class Demo4{
    static{
        System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("main method");
    }
    static{
        System.out.println("statement 2");
    }
}
