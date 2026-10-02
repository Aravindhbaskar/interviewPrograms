package org.example.stringPrograms;

public class ReverseTheString {
    public static void main(String[] args) {
        String given = "hi how are you?";
        String res = "";
        String[] s = given.split(" ");

        for (int i = s.length - 1; i >= 0; i--) {
            res += s[i] + " ";
        }
        System.out.println(res);

    }
}
