package org.example.numberPrograms;

public class Prime {
    public static void main(String[]args){
        int given=5;
        boolean isPrime=true; //or else here use just string value
        if (given==0 || given==1){
            System.out.println("neither prime nor composite");
        }
        else {
            for (int i = 2; i < given; i++) {
                if (given % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? "prime" : "not prime");
        }
    }
}
