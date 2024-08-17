// program showing the concept of jagged array

import java.util.Scanner;
class ArrayDemo21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();
        int arr[][] = new int[row][];

        for(int i=0;i<row;i++){
            System.out.println("Enter no. of columns for "+(i+1)+" row : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter elements for "+(i+1)+" row : ");
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

