// program showing the concept of file handling in java

import java.io.*;
class Product implements Serializable{
    int pid;
    double price;
    String name;

    Product(int pid,double price,String name){
        this.pid=pid;
        this.price=price;
        this.name=name;
    }
    @Override
    public String toString(){
        return "{ pid : "+pid+" price : "+price+" name : "+name+"}";
    }
}
public class FileDemo9 {
    public static void main(String[] args) {
        
        Product obj = new Product(1000,78.23,"Soap");

        File file = new File("D:\\desktop\\CodingThinker\\Java Batch July\\javajuly\\20 File Handling in java\\FileHandling_July\\myFolder\\myfile.txt");

        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);){
            oout.writeObject(obj);
            System.out.println("Data Inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream oin = new ObjectInputStream(fin);){
            Product pobj = (Product)oin.readObject();
            System.out.println(pobj);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }
}
