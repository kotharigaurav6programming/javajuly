// program showing the concept of Object class 

class Complex{
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
}
class Demo6{
    public static void main(String args[]){
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        if(c1.equals(c2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
    }
}
