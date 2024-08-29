// proram showing the concept of method overloading

class Demo1{
    void greater(int a,int b){
        int res = (a>b)?a:b;
        System.out.println("Greater number : "+res);
    }
    void greater(int a,int b,int c){
        int res = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Greater number : "+res);
    }
    
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.greater(23,34);
        obj.greater(45,5,67);
    }
}