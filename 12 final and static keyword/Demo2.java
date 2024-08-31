// program showing the conncept of final keyword

class Demo2{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println("Array elements are : ");
        for(final int element : arr){
            System.out.print(element+"\t");
        }
    }
}