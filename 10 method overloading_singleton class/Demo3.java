// proram showing the concept of constructor overloading

class Greater{
    Greater(int a,int b){
        int res = (a>b)?a:b;
        System.out.println("Greater number : "+res);
    }
    Greater(double a,double b){
        double res = (a>b)?a:b;
        System.out.println("Greater number : "+res);
    }
    public static void main(String args[]){
        new Greater(23,34);
        new Greater(45.5,6.7);
    }
}