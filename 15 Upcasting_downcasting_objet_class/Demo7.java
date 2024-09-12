// program showing the concept of Object class 

class Demo7{
    public static void main(String args[]){
        // Object obj = new String();
        Object obj = new Demo7();
        Class c = obj.getClass();
        String name = c.getName();
        System.out.println("Name : "+name);
    }
}
