// program showing the concept of for each loop

class ArrayDemo17{
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {5,6,7},
            {6,7,9}
        };
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
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