// program showing the concept of multi dimensional array

import java.util.Scanner;
class ArrayDemo19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d array : ");
        int num = sc.nextInt();
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int col = sc.nextInt();

        int arr[][][] = new int[num][row][col];
        System.out.println("Enter array elements : ");
        for(int i=0;i<num;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("\nArray elements are : \n");
        for(int ar[][] : arr){
            for(int a[] : ar){
                for(int element : a){
                    System.out.print(element+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}

