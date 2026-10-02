package org.example.java8Parctise;

import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {

        Calculator add =(a,b)->a+b;
        Calculator mult=(a,b)->a*b;
        Calculator sub =(a,b)->a-b;

        System.out.println(add.calculate(1,2));
        System.out.println(mult.calculate(1,2));
        System.out.println(sub.calculate(1,2));

        Predicate<Integer> p = n ->n%2==0;
        Predicate<Integer> p2 = n ->n >10;
        System.out.println(p.test(2));
        System.out.println(p2.test(2));
        Predicate<Integer> res = p.and(p2);//like AND ,OR,NOT(neglate)
        System.out.println(res.test(20));
    }
}

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}
