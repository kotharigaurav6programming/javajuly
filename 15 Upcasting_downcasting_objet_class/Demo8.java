// program showing the concept of Object class 

class Demo8{
    
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        System.out.println("hashcode : "+obj.hashCode());
        obj = null;
        System.gc();
        System.out.println("Garbage collector envolves");

    }

    protected void finalize(){
        System.out.println("finalize method called");
    }
}
