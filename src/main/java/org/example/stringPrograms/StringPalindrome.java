package org.example.stringPrograms;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="MALAYALAM";
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        System.out.println(s.equals(res)?"palindrome":"not palindrome");
    }
}
