// program showing the concept of file handling in java

import java.io.*;
public class FileDemo7 {
    public static void main(String[] args) {
        
        File file1 = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile1.txt");

        File file2 = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile2.txt");

        try(FileInputStream fin1 = new FileInputStream(file1);
        FileInputStream fin2 = new FileInputStream(file2);
        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);){
           while(true){
                int x = sin.read();
                if(x==-1)
                    break;
                System.out.print((char)x);                
           } 
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
