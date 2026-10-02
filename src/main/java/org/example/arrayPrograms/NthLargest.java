package org.example.arrayPrograms;

public class NthLargest {
    public static void main(String[] args) {
        int[] a = {1, 3, 7, 5, 2, 9, 8, 6, 4};
        int n = 3;

        //here if want large use bubble sort using a[j]<a[j+1] (descending order)
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[n-1]);

        ////here if want small use bubble sort using a[j]>a[j+1]  (ascending order)
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print(a[n-1]);
    }
}
