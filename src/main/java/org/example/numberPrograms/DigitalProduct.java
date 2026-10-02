package org.example.numberPrograms;

public class DigitalProduct {
    public static void main(String[]args){

        int given =12345 , prod=1;
        while(given>0){
            prod*=given%10;
            given/=10;
        }
        System.out.println(prod);
    }
}
