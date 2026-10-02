package org.example.numberPrograms;

public class Factors {
    public static void main(String[]args){
        int given=8;
        for (int i=1;i<8;i++){
            if (given%i==0){
                System.out.println(i);
            }
        }
    }
}
