// program showing the concept of file handling in java

import java.io.*;
public class FileDemo8 {
    public static void main(String[] args) {
        
        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");

        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dout = new DataOutputStream(fout);){
            dout.writeInt(1000);
            dout.writeFloat(456.678f);
            dout.writeUTF("Hello User How are you ? ");
            System.out.println("Data Inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

        try(FileInputStream fin = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fin);){
            System.out.println("Data : "+dis.readInt());
            System.out.println("Data : "+dis.readFloat());
            System.out.println("Data : "+dis.readUTF());
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

    }
}
