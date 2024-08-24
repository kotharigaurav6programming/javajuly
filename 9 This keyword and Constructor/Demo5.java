// program showing the concept of this keyword

class Demo5{
    int rno;
    void printData(Demo5 instance){
        System.out.println("printData method called");
        System.out.println("default string representation of object : "+instance);
        System.out.println("Roll number : "+instance.rno);
    }
    void showData(){
        System.out.println("showData method called");
        printData(this); // function calling
        // this is passed as an argument
        System.out.println("Roll number inside showData: "+this.rno);
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.rno = 10001;
        obj.showData();
    }
}