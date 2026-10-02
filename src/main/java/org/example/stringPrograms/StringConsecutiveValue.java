package org.example.stringPrograms;

public class StringConsecutiveValue {
    public static void main(String[] args) {
        String s = "aaabbaac";

//  outpu
//        a:3
//        b:2
//        a:2
//        c:1
        char[] ch = s.toCharArray();
        int count = 1;
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                count++;
            } else {
                System.out.println(ch[i] + ":" + count);
                count=1;
            }
        }
        System.out.println(ch[ch.length - 1] + ":" + count);

    }
}
