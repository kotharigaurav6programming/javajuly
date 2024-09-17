// program showing the concept of String

class Demo7{
    public static void main(String args[]){
        String s1 = new String("Hello").intern();
        String s2 = new String("Hello").intern();
       
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        
        System.out.println("s1 == s2 : "+(s1==s2));
        
    }
}