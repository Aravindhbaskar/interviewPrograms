package org.example.stringPrograms;

public class ReverseEachWord {
    public static void main(String[] args) {

        String given = "hi how are you?", res = "";
        String[] s = given.split(" ");

        for (int i = 0; i < s.length; i++) {
            String rev = "";
            String val = s[i];
            for (int j = val.length() - 1; j >= 0; j--) {
                rev += val.charAt(j);
            }
            res += rev+" ";
        }
        System.out.println(res);
    }

}
