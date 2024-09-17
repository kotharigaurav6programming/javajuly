// program showing the concept of String

class Demo5{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        
        String s4 = new String("Hello");
        String s5 = new String("hello");
        String s6 = new String("HELLO");
        String s7 = new String("HELLO");
        
        System.out.println("s1.compareTo(s2) : "+s1.compareTo(s2));
        System.out.println("s2.compareTo(s3) : "+s2.compareTo(s3));
        System.out.println("s1.compareTo(s3) : "+s1.compareTo(s3));

        System.out.println("s1.compareTo(s4) : "+s1.compareTo(s4));
        System.out.println("s1.compareTo(s5) : "+s1.compareTo(s5));
        System.out.println("s5.compareTo(s6) : "+s5.compareTo(s6));
        System.out.println("s6.compareTo(s7) : "+s6.compareTo(s7));

    }
}