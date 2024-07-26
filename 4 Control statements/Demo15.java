// program showing the concept of switch control statement

class Demo15{
    public static void main(String args[]){
      char ch='a';
      switch(ch){
        case 'a' : System.out.println("It's Character");
                    break;
        case 97 : System.out.println("Ascii value");
                    break;
        default : System.out.println("default value");
                    break;
      }
    }
}