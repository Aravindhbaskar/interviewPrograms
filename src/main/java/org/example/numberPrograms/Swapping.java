package org.example.numberPrograms;

public class Swapping {
    public static void main(String[]args){
        int a=1,b=2,temp=a;

        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);

        //without 3rd container
        int c=1,d=2;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println(c);
        System.out.println(d);
    }
}
