// Program showing the concept of Predicate

import java.util.function.Predicate;
class Demo10{
    public static void main(String args[]){
        Predicate<Integer> lessThan = i -> i<10;
        Predicate<Integer> greaterThan = i -> i>10;
        Predicate<String> str = Predicate.isEqual("Hello"); 

        System.out.println("lessThan : "+lessThan.test(100));
        System.out.println("lessThan : "+lessThan.negate().test(100));

        System.out.println("and : "+lessThan.and(greaterThan).test(100));
        System.out.println("or : "+lessThan.or(greaterThan).test(100));
        System.out.println("isEqual : "+str.test("Hello"));
        System.out.println("isEqual : "+str.test("Welcome"));
    }
}