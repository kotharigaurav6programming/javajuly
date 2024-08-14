// program showing the concept of 2d array(sum of diagonal elements LR)

import java.util.Scanner;
class ArrayDemo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        if(row==cols){
        int arr[][] = new int[row][cols];

        System.out.println("Enter array elements : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();     
           }     
        }
        int sum=0;
        System.out.println("\nArray elements are : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                if(i==j)
                    sum=sum+arr[i][j];
                System.out.print(arr[i][j]+"\t");     
           }     
           System.out.println();
        }
           System.out.println("\nSum : "+sum);
        }else{
            System.out.println("Sum not possible");
        }        
    }
}

