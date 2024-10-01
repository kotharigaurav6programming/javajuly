// program showing the concept of file handling in java

import java.io.File;
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder");
        if(file.exists())
            System.out.println("Folder already exist");
        else{
         file.mkdir();
            System.out.println("Folder created successfully");
        }
    }
}
