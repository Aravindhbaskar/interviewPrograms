package org.example.arrayPrograms;

public class EvenIndex {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40}, b = {50, 60, 70, 80};
        int[] res = new int[a.length + b.length];//10,80,20,70,30,60,40,50

        for (int i=0,j=0,k=b.length-1;i<res.length;i++){
            if(i%2==0){
                res[i]=a[j++];
            }else {
                res[i]=b[k--];
            }
            System.out.print(res[i]+",");
        }
    }
}
