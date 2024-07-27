// program to count no. of digits

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int count=0;

        while(num>0){
            count++;
            num = num/10;
        }
        System.out.println("Number of digits : "+count);

    }
}
