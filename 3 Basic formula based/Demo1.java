// program to find out simple interest

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter p, r and t : ");
        int p = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();

        double si = (p*r*t)/100;
        System.out.println("Simple interest : "+si);
    }
}