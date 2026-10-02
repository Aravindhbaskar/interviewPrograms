package org.example.numberPrograms;

public class StrongNumber {
    public static void main(String[]args){
        int given =145,sum=0,last=0,temp=given;
        while(given>0){
            last=given%10;
            int fact = 1;
            for (int j=1;j<=last;j++){
             fact *=j;
            }
            sum+=fact;
            given/=10;
        }
        System.out.println(temp==sum?"Strong number":"not strong");
    }
}
