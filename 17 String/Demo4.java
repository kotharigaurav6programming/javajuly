// program showing the concept of String

class Demo4{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        
        String s4 = new String("Hello");
        String s5 = new String("hello");
        String s6 = new String("HELLO");
        String s7 = new String("HELLO");
        
        System.out.println("s1==s2 : "+(s1==s2));
        System.out.println("s2==s3 : "+(s2==s3));
        System.out.println("s1==s3 : "+(s1==s3));

        System.out.println("s1==s4 : "+(s1==s4));
        System.out.println("s1==s5 : "+(s1==s5));
        System.out.println("s5==s6 : "+(s5==s6));
        System.out.println("s6==s7 : "+(s6==s7));

    }
}