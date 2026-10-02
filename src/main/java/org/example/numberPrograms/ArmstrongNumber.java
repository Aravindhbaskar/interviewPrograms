package org.example.numberPrograms;

public class ArmstrongNumber {
    public static void main(String[]args){
        int given =1634,count=0,temp=given,sum=0;
        while(given>0){
            count++;
            given/=10;
        }
        given=temp;

        while(given>0) {
            int last = given % 10;
            int pow=1;
            for (int i = 1; i <= count; i++) {
                pow *= last;
            }
            sum+=pow;
            given/=10;
        }
        System.out.println(temp==sum?"Armstrong":"Not Armstrong");
    }
}
