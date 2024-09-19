
public class StringDemo1 {
   public static void main(String[] args) {
       String s1 = "Hello World";
       System.out.println("Length : "+s1.length());
       System.out.println("Uppercase : "+s1.toUpperCase());
       System.out.println("Lowercase : "+s1.toLowerCase());
      
       String s2 = "         Hello World           ";
       System.out.println("s2 : "+s2);
       System.out.println("trim : "+s2.trim());
       
       String s3 = "HELLO WORLD";
       System.out.println("equals : "+s3.equals(s1));
       System.out.println("equalsIgnoreCase : "+s3.equalsIgnoreCase(s1));
  
       String s4 = "HELLO WORLD";
       System.out.println("charAt(2) : "+s4.charAt(2));
       System.out.println("endsWith : "+s4.endsWith("World"));
       System.out.println("endsWith : "+s4.endsWith("WORLD"));
       System.out.println("startsWith : "+s4.startsWith("Hello"));
       System.out.println("startsWith : "+s4.startsWith("HELLO"));
       System.out.println("indexOf('WORLD') : "+s4.indexOf("WORLD"));  
       System.out.println("indexOf('w') : "+s4.indexOf('W'));         
   }
}
