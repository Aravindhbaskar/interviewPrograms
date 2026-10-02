package org.example.stringPrograms;

import java.util.Arrays;

public class Alphabetic {

    public static void main(String[] args) {
        String s= "aebAKDhcZB";
        //output  "abcABDehKZ";

        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String lower_case="";
        String upper_case="";
        String res="";

        for (int i=0;i<ch.length;i++){
            if (ch[i]>='A'&& ch[i]<='Z'){
                upper_case+=ch[i];
            }else {
                lower_case+=ch[i];
            }
        }
        for (int i=0,j=0,k=0;i<s.length();i++){
            if (s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                res+=upper_case.charAt(j++);
            }else {
                res+=lower_case.charAt(k++);
            }
        }
        System.out.println(res);

    }
}
