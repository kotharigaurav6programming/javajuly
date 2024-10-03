// program showing the concept of file handling in java

import java.io.*;
public class FileDemo14 {
    public static void main(String[] args) {
        try{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter name : ");
        String name = br.readLine();

        System.out.println("Enter age : ");
        String age = br.readLine();

        System.out.println("Enter age : ");
        int age1 = Integer.parseInt(br.readLine());

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Age1 : "+age1);
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }


    }
}
