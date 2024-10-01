// program showing the concept of file handling in java

import java.io.*;
import java.util.Scanner;
public class FileDemo6 {
    public static void main(String[] args) {
        
        File file1 = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile1.txt");

        File file2 = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile2.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content : ");
        String content = sc.nextLine();
            
        try(FileOutputStream fout1 = new FileOutputStream(file1);
        FileOutputStream fout2 = new FileOutputStream(file2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();){

            byte bt[] = content.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            // bout.close();
            // fout1.close();
            // fout2.close();
            System.out.println("Data Inserted Successfully");
            
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
