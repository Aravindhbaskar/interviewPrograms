package org.example.arrayPrograms;

public class Duplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 4, 4, 5, 1, 1};

        // this one useful only 2 duplicate in each number not more than that
//        for (int i = 0; i < a.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    count++;
//                    a[j] = -2;
//                }
//            }
//            if (count > 1 && a[i] != -2) {
//                System.out.println(a[i]);
//            }
//        }

        //this one good
//        boolean[] isVisited = new boolean[a.length];
//        for (int i = 0; i < a.length; i++) {
//            if (isVisited[i]) {
//                continue;
//            }
//            int count = 1;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    count++;
//                    isVisited[j] = true;
//                }
//            }
//            if (count > 1) {
//                System.out.println(a[i]);
//            }
//        }


        boolean [] visited = new boolean[a.length];
        for (int i=0;i<a.length;i++){
            if (visited[i]){
                continue;
            }
            int count=1;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                    visited[j]=true;
                }
            }

            if (count>1){
                System.out.println(a[i]);
            }
        }
    }
}
