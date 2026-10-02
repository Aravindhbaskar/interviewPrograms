package org.example.arrayPrograms;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] res = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--,j++) {
            res[j] = a[i];

            System.out.print(res[j] + ",");
        }
//        for(int i:res){
//            System.out.print(i+",");
//        }
    }
}
