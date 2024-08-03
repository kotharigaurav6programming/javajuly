// program showing the concept of do while loop

class Demo14{
    public static void main(String args[]){
        int i=1;
        System.out.println("Before loop");

        do{
            if(i!=3 && i!=7 && i!=8)
               System.out.println("do while loop executes "+i);
            i++;
        }while(i<=10);
        
        System.out.println("After loop");
    }
}