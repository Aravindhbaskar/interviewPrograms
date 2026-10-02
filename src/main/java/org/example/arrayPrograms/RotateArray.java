package org.example.arrayPrograms;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};//left side move
        int n = 2;

        for (int i = 0; i < n; i++) {
            int first = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = first;
        }
        for (int i : a)
            System.out.print(i + ",");//{3,4,5,6,1,2}


        int[] b = {1, 2, 3, 4, 5, 6};//right side move
        int m = 2;
        for (int i = 0; i < m; i++) {
            int last = b[b.length - 1];
            for (int j = b.length - 1; j > 0; j--) {
                b[j] = b[j - 1];
            }
            b[0] = last;
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + ",");//{5,6,1,2,3,4}
        }
    }
}
