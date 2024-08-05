/*
    *****
    ****
    ***
    **
    *
*/

import java.util.Scanner;
class Pattern9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();

        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                //System.out.print("*");
                //System.out.print(j);
                //System.out.print(i);
                //System.out.print((char)(64+j));
                if(i==j || j==1 || i==row)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}