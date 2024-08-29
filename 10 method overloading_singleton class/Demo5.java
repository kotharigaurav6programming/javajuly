// proram showing the concept of varargs (variable argument)

class Demo5{
    void test(int...arr){
        System.out.println("arr length : "+arr.length);
        for(int element : arr){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.test(12,23);
        obj.test(12,23,45);
        obj.test(12,23,67,78);
    }
}

