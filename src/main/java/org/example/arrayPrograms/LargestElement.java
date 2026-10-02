package org.example.arrayPrograms;

public class LargestElement {
    public static void main(String[] args) {
        int [] a ={1,2,3,57,78,7};
        int largest=a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]>=largest){
                largest=a[i];
            }
        }
        System.out.print(largest);
    }
}
