package org.example.arrayPrograms;

public class SmallestElement {
    public static void main(String[] args) {
        int [] a ={11,22,3,57,78,7};
        int smallest=a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]<=smallest){
                smallest=a[i];
            }
        }
        System.out.print(smallest);
    }
}
