// program showing the concept of Hierarchical inheritance

import java.util.Scanner;

class Person{
    String name;
    int age;
    void getPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();

        System.out.println("Enter Age : ");
        age = sc.nextInt();
    }
    void showPerson(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    String course;
    int fees;
    void getStudent(){
        getPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course : ");
        course = sc.nextLine();

        System.out.println("Enter Fees : ");
        fees = sc.nextInt();
    }
    void showStudent(){
        showPerson();
        System.out.println("\nCourse Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    String desig;
    int salary;
    void getEmployee(){
        getPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Designation : ");
        desig = sc.nextLine();

        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void showEmployee(){
        showPerson();
        System.out.println("\nDesignation Name : "+desig);
        System.out.println("Salary : "+salary);
    }
}
class Demo7{
    public static void main(String args[]){
        Student sobj = new Student();
            sobj.getStudent();
        Employee eobj = new Employee();
            eobj.getEmployee();

            sobj.showStudent();
            eobj.showEmployee();
    }
}