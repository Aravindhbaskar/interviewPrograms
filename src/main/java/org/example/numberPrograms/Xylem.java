package org.example.numberPrograms;

public class Xylem {
    public static void main(String []args){
        int given=51332,last=0,sum=0;

        last=given%10;
        given/=10;
        while(given>9){
            sum+=given%10;
            given/=10;
        }
        last+=given;
        System.out.println(sum==last?"xylem":"not xylem");
    }
}
