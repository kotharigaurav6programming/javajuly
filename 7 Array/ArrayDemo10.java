// program showing the concept of linear search

import java.util.Scanner;
class ArrayDemo10{
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
        System.out.println("\nEnter element to be search : ");
        int element = sc.nextInt();
        
        int i;
        for(i=0;i<size;i++){
            if(arr[i]==element){
                System.out.println("\nElement found at position "+(i+1));
                break;
            }
        }
        if(i==size)
            System.out.println("Element not found");
    }
}

