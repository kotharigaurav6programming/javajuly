// program showing the concept of command line argument

/*
class Demo3{
    public static void main(String abc[]){
        System.out.println("No. of arguments : "+abc.length);
        for(String s : abc){
            System.out.print(s+"\t");
        }
    }
}
*/

class Demo3{
    public static void main(String abc[]){
        System.out.println("No. of arguments : "+abc.length);
        int sum=0;
        for(String s : abc){
            sum += Integer.parseInt(s);
        }
        System.out.print("sum : "+sum);
    }
}