// program showing the concept of String

class Demo6{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "HELLO";
        // String s3 = s1.toUpperCase();
        String s3 = s1.toUpperCase().intern();

        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        System.out.println("s3 : "+s3);
        
        System.out.println("s1 == s3 : "+(s1==s3));
        System.out.println("s2 == s3 : "+(s2==s3));
        
    }
}