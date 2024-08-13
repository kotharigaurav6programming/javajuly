// program to arrange array elements in ascending order (Selection sort)

import java.util.Scanner;
class ArrayDemo9{
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
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nArray elements in ascending order : \n");
        for(int i=0;i<size;i++){
           System.out.print("\t"+arr[i]);     
        }

    }
}

