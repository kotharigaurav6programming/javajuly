// program showing the concept of String

class Demo3{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        
        String s4 = new String("Hello");
        String s5 = new String("hello");
        String s6 = new String("HELLO");
        String s7 = new String("HELLO");
        
        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s2.equals(s3) : "+s2.equals(s3));
        System.out.println("s1.equals(s3) : "+s1.equals(s3));

        System.out.println("s1.equals(s4) : "+s1.equals(s4));
        System.out.println("s1.equals(s5) : "+s1.equals(s5));
        System.out.println("s5.equals(s6) : "+s5.equals(s6));
        System.out.println("s6.equals(s7) : "+s6.equals(s7));

        // System.out.println("s1.equalsIgnoreCase(s2) : "+s1.equalsIgnoreCase(s2));
        // System.out.println("s2.equalsIgnoreCase(s3) : "+s2.equalsIgnoreCase(s3));
        // System.out.println("s1.equalsIgnoreCase(s3) : "+s1.equalsIgnoreCase(s3));

    }
}