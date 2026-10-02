package org.example.stringPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Trap", s2 = "Part";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean res = true;
        if (ch1.length != ch2.length) {
            res = false;
        } else {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res ? "Anagram" : "Not Anagram");
    }
}
