// program showing the concept of file handling in java

import java.io.File;
import java.io.IOException;
public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");
        try{
        if(file.exists())
            System.out.println("File already exist");
        else{
         file.createNewFile();
         System.out.println("File created successfully");
        }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
