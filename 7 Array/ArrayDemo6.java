// program to find out maximum element from an array

import java.util.Scanner;
class ArrayDemo6{
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
        int max = arr[0];
        System.out.println("\nArray elements are : \n");
        for(int i=0;i<size;i++){
            if(max<arr[i])
                max=arr[i];
           System.out.print("\t"+arr[i]);     
        }

        System.out.println("\n Maximum Element : "+max);
    }
}

