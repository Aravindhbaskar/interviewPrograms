package org.example.arrayPrograms;

public class MergeArray {
    public static void main(String[] args) {

        //merge only half
        int a[] = {1, 2, 3, 4, 5}, b[] = {10, 9, 8, 7, 6};
        int res[] = new int[a.length / 2 + b.length / 2];//{6,7,2,1}

        for (int i = 0, j = b.length - 1, k = a.length/2-1; i < res.length; i++) {
            if(j>b.length/2 ){
                res[i]=b[j--];
            }else {
                res[i]=a[k--];
            }
            System.out.print(res[i]+",");
        }

    }
}
