package org.example.numberPrograms;

import java.awt.*;

public class PrimeRange {

    public static void main(String[] args) {

        int start = 1, end = 12;

        for (int i = start; i <= end; i++) {

            if (i <= 1) {
                System.out.println(i + " -> NP or NC");
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(isPrime ? i + "prime" : i + "not prime");
        }
    }
}

//        for (int i = start; i <= end; i++) {
//
//            if (i == 0 || i == 1) {
//                System.out.println("NP or NC");
//            } else {
//                int count = 0;
//                for (int j = 1; j <= i; j++) {
//                    if (i % j == 0) {
//                        count++;
//                    }
//                }
//                if (count == 2) {
//                    System.out.println(i + "-> is prime");
//                } else {
//                    System.out.println(i + "is not prime");
//                }
//            }
//        }

