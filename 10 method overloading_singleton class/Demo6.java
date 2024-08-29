// proram showing the concept of varargs (variable argument)

class Demo6{
    void test(String name,int...arr){
        System.out.println("arr length : "+arr.length+"\nName : "+name);
        for(int element : arr){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.test("Andrew anderson",12,23);
        obj.test("Andrew anderson",12,23,45);
        obj.test("Andrew anderson",12,23,67,78);
    }
}

