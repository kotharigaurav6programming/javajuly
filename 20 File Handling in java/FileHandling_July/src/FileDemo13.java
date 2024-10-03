// program showing the concept of file handling in java

import java.io.*;
public class FileDemo13 {
    public static void main(String[] args) {
        
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");

        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);){
            while(true){
                String x = br.readLine();
                if(x==null)
                    break;
                System.out.println(x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
