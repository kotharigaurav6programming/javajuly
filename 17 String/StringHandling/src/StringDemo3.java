
public class StringDemo3 {
   public static void main(String[] args) {
       String s1 = "Hello User";
       String s2 = "HELLO USER";
       
       System.out.println("replace : "+s1.replace('l', 'L'));
       System.out.println("substring : "+s1.substring(2, 6) );
       System.out.println("contains : "+s1.contains("Welcome"));
       System.out.println("compareTo : "+s1.compareTo(s2));
       System.out.println("compareToIgnoreCase : "+s1.compareToIgnoreCase(s2));
   
   }
}
