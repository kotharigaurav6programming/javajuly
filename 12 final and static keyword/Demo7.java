// program showing the concept of static data member and static member function

import java.util.Scanner;
class Demo7{
    int rno;
    static String cname;
    static void getCname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name : ");
        cname = sc.nextLine();
    }
    Demo7(int rno){
        this.rno=rno;
    }
    void display(){
        System.out.println("Roll number : "+rno+"\tcollege name : "+cname);
    }
    public static void main(String args[]){
        getCname();
        Demo7 obj1 = new Demo7(101);
        obj1.display();
        Demo7 obj2 = new Demo7(102);
        obj2.display();
        Demo7 obj3 = new Demo7(103);
        obj3.display();
        Demo7 obj4 = new Demo7(104);
        obj4.display();
        Demo7 obj5 = new Demo7(105);
        obj5.display();     
    }
}
