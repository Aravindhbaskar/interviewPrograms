package org.example.numberPrograms;

public class PerfectNumber {
    public static void main(String[]args){
        int given=6, sum=0;
        for (int i=1;i<given;i++){
            if (given%i==0){
                sum+=i;
            }
        }
        System.out.println(sum==given?"perfect":"not perfect");

    }
}
