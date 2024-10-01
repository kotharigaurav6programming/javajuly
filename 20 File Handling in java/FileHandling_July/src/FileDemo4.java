// program showing the concept of file handling in java

import java.io.*;
import java.util.Scanner;
public class FileDemo4 {
    public static void main(String[] args) {
        
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content : ");
        String content = sc.nextLine();
            
        try(FileOutputStream fout = new FileOutputStream(file,true)){
            byte bt[] = content.getBytes();
            fout.write(bt);
            fout.close();
            System.out.println("Data Inserted Successfully");
            
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
