// program to find out area of circle

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius : ");
        float r = sc.nextFloat();

        float area = 3.14f * r * r;
        System.out.println("Area of circle : "+area);
    }
}