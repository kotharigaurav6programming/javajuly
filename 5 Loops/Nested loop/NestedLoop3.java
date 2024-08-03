// program showing the concept of nested loop in java
// jump statement - continue statement

class NestedLoop3{
    public static void main(String args[]){
        // outer loop
        for(int i=1;i<=3;i++){
            System.out.println("i : "+i);
                // inner loop
                for(int j=1;j<=3;j++){
                    if(i==2 && j==2)
                        continue;    
                    System.out.println("\tj : "+j);    
                }
        }
    }
}