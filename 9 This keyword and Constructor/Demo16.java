// program showing the concept of constructor
// deep copy constructor

class Address{
    String state,country;
    Address(String state,String country){
        this.state=state;
        this.country=country;
    }
    Address(Address a){
        this.state = a.state;
        country = a.country;
    }
}

class Person{
    int pid;
    String name;
    Address address;

    Person(int pid,String name,Address address){
        this.pid=pid;
        this.name=name;
        this.address=address;
    }
    Person(Person p){
        pid = p.pid;
        name = p.name;
        address = new Address(p.address);
    }
    void display(){
        System.out.println("Person Id : "+pid);
        System.out.println("Person Name : "+name);
        System.out.println("Person State : "+address.state);
        System.out.println("Person Country : "+address.country);
    } 
    public static void main(String args[]){
        Address address = new Address("Madhya Pradesh","India");
        Person p1 = new Person(123,"Andrew",address); 
        Person p2 = new Person(p1);

        p2.address.state = "Delhi";
        p2.address.country = "Australia";

        p1.display();
        System.out.println("After Copying : ");
        p2.display();
    }
}
