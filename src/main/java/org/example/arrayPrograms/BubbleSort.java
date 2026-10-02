package org.example.arrayPrograms;

public class BubbleSort {
    public static void main(String[] args) {
        int []a={1,3,7,5,1,2,9,8,6,4};

        for (int i=0;i<a.length-1;i++){

            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
//        System.out.print(a[n-1]+",");


        for (int i: a){
            System.out.print(i+",");
        }
    }
}
