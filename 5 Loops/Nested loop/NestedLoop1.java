// program showing the concept of nested loop in java

class NestedLoop1{
    public static void main(String args[]){
        // outer loop
        for(int i=1;i<=3;i++){
            System.out.println("i : "+i);
                // inner loop
                for(int j=1;j<=3;j++){
                    System.out.println("\tj : "+j);    
                }
        }
    }
}