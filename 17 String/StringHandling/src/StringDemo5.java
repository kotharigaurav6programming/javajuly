
import java.util.StringJoiner;
public class StringDemo5 {
   public static void main(String[] args) {
       StringJoiner sj = new StringJoiner("-");
       sj.add("Indore");
       sj.add("Dewas");
       sj.add("Bhopal");
       System.out.println(sj);
       
       String s2 = String.join("/", "19","09","2024");
       System.out.println("Today's Date : "+s2);
 
       String s3 = "Andrew";
       String s4 = "Anderson";
       s3.concat(s4);
       System.out.println("s3 : "+s3);
       System.out.println("s3 : "+s3.concat(s4));
   }
}
