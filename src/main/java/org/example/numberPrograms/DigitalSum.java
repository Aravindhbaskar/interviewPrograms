package org.example.numberPrograms;

public class DigitalSum {
    public static void main(String []args){
        int given = 23456;
        int sum=0;
        while (given>0){
            sum+=given%10;
            given/=10;
        }
        System.out.println(sum);
    }
}
