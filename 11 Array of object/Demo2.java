// program showing the concept of array of object
import java.util.Scanner;
class Product{
    int pid;
    double price;
    String name;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id : ");
        pid = sc.nextInt();
        System.out.println("Enter product price : ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter product name : ");
        name = sc.nextLine();
    }
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num];
        for(int i=0;i<pobj.length;i++){
            pobj[i] = new Product();
            pobj[i].getData();            
        }
        
        for(Product p : pobj){
            System.out.println("\nProduct Id : "+p.pid);
            System.out.println("Product price : "+p.price);
            System.out.println("Product name : "+p.name);
        }
    }
}