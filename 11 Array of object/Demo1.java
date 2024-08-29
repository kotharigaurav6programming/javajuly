// program showing the concept of array of object

class Product{
    int pid;
    double price;
    String name;

    Product(int pid,double price,String name){
        this.pid=pid;
        this.price=price;
        this.name=name;
    }
}
class Demo1{
    public static void main(String args[]){
        Product pobj[] = new Product[2];
        System.out.println("pobj[0] : "+pobj[0]);       
        System.out.println("pobj[1] : "+pobj[1]);       

        pobj[0] = new Product(1111,456.66,"Soap");
        pobj[1] = new Product(1112,226.66,"Fairness cream");

        for(Product p : pobj){
            System.out.println("\nProduct Id : "+p.pid);
            System.out.println("Product price : "+p.price);
            System.out.println("Product name : "+p.name);
        }
    }
}