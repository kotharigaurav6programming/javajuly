// proram showing the concept of method overloading

class Demo2{
    void greater(int a,int b){
        int res = (a>b)?a:b;
        System.out.println("Greater number : "+res);
    }
    void greater(double a,double b){
        double res = (a>b)?a:b;
        System.out.println("Greater number : "+res);
    }
    
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.greater(23,34);
        obj.greater(45.5,6.7);
    }
}