
public class StringDemo7 {
   public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello ");
    sb.append("Andrew Anderson");
    System.out.println("append : "+sb);
    
    sb.replace(6, 13, "Mathew ");
    System.out.println("replace : "+sb);

    sb.delete(6, 13);
    System.out.println("delete: "+sb);

    sb.insert(6, "Jackson ");
    System.out.println("insert: "+sb);

    sb.reverse();
    System.out.println("reverse : "+sb);
   }
}
