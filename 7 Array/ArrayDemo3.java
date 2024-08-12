// program showing the concept of array

import java.util.Scanner;
class ArrayDemo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
        //   System.out.println("Enter "+i+" indexing element : "); 
           arr[i] = sc.nextInt();     
        }

        System.out.println("\nArray elements are : \n");
        for(int i=0;i<size;i++){
           System.out.print("\t"+arr[i]);     
        }

        System.out.println("\nSum of first and last element : "+(arr[0]+arr[size-1]));
    }
}

