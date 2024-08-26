// program showing the concept of constructor

class Demo8{
    Demo8(){
        System.out.println("default constructor called");
    }
    public static void main(String args[]){
        /*
        new Demo8();
        new Demo8();
        new Demo8();
        */
       Demo8 obj = new Demo8(),obj1 = new Demo8(),obj2 = new Demo8();
    }
}