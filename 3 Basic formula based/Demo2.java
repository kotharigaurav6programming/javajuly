// program to find out compound interest

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter p, r and t : ");
        int p = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();

        double amt = p*Math.pow(1+r/100,t);
        System.out.println("Amount : "+amt);

        double ci = amt - p;
        System.out.println("Compound Interest : "+ci);
    }
}