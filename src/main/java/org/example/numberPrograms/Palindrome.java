package org.example.numberPrograms;

public class Palindrome {
    public static void main(String[]args){
        int  given=111,sum=0,temp=given;
        while(given>0){
            int last= given%10;
            sum= sum*10+last;
            given/=10;
        }
        System.out.println(temp==sum?"palindrom":"not palindrom");
    }
}
