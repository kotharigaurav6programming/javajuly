// program showing the concept of file handling in java

import java.io.*;
public class FileDemo12 {
    public static void main(String[] args) {
        
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");

        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);){
            bw.write("First Line");
            bw.newLine();
            bw.write("Second Line");
            bw.newLine();
            bw.write("Third Line");
            System.out.println("Data Inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
