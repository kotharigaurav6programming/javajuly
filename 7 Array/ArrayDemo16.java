// program showing the concept of for each loop

class ArrayDemo16{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Array elements are : ");
        for(int element : arr){
            System.out.print(element+"\t");
        }
    }
}

/*
 for each loop
---------------
for(<datatype> <variable_name> : Array | Collection){
    .....
    .....
}

*/