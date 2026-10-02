package org.example.starPattern;

public class Advanced {
    public static void main(String[] args) {
        int n = 6;
        int mid = n - 1;
        int clm = 2 * n - 1;

        //pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < clm; j++) {
                if (  j >= mid - i && j <= mid + i ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //inverted pyramid
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < clm; j++) {

                if (j >= mid - i && j <= mid + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

//        for(int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if ((i==j-1 && i<=(n/2)-1) || ((i+j==(n-1)-1) && (i<=(n/2)-1)) || (j==n/2 && i<=(n/2)-1)){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}
