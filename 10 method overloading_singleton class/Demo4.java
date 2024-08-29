// proram showing the concept of constructor chaining

class Demo4{
    int rno;
    float per;
    String name;
    Demo4(){
        this(1023);
        System.out.println("Default constructor called");
    }
    Demo4(int rno){
        this(rno,34.45f);
    }
    Demo4(int rno,float per){
        this(rno,per,"Andrew Anderson");
    }
    Demo4(int rno,float per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        display();
    }
    void display(){
        System.out.println("Roll number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        new Demo4();
    }
}

