// program showing the conncept of final keyword
/*
class Demo3{
    public static void main(String args[]){
        final int arr[]={1,2,3,4,5};
        arr[2] = 400;
        System.out.println("Array elements are : ");
        for(int element : arr){
            System.out.print(element+"\t");
        }
    }
}
*/

class Demo3{
    public static void main(String args[]){
        final int arr[]={1,2,3,4,5};
        int arr1[] = {11,22,33,44,55};
        arr1 = arr;
        System.out.println("Array elements are : ");
        for(int element : arr1){
            System.out.print(element+"\t");
        }
    }
}