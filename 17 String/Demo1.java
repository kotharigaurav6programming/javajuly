// program showing the concept of String

class Demo1{
    public static void main(String args[]){
        // by string literal
        String s1 = "Hello User";
        System.out.println("s1 : "+s1);

        // by new keyword
        String s2 = new String("Hello User");
        System.out.println("s2 : "+s2);

        char ch[] = {'H','E','L','L','O'};
        String s3 = new String(ch);
        System.out.println("s3 : "+s3);

        byte bt[] = {65,66,67,68,69,70};
        String s4 = new String(bt);
        System.out.println("s4 : "+s4);

    }
}