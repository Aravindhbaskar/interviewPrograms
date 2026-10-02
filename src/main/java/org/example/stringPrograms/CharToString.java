package org.example.stringPrograms;

public class CharToString {
    public static void main(String[] args) {
        char[] ch ={'J','A','V','A'};
        String s="";
        for (int i=0;i<ch.length;i++){
            s+=ch[i];
        }
        System.out.println(s);
    }
}
