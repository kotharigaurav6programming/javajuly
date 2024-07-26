// program showing the concept of implicit and explicit type casting

class Demo7{
    public static void main(String args[]){
        int a = 5;
        double b = a;
        System.out.println("implicit type casting : "+b);

        double c = 5;
        int d = (int)c;
        System.out.println("explicit type casting : "+d);
    }
}

