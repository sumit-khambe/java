package feature.java8.lambdaExpressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample {

    /**
     * Old Approach
     *
     * @param n as integer input
     * @return square value
     */
    public static int squareIt(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        System.out.println("Square of 5 is " + squareIt(5));
        /*
         * With New Function Interface
         */
        Function<Integer, Integer> squareFun = n -> n * n;
        System.out.println("Square of 5 is " + squareFun.apply(5));
        System.out.println("Square of 6 is " + squareFun.apply(6));

        /*
         *  Predicate Interface
         */
        Predicate<Integer> checkEven = n -> n % 2 == 0;
        System.out.println("Check even number is " + checkEven.test(4));

        Function<String, Integer> stringLen = String::length;
        System.out.println("String size " + stringLen.apply("Sumit Khambe"));

    }
}
