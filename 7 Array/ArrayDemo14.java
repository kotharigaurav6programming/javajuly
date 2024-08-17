// program showing the concept of addition of two 2d array

import java.util.Scanner;
class ArrayDemo14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
       
        int arr1[][] = new int[row][cols];
        int arr2[][] = new int[row][cols];
        int arr3[][] = new int[row][cols];

        System.out.println("Enter first array elements : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                arr1[i][j] = sc.nextInt();     
           }     
        }
        System.out.println("Enter second array elements : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                arr2[i][j] = sc.nextInt();     
           }     
        }

        System.out.println("\nFirst Array elements are : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                System.out.print(arr1[i][j]+"\t");     
           }     
           System.out.println();
        }
        System.out.println("\nSecond Array elements are : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                System.out.print(arr2[i][j]+"\t");     
           }     
           System.out.println();
        }
        System.out.println("\nResultant Array elements are : ");
        for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+"\t");     
           }     
           System.out.println();
        }

    }
}

