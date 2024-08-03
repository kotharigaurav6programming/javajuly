// program showing the concept of do while loop

class Demo13{
    public static void main(String args[]){
        int i=1;
        System.out.println("Before loop");

        do{
            if(i%3==0)
                ++i;
            System.out.println("do while loop executes "+i);
            i++;
        }while(i<=10);
        
        System.out.println("After loop");
    }
}