
public class StringDemo2 {
   public static void main(String[] args) {
       String s1 = "Hello User";
       
       char ch[] = s1.toCharArray();
       for(int i=0;i<ch.length;i++){
           System.out.print("\t"+ch[i]);
       }
       
       System.out.println("");
       
       byte bt[] = s1.getBytes();
       for(int i=0;i<bt.length;i++){
           System.out.print("\t"+bt[i]);
       }
       
       String s2 = "Hello user How are you ? ";
       String words[] = s2.split(" ");
       for(String word : words){
           System.out.println(word);
       }
        
       for(int i=0;i<words.length/2;i++){
           String temp = words[i];
           words[i] = words[words.length-1-i];
           words[words.length-1-i] = temp;
       }
       System.out.println("\nReverse String : ");
       for(String word : words){
           System.out.print(word+"\t");
       }

   }
}
