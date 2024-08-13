// program showing the concept of Binary search

import java.util.Scanner;
class ArrayDemo11{
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
        
        int first = 0, last = size-1, middle = (first+last)/2;
        while(first<=last){
                 
            if(arr[middle] < element)
                first = middle+1;
            else if(arr[middle]==element){
                System.out.println("Element found at position : "+(middle+1));
                break;
            }
            else
                last = middle-1;

            middle = (first+last)/2;        
        }
        if(first>last)
            System.out.println("Element not found");
    }
}

