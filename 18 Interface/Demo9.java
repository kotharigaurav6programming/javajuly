// program showing the concept of anonymous class creating by interface

interface Drawable{
    int age=18;
    void getAge();
}
class Demo9{
    public static void main(String args[]){
        new Drawable(){
            @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }    
        }.getAge();
    }
}