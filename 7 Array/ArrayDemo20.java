// program showing the concept of jagged array

class ArrayDemo20{
    public static void main(String args[]){
        int arr[][] = new int[5][];
        arr[0] = new int[]{1,2,3,4};
        arr[1] = new int[]{4,4,3,3,1,2,3,4};
        arr[2] = new int[]{1,2};
        arr[3] = new int[]{7,8,1,2,3,4};
        arr[4] = new int[]{1};

        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

