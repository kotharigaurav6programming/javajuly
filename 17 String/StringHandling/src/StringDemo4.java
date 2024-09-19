
import java.util.StringTokenizer;
public class StringDemo4 {
   public static void main(String[] args) {
       String s1 = "Hello User How are you ?";
       StringTokenizer st = new StringTokenizer(s1, " ");
       while(st.hasMoreElements()){
           System.out.println(st.nextElement());
       }
   }
}
