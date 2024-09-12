// program showing the concept of Object class 

class Demo5{
    public static void main(String args[]){
        Demo5 obj1 = new Demo5();
        Demo5 obj2 = new Demo5();
        Demo5 obj3 = new Demo5();
        
        System.out.println("obj1 hashcode : "+obj1.hashCode());
        System.out.println("obj2 hashcode : "+obj2.hashCode());
        System.out.println("obj3 hashcode : "+obj3.hashCode());
    }
}
