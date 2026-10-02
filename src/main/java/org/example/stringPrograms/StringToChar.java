package org.example.stringPrograms;

public class StringToChar {
    public static void main(String[] args) {
        String s = "java";
        char[] ch = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
    }
}
