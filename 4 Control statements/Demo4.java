// program showing the concept of if else statement

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary and experience : ");
        int salary = sc.nextInt();
        int exp = sc.nextInt();
        
        if(salary>=10000 && exp>=5)
            System.out.println("gets hike");
        else
            System.out.println("not eligible to get hike");
    }
}