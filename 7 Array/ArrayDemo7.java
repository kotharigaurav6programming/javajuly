// program to reverse an array

import java.util.Scanner;
class ArrayDemo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();     
        }
        System.out.println("\nArray elements are : \n");
        for(int i=0;i<size;i++){
           System.out.print("\t"+arr[i]);     
        }

        for(int i=0;i<size/2;i++){
            int temp = arr[i]; 
            arr[i] = arr[size-1-i];
            arr[size-1-i]=temp;
        }
        System.out.println("\nArray elements after reversing : \n");
        for(int i=0;i<size;i++){
           System.out.print("\t"+arr[i]);     
        }

    }
}

