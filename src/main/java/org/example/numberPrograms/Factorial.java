package org.example.numberPrograms;

public class Factorial {
    public static void main(String[]args){
        int given=5,fact=1;
        for (int i=1;i<=given;i++){
            fact*=i;
        }
        System.out.println("factorial of "+given+"->"+fact);
    }
}
