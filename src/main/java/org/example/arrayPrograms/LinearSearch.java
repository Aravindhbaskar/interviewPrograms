package org.example.arrayPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int target =320;
        String res="not found";
        for(int i=0;i<a.length;i++){
            if (a[i]==target){
                res="found";
                break;
            }

        }
        System.out.print(res);
    }
}
