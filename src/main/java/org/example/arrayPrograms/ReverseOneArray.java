package org.example.arrayPrograms;

public class ReverseOneArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50}, b = {60, 70, 80, 90};
        int[] res = new int[a.length + b.length];//10,20,30,40,50,90,80,70,60

        for (int i = 0, m = 0, n = b.length - 1; i < res.length; i++) {
            if (m < a.length) {
                res[i] = a[m++];
            } else {
                res[i] = b[n--];
            }
            System.out.print(res[i] + ",");
        }
    }
}
