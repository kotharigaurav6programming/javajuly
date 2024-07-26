// program showing the concept of switch control statement

class Demo14{
    public static void main(String args[]){
        int num = 10,i=1;
        switch(i++){
            case -3 : num++;
                        break;
            case 2 : num++;
            case 1 : --num; // 9
            case 0 : --num; // 8
            case -2 : ++num;  // 9
            default : System.out.println("Number : "+num++); // 9----->10
                        break;
        }
    }
}