// program showing the concept of class and object

class Student{
    public void showMessage(){
        System.out.println("Welcome User");
    }
    public static void main(String args[]){
        Student obj = new Student();   
        obj.showMessage();
    }
}