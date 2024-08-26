// program showing the concept of constructor

class Demo9{
    Demo9(){
        int rno=100;
        double per=78.89;
        String name="Andrew Anderson";

        System.out.println("default constructor called");
        
        System.out.println("RollNumber : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
    }
}