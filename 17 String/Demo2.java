// program showing the concept of String

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name : ");
        // String name = sc.next();
        String name = sc.nextLine();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}