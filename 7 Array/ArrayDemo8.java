// program to check whether entered array is a palindrome or not

import java.util.Scanner;
class ArrayDemo8{
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
        int i;
        for(i=0;i<size/2;i++){
            if(arr[i] != arr[size-1-i]){
                System.out.println("Array is not palindrome");
                break;
            }
        }
        if(i==size/2)
            System.out.println("Array is palindrome");

    }
}

