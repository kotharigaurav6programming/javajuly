/*
    A
    AB
    ABC
    ABCD
    ABCDE
*/

import java.util.Scanner;
class Pattern8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                    System.out.print((char)(64+j));
              }
            System.out.println();
        }
    }
}