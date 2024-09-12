// program showing the concept of Object class 

class Product{
    int pid;
    String name;
    double price;
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return pid+" "+price+" "+name;
    }
}
class Demo4{
    public static void main(String args[]){
        Product pobj = new Product(123,"Soap",678.67);
        System.out.println("Product Details : "+pobj);
        System.out.println("Product Details : "+pobj.toString());
    }
}
