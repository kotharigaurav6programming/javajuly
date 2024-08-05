/*
    10987
    654
    32
    1
*/

import java.util.Scanner;
class Pattern10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        int sum=0;
        for(int i=1;i<=row;i++){
            sum = sum + i;
            System.out.print(sum+"\t");
        }
        System.out.println();
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(sum--);
            }
            System.out.println();
        }
    }
}