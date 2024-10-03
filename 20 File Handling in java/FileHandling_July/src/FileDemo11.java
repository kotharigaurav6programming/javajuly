// program showing the concept of file handling in java

import java.io.*;
public class FileDemo11 {
    public static void main(String[] args) {
        
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");

        try(FileReader fr = new FileReader(file);){
            while(true){
                int x = fr.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
