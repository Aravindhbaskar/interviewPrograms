package org.example.starPattern;

public class RightAngled {
    public static void main(String[]args){
        int n=5;

//        right angled
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i>=j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
//        right top
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i<=j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i+j<=n-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i+j>=n-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
